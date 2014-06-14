package exameninfra;
// Clase NodosLista
class NodosImpresoras {
 // datos amigables para que la Clase Lista Tenga un acceso directo
     String nombre_impresora;
     MailboxLog proceso_impresora;
     NodosImpresoras siguiente;

//Construtor  Crea un nodo del tipo Object
 NodosImpresoras (String  nom)
  {  nombre_impresora =nom;
     siguiente = null;  //siguiente con valor de nulo
  }
/*
// Constructor Crea un nodo del Tipo Object y al siguiente nodo de la lista
NodosImpresoras (int valor, NodosImpresoras signodo)
{   datos = valor;
    siguiente = signodo; //siguiente se refiere al siguiente nodo
} */

//Retorna el dato que se encuentra en este nodo
String getNombre() {return nombre_impresora; }

//Retorna el siguiente nodo
NodosImpresoras getnext() {return siguiente; }

};