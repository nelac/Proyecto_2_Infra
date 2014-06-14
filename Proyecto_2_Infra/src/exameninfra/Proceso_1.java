package exameninfra;
import javax.swing.JOptionPane;

public class Proceso_1 {
	/*
	public ListaSimpleProceso lstProcesos = new ListaSimpleProceso();
	public ListaSimpleProceso listaAsociacion = new ListaSimpleProceso();

	public void crearProceso(ListaSimple listaConfiguracion) {
		String listadoProceso = "";
		String nombre;
		int i = 1;
		while (i <= listaConfiguracion.PrimerNodo.cantProceso) {
			nombre = JOptionPane.showInputDialog("Nombre del proceso " + i);
			if (nombre.isEmpty()) {
				int j= listaConfiguracion.PrimerNodo.cantProceso;
				JOptionPane.showMessageDialog(null,"Debe de ingresar un proceso","ERROR",JOptionPane.YES_NO_OPTION);
				crearProceso(listaConfiguracion);
				i=j+1;				
			}
			else{
				lstProcesos.InsertaFinal(i, nombre,false);
				listadoProceso = listadoProceso + "\nProceso No: " + i + ": "+ nombre;
				i++;
			}
		}
		System.out.println("Lista de procesos");
		lstProcesos.Imprimir();
	}

	public void Intermediario (){
		String listado = "";
		int identificador;
		String proceso;
		try {
			identificador = Integer.parseInt(JOptionPane.showInputDialog("Numero del identificador"));
			if (listaAsociacion.BuscarIntermediario(identificador)==false){
				proceso=JOptionPane.showInputDialog("Nombre del proceso asociado");
				if (lstProcesos.Buscar(proceso)==true) 
					listaAsociacion.InsertaFinal(identificador, proceso,false);
				else{
					JOptionPane.showMessageDialog(null,"El proceso no existe","ERROR",JOptionPane.YES_NO_OPTION);
					Intermediario();
				}
				
			}else{
				JOptionPane.showMessageDialog(null,"El identificador ya existe","ERROR",JOptionPane.YES_NO_OPTION);
				Intermediario();
			}
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"El identificador debe de ser numerico","ERROR",JOptionPane.YES_NO_OPTION);
			Intermediario();
		}
		
		
		
		
		
		
	}
        */

}
