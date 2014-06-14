package exameninfra;
// Clase NodosLista

import java.text.DateFormat;
import java.util.Date;
import javax.print.attribute.standard.DateTimeAtCreation;

class PaginaV {

    // datos amigables para que la Clase Lista Tenga un acceso directo

    int id_pagina;
    int tamaño;
    String modificado;
    //DateTime.now()
    //DateTime dt = DateTime.now();
    //System.out.println(" 6. " + DateFormat.getTimeInstance(DateFormat.MEDIUM).format(now));
    
    
    PaginaV siguiente;

//Construtor  Crea un nodo del tipo Object
    PaginaV(int id, int tam) {
        this.id_pagina= id;
        tamaño = tam;        
        modificado = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(new Date());
        siguiente = null;  //siguiente con valor de nulo
    }
    PaginaV(int id) {
        this.id_pagina= id;
        tamaño = 0;
        //modificado = new DateTimeAtCreation;
        siguiente = null;  //siguiente con valor de nulo
    }

    
//Retorna el dato que se encuentra en este nodo
    int getTamaño() {
        return tamaño;
    }

    
//Retorna el siguiente nodo
    PaginaV getnext() {
        return siguiente;
    }
    public String getTiempoModificacion(){
        String fecha_modificado = "";
        
        
        return fecha_modificado;    
    }
    
    public void actualizar(){
        Date now = new Date();
        if (this.modificado.compareTo(DateFormat.getTimeInstance(DateFormat.MEDIUM).format(now).toString()) > 0){
            this.modificado = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(now).toString();
        }
        else{
            System.out.println("version de page antigua");
        }
    }

};
