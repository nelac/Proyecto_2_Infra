/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exameninfra;

import javax.swing.JOptionPane;

/**
 *
 * @author Nela
 */
public class Procesos_1 {
    
    public ListaSimpleProceso lstProcesos=new ListaSimpleProceso();
    public ListaSimpleProceso lstImpresoras=new ListaSimpleProceso();
    
   public ListaSimpleProceso crearProceso(int cantProcesos) {
       String listadoProceso = "";
       String nombre;
       int i = 1;
       while (i <= cantProcesos) {
           nombre = JOptionPane.showInputDialog("Nombre del proceso " + i);
           if (nombre.isEmpty()) {
               int j= cantProcesos;
               JOptionPane.showMessageDialog(null,"Debe de ingresar un proceso","ERROR",JOptionPane.YES_NO_OPTION);
               crearProceso(cantProcesos);
               i=j+1;				
           }
           else{
               lstProcesos.InsertaFinal(nombre);
               listadoProceso = listadoProceso + "\nProceso No: " + i + ": "+ nombre;
               i++;
            }
        }
       System.out.println("Lista de procesos");
       lstProcesos.Imprimir();
       return lstProcesos;
    }
   
   
     public String[] Recorrer(int n,ListaSimpleProceso lstProcesos){
        //int n=cantProc.sys_productores;
        lstProcesos.Imprimir();
        NodosListaProceso aux=lstProcesos.PrimerNodo;
        int i=0;
        String[]procesos=new String[n];
        while (aux!=null){
            procesos[i]=aux.nombreProceso;
            aux=aux.siguiente;
            i++;              
        }
        return procesos;
        
    }
   
    public void crearImpresora(int cantImpresora) {
       String listadoImpresora = "";
       String nombreImp;
       int i = 1;
       while (i <= cantImpresora) {
           nombreImp = JOptionPane.showInputDialog("Nombre de la impresora " + i);
           if (nombreImp.isEmpty()) {
               int j= cantImpresora;
               JOptionPane.showMessageDialog(null,"Debe de ingresar una impresora","ERROR",JOptionPane.YES_NO_OPTION);
               crearProceso(cantImpresora);
               i=j+1;				
           }
           else{
               lstImpresoras.InsertaFinal(nombreImp);
               listadoImpresora = listadoImpresora + "\nImpresora No: " + i + ": "+ nombreImp;
               i++;
            }
        }
       System.out.println("Lista de impresoras");
       lstImpresoras.ImprimirImp();
    }
    
}