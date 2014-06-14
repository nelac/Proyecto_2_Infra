/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exameninfra;

import java.util.ArrayList;

/**
 *
 * @author Benjamin Calvo
 */
public class proceso extends Frame implements Runnable {

    int id;
    ArrayList<Frame> frames_asignados;
    int puntero;
    int cantFrames;

    public proceso(int id) {
        super(id);
        this.id = id;
        puntero = 0;
        frames_asignados = new ArrayList<Frame>();
        cantFrames = 0;
    }

    public void FramesAsignados(ArrayList<Frame> framesPorAsignar) {
        this.frames_asignados = framesPorAsignar;
        puntero = 0;
        cantFrames = framesPorAsignar.size();
    }

    //proceso
    public boolean estaCargado(PaginaV pagina_virtual) {
        for (Frame frame_actual : frames_asignados) {
            if (frame_actual.pagina_cargada.id_pagina == pagina_virtual.id_pagina) {
                return true;
            }
        }
        return false;
    }

    public Frame estaCargadoFrame(PaginaV pagina_virtual) {
        for (Frame frame_actual : frames_asignados) {
            if (frame_actual.pagina_cargada.id_pagina == pagina_virtual.id_pagina) {
                return frame_actual;
            }
        }
        return null;
    }

    public Frame hayVacio() {
        for (Frame frame_actual : frames_asignados) {
            if (frame_actual.pagina_cargada == null) {
                return frame_actual;
            }
        }
        return null;
    }

    public boolean hayQueReemplazar(PaginaV pagina_virtual) {
        for (Frame frame_actual : this.frames_asignados) {
            //if (frame_actual.pagina_cargada.equals(pagina_virtual)) {}
            //if (frame_actual.pagina_cargada == pagina_virtual) {
            if (frame_actual.pagina_cargada != null) {
                if (frame_actual.pagina_cargada.id_pagina == pagina_virtual.id_pagina) {
                    return false;
                }
            }

            /*for (int i = 0; i<this.cantFrames; i ++){
             if (frames_asignados.get(i).pagina_cargada == pagina_virtual) {
             return false;
             }*/
        }
        Frame frame_disponible = hayVacio();
        if (frame_disponible != null) {
            frame_disponible.pagina_cargada = pagina_virtual;
            frame_disponible.lblPagina.setText("PV: " + pagina_virtual.id_pagina);
            frame_disponible.actualizarFrame();
            return false;
        }
        return true;
    }

    public void siguientePuntero() {
        //this.puntero = ;
        if (puntero < cantFrames) {
            puntero++;
        } else {
            puntero = 0;
        }
    }

    public void replaceFIFO(PaginaV pagina_por_reemplazar) {
        if (hayQueReemplazar(pagina_por_reemplazar)) {
            this.frames_asignados.get(puntero).pagina_cargada = pagina_por_reemplazar;
            this.frames_asignados.get(puntero).lblPagina.setText("PV: " + pagina_por_reemplazar.id_pagina);
            siguientePuntero();
        }
        this.frames_asignados.get(puntero).actualizarFrame();
    }

    public void replaceMRU(PaginaV pagina_por_reemplazar) {
        if (hayQueReemplazar(pagina_por_reemplazar)) {
            Frame aux = frames_asignados.get(0);
            Frame mas_joven = frames_asignados.get(0);
            for (Frame frame_actual : frames_asignados) {
                if (aux.modificado.compareTo(mas_joven.modificado) > 0) {
                    mas_joven = aux;
                }
            }
            mas_joven.pagina_cargada = pagina_por_reemplazar;
            mas_joven.lblPagina.setText("PV: " + pagina_por_reemplazar.id_pagina);
            mas_joven.actualizarFrame();
        }
    }

    public void replaceLRU(PaginaV pagina_por_reemplazar) {
        if (hayQueReemplazar(pagina_por_reemplazar)) {
            Frame aux = frames_asignados.get(0);
            Frame mas_viejo = frames_asignados.get(0);
            for (Frame frame_actual : frames_asignados) {
                if (aux.modificado.compareTo(mas_viejo.modificado) < 0) {
                    mas_viejo = aux;
                }
            }
            mas_viejo.pagina_cargada = pagina_por_reemplazar;
            mas_viejo.lblPagina.setText("PV: " + pagina_por_reemplazar.id_pagina);
            mas_viejo.actualizarFrame();
        }
    }

    public void replaceClock(PaginaV pagina_por_reemplazar) {
        if (hayQueReemplazar(pagina_por_reemplazar)) {
            Frame frame_actual = estaCargadoFrame(pagina_por_reemplazar);
            if (frame_actual != null) {
                frame_actual.uso = true;
                frame_actual.actualizarFrame();
            } else {
                siguientePuntero();
                frames_asignados.get(puntero).pagina_cargada = pagina_por_reemplazar;
                frames_asignados.get(puntero).lblPagina.setText("PV: " + pagina_por_reemplazar.id_pagina);
                if (puntero == 0) {
                    reiniciarBits();
                }
                frames_asignados.get(puntero).uso = true;
                frames_asignados.get(puntero).actualizarFrame();
            }
        }
    }

    public void reiniciarBits() {
        for (Frame frame_actual : frames_asignados) {
            frame_actual.uso = false;
        }
    }

    @Override
    public void run() {
        System.out.println("lol");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
