/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Proyecto2;

public class NodosListaProceso {
	//datos amigables para que la Clase Lista Tenga un acceso directo
    //public int idProceso;
    public String nombreProceso;
   // public VentanaProceso proceso; //contiene la ventanaProceso
    public ListaSimpleProceso listaAsociacion = new ListaSimpleProceso();
    public NodosListaProceso siguiente;
    

//Construtor  Crea un nodo del tipo Object
    NodosListaProceso (String nomProceso){
   	//Thread tr = new Thread(proceso = new VentanaProceso(nomProceso));
	//tr.start();
	//proceso.setVisible(false);	
	//idProceso =id;
 	nombreProceso = nomProceso;
    //siguiente = null;  //siguiente con valor de nulo
 	/*switch(id){
	case 1:	
		proceso.setBounds(486, 81, 485, 347);
		//proceso.lblNombrePro.setText(nomProceso);
		break;
	case 2:
		proceso.setBounds(971, 81, 485, 347);
		//proceso.lblNombrePro.setText(nomProceso);
		break;
	case 3:
		proceso.setBounds(1, 430, 485, 347);	
		//proceso.lblNombrePro.setText(nomProceso);
		break;
	case 4:
		proceso.setBounds(485, 430, 485, 347);
		//proceso.lblNombrePro.setText(nomProceso);
		break;
	case 5:
		proceso.setBounds(970, 430, 485, 347);
		//proceso.lblNombrePro.setText(nomProceso);
		break;
	default:
			System.out.print("NOTA: La ventana para el proceso "+id+" no será visualizada en pantalla\n");
			break;				
 	}
                */
 }

//Constructor Crea un nodo del Tipo Object y al siguiente nodo de la lista
    NodosListaProceso (String valor1, NodosListaProceso signodo)
{   //idProceso =valor;
	nombreProceso = valor1;
	siguiente = signodo; //siguiente se refiere al siguiente nodo
}


}
