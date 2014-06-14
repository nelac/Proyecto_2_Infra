/*
Instituto Tecnológico de Costa Rica
Administración en Tecnologías de Información
Escuela de Ingeniería en Computación

Infraestructura Tecnológica I
Examén Práctico #2
Manejo de Memoria Virtual

Integrantes:
    Benjamín Calvo de León
    Alexander Durán Martínez
    Jose Pablo Matamoros Moya
    Víctor Vargas Ramírez
 */

package exameninfra;

import static java.lang.Thread.sleep;
import java.util.ArrayList;

/**
 *
 * @author Benjamin Calvo
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        /*int cantProcesos;
        cantProcesos =3;
        proceso p1;&
        Thread t1 = new Thread(p1=new proceso());
        //t1.start();
        ArrayList <proceso> pr = new ArrayList<>();        
        pr.add(p1);
        
        for (proceso proceso_actual : pr){
             Thread t = new Thread()
             proceso_actual;
        }*/
        
        Administrativo admin = new Administrativo();
        admin.setVisible(true);
        
        
        
        //MSecundaria ms = new MSecundaria(64);
        //ms.ImprimirPaginas();
        /*
        MPrimaria mp = new MPrimaria();
        //cargar info de dos procesos
        proceso p1 = new proceso(5);
        mp.setFramesFirstAvailable(6, 5);
        p1.FramesAsignados(mp.FramesAsignados(5));
        mm.setVisible(true);
        
        
        
        p1.replaceMRU(new PaginaV(1));
        Thread.sleep(1000);
        p1.replaceMRU(new PaginaV(2));
        Thread.sleep(1000);
        p1.replaceMRU(new PaginaV(3));
        Thread.sleep(1000);
        p1.replaceMRU(new PaginaV(4));
        Thread.sleep(1000);
        p1.replaceMRU(new PaginaV(5));
        Thread.sleep(1000);
        p1.replaceMRU(new PaginaV(6));
        Thread.sleep(1000);
        p1.replaceMRU(new PaginaV(7));
        Thread.sleep(1000);
        p1.replaceMRU(new PaginaV(7));
        Thread.sleep(1000);
        p1.replaceMRU(new PaginaV(8));
        Thread.sleep(1000);
        p1.replaceMRU(new PaginaV(7));
        Thread.sleep(1000);
        p1.replaceMRU(new PaginaV(3));
        Thread.sleep(1000);
        p1.replaceMRU(new PaginaV(9));
        Thread.sleep(1000);
        p1.replaceMRU(new PaginaV(10));
        Thread.sleep(1000);
        p1.replaceMRU(new PaginaV(12));
        Thread.sleep(1000);
        p1.replaceMRU(new PaginaV(7));
        
        
        proceso p2 = new proceso(99);
        mp.setFramesFirstAvailable(8, 99);
        p2.FramesAsignados(mp.FramesAsignados(99));
        Thread.sleep(1000);
        p2.replaceLRU(new PaginaV(10));
        Thread.sleep(1000);
        p2.replaceLRU(new PaginaV(1));
        Thread.sleep(1000);
        p2.replaceLRU(new PaginaV(8));
        Thread.sleep(1000);
        p2.replaceLRU(new PaginaV(3));
        Thread.sleep(1000);
        p2.replaceLRU(new PaginaV(5));
        Thread.sleep(1000);
        p2.replaceLRU(new PaginaV(2));
        Thread.sleep(1000);
        p2.replaceLRU(new PaginaV(10));
        Thread.sleep(1000);
        p2.replaceLRU(new PaginaV(18));
        Thread.sleep(1000);
        p2.replaceLRU(new PaginaV(21));
        Thread.sleep(1000);
        p2.replaceLRU(new PaginaV(6));
        Thread.sleep(1000);
        p2.replaceLRU(new PaginaV(10));
        Thread.sleep(1000);
        p2.replaceLRU(new PaginaV(19));
        Thread.sleep(1000);
        p2.replaceLRU(new PaginaV(20));
        Thread.sleep(1000);
        p2.replaceLRU(new PaginaV(47));
        Thread.sleep(1000);
        p2.replaceLRU(new PaginaV(55));
        Thread.sleep(1000);
        p2.replaceLRU(new PaginaV(19));
        Thread.sleep(1000);
        p2.replaceLRU(new PaginaV(10));
        
        proceso p3 = new proceso(12);
        mp.setFramesFirstAvailable(14, 12);
        p3.FramesAsignados(mp.FramesAsignados(12));
        
        proceso p4 = new proceso(1);
        mp.setFramesFirstAvailable(6, 1);        
        p4.FramesAsignados(mp.FramesAsignados(1));                
        
        p4.replaceClock(new PaginaV(1));
        Thread.sleep(1000);
        p4.replaceClock(new PaginaV(2));
        Thread.sleep(1000);
        p4.replaceClock(new PaginaV(3));
        Thread.sleep(1000);
        p4.replaceClock(new PaginaV(4));
        Thread.sleep(1000);
        p4.replaceClock(new PaginaV(5));
        Thread.sleep(1000);
        p4.replaceClock(new PaginaV(6));
        Thread.sleep(1000);
        p4.replaceClock(new PaginaV(7));
        Thread.sleep(1000);
        p4.replaceClock(new PaginaV(7));
        Thread.sleep(1000);
        p4.replaceClock(new PaginaV(6));
        Thread.sleep(1000);
        p4.replaceClock(new PaginaV(8));
        
        
        */
    }
    
}
