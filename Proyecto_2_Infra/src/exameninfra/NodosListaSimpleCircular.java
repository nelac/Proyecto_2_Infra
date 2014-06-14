package exameninfra;
// Clase NodosLista
class NodosListaSimpleCircular {
 // datos amigables para que la Clase Lista Tenga un acceso directo
     int datos;
     NodosListaSimpleCircular siguiente;

//Construtor  Crea un nodo del tipo Object
 NodosListaSimpleCircular (int  valor)
  {  datos =valor;
     siguiente = null;  //siguiente con valor de nulo
  }

// Constructor Crea un nodo del Tipo Object y al siguiente nodo de la lista
NodosListaSimpleCircular (int valor, NodosListaSimpleCircular signodo)
{   datos = valor;
    siguiente = signodo; //siguiente se refiere al siguiente nodo
}

//Retorna el dato que se encuentra en este nodo
int getint() {return datos; }

//Retorna el siguiente nodo
NodosListaSimpleCircular getnext() {return siguiente; }

};