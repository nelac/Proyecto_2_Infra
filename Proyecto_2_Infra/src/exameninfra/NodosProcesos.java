package exameninfra;
// Clase NodosLista
class NodosProcesos {
 // datos amigables para que la Clase Lista Tenga un acceso directo
     int datos;
     NodosProcesos siguiente;

//Construtor  Crea un nodo del tipo Object
 NodosProcesos (int  valor)
  {  datos =valor;
     siguiente = null;  //siguiente con valor de nulo
  }

// Constructor Crea un nodo del Tipo Object y al siguiente nodo de la lista
NodosProcesos (int valor, NodosProcesos signodo)
{   datos = valor;
    siguiente = signodo; //siguiente se refiere al siguiente nodo
}

//Retorna el dato que se encuentra en este nodo
int getint() {return datos; }

//Retorna el siguiente nodo
NodosProcesos getnext() {return siguiente; }

};