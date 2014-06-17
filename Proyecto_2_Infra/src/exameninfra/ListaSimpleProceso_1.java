/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exameninfra;

import javax.swing.JOptionPane;

public class ListaSimpleProceso_1 {
    public NodosListaProceso PrimerNodo;
    public NodosListaProceso UltimoNodo;
    int cant;


	//Constructor construye una lista vacia con un nombre s
    ListaSimpleProceso_1(){		  
    }

	//Constructor de n procesos
    ListaSimpleProceso_1(int nProcesos){
        String nombreProceso;
        cant = nProcesos;
        for (int i=1; i<nProcesos+1; i++){			  
            nombreProceso = JOptionPane.showInputDialog("Indique el Nombre para el proceso N° " + i);
            if (nombreProceso.isEmpty()) {					
                JOptionPane.showMessageDialog(null,"Debe de ingresar un nombre para el proceso","ERROR",JOptionPane.YES_NO_OPTION);
            }
            else{
                this.InsertaFinal2(i, nombreProceso);
                //listadoProceso = listadoProceso + "\nProceso No: " + i + ": "+ nombreProceso;					
            }
            nombreProceso = "";
            //this.InsertaFinal(i, "");
            }
    }
	  
    //Inserta al Final de la Lista
    public void InsertaFinal2(int idProceso, String nombreProceso)
        { if ( VaciaLista())
            PrimerNodo = new NodosListaProceso (nombreProceso);
          else{
                NodosListaProceso aux= PrimerNodo;
		while(aux.siguiente != null){
                    aux=aux.siguiente;
		}
                aux.siguiente = new NodosListaProceso (nombreProceso);
                //UltimoNodo=UltimoNodo.siguiente =new NodosListaProceso (idProceso,nombreProceso);
            }  
        }
	  
	//Retorna True si Lista Vacía
    public boolean VaciaLista () 
    {
        return PrimerNodo == null;
    }


	//Inserta un Elemento al Frente de la Lista
	//Si esta vacía PrimerNodo y UltimoNodo se refieren al nuevo nodo. Si no PrimerNodo se refiere al nuevo nodo.
    public void InsertaInicio (int idProceso, String nombreProceso, boolean recibido)
	{ 
            if (VaciaLista())
                PrimerNodo = UltimoNodo = new NodosListaProceso(nombreProceso);
            else
                PrimerNodo = new NodosListaProceso(nombreProceso,PrimerNodo );
           }


	//Inserta al Final de la Lista
	//Si la lista se encuentra vacía, el PrimerNodo y el UltimoNodo se refieren al nuevo nodo. Si no, la variable de siguiente de UltimoNodo se refiere al nuevo nodo.
        public void InsertaFinal(String nombreProceso)
	{ 
            if ( VaciaLista())
                PrimerNodo = UltimoNodo = new NodosListaProceso (nombreProceso);
            else
                UltimoNodo=UltimoNodo.siguiente =new NodosListaProceso (nombreProceso);
	}
	


	//Eliminar al Inicio
	//Debe tomar en cuenta si la lista se encuentra vacía y producir una excepción, en caso contrario si PrimerNodo y UltimoNodo referencian al mismo nodo, ambos deben ser null y sino  primernodo será igual a PrimerNodo.siguiente

		
    public boolean Buscar(String Elem){
        NodosListaProceso aux= PrimerNodo;
        boolean result=false;
	while(aux!=null){
            if (aux.nombreProceso.equals(Elem)){
                result=true;
                return result;
            }else
                aux=aux.siguiente;
            }
	return result;
		  
    }
    
 
	
   /*public boolean BuscarIntermediario(int Elem){
        NodosListaProceso aux= PrimerNodo;
	boolean result=false;
        while(aux!=null){
	if (aux.idProceso==Elem){
            result=true;
            return result;
	}else
            aux=aux.siguiente;
	}
        return result;
		  
    }*/
	
   /* public NodosListaProceso BuscarIntermediarioProceso(int Elem){
        NodosListaProceso aux= PrimerNodo;
        boolean result=false;
	while(aux!=null){
            if (aux.idProceso==Elem){
		result=true;
		return aux;
            }else
                aux=aux.siguiente;
            }
        return aux;
		  
    }*/
	
	
    public NodosListaProceso BuscarNodo(String Elem){
        NodosListaProceso aux= PrimerNodo;
	boolean result=false;
	while(aux!=null){
            if (aux.nombreProceso.equals(Elem)){
		result=true;
		return aux;
            }else
                aux=aux.siguiente;
            }
        return aux;
		  
    }

	
	
	
    public int Largo()
    {
        int contador=0;
        NodosListaProceso aux = PrimerNodo;
        while (aux!=null) {
            contador ++;
            aux=aux.siguiente;
	}
        System.out.println("El largo de la lista es: "+ contador);
	return contador;
    }
	
    public void Imprimir(){
        NodosListaProceso  aux = PrimerNodo;
	System.out.println("Nombre del proceso\n__\t__________________\n");
	while (aux!=null) {
            System.out.println(aux.nombreProceso+" ");
            aux = aux.siguiente;
	}
    }
    
     public void ImprimirImp(){
        NodosListaProceso  aux = PrimerNodo;
	System.out.println("Nombre de laimpresora\n__\t__________________\n");
	while (aux!=null) {
            System.out.println(aux.nombreProceso+" ");
            aux = aux.siguiente;
	}
    }
//Recorre la lista de procesos para ponerlos visibles 
    public void mostrarProcesos(){
	//mbLog.setBounds(1, 81, 485,347);
	//mbLog.setVisible(true);
	NodosListaProceso aux = this.PrimerNodo;
	int i = 0;
	while (aux.siguiente!=null && i<cant) {
            //aux.proceso.setVisible(true);
            i++;
            aux=aux.siguiente;
	}
            //aux.proceso.setVisible(true);
    }
    
    //recorre la lista de procesos para ponerlos invisibles
    public void ocultarProcesos(){
	//mbLog.setVisible(false);
	NodosListaProceso aux = this.PrimerNodo;
	int i = 0;
	while (aux.siguiente!=null && i<cant) {
            //aux.proceso.setVisible(false);
            i++;
            aux=aux.siguiente;
	}
	//aux.proceso.setVisible(false);
}	
	
}
