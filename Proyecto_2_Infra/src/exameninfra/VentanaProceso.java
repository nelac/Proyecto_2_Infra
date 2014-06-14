package exameninfra;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridBagLayout;

import javax.swing.JSeparator;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JList;
import javax.swing.JTree;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Color;

import javax.swing.ButtonGroup;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.GridLayout;


//public class VentanaProceso extends JFrame implements Runnable{
public class VentanaProceso extends JFrame implements Runnable{

	//public JFrame appFrame;
	public Thread someThread;

	private JPanel contentPane;
	public String nomProceso; 
	public int ejex, ejey;
	public JTextAreaWithScroll textAreaProceso;
	public JLabel lblNombrePro;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaProceso frame = new VentanaProceso();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/
	public static void main(String[] args) {
    	try {
    		Thread r2 = new Thread (new  VentanaProceso("Nproceso"));
//        	r1. start ();
        	r2.start ();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
	/**
	 * Create the frame.
	 */	
	public VentanaProceso(String nombre) {
		setResizable(false);
		setTitle("Proceso Mensajero");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ejex = 1; ejey = 82;
		setBounds(ejex, ejey, 485, 347);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		getContentPane().setBackground(new Color(238, 232, 170));
		
		JPanel pnlDireccionamiento = new JPanel();
		pnlDireccionamiento.setBackground(new Color(240, 230, 140));
		pnlDireccionamiento.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Registro de eventos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 0, 0)));
		pnlDireccionamiento.setBounds(0, 36, 469, 273);
		contentPane.add(pnlDireccionamiento);
		pnlDireccionamiento.setLayout(new GridLayout(0, 1, 0, 0));
		
		textAreaProceso = new JTextAreaWithScroll (JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
    	JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		textAreaProceso.setColumns(1);
		textAreaProceso.setRows(1);
		textAreaProceso.setToolTipText("Log de este proceso");
		textAreaProceso.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		textAreaProceso.setBackground(new Color(0, 0, 0));
		textAreaProceso.setForeground(new Color(255, 255, 255));
		//textAreaProceso.setText("Log inicializado: "+ date +"\n" );   
		textAreaProceso.setText("Log inicializado: " );
		pnlDireccionamiento.add (textAreaProceso.getScrollPane());
		
		JLabel lblNombreUsuario = new JLabel("Nombre del proceso: ");
		lblNombreUsuario.setToolTipText("N\u00FAmero de \u00E9ste proceso");
		lblNombreUsuario.setBounds(12, 11, 130, 14);
		contentPane.add(lblNombreUsuario);
		
		JLabel label = new JLabel("");
		label.setBounds(127, 41, 46, 14);
		contentPane.add(label);
		JLabel lblNombrePro = new JLabel(nombre);
		lblNombrePro.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNombrePro.setToolTipText("Nombre de \u00E9ste proceso");
		lblNombrePro.setBounds(164, 0, 130, 25);
		contentPane.add(lblNombrePro);
		setVisible(true);
	}

		//pnlLog.add (textAreaProceso);  
		
		
	public void agregarEvento (String evento){
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		Date date = new Date();		
    	textAreaProceso.append("\n"+evento+"  "+ date);
    }
	public synchronized void suspender() throws InterruptedException {
		//wait();	
		Thread.sleep(1500);
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		Date date = new Date();		
		textAreaProceso.append("\nBloqueado en: "+date+"");
	}
	public synchronized void reanudar() throws InterruptedException {
		notify();		
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		Date date = new Date();		
		textAreaProceso.append("\nReanudado en: "+date+"");
	}
	public synchronized void esperar() throws InterruptedException {
		wait();	
		//Thread.sleep(1500);
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		Date date = new Date();		
		textAreaProceso.append("\nBloqueado en: "+date+"");
	}
	
	
	//private synchronized void putMessage(String message, int prioridad, String emisor,String receptor, ListaSimpleCola cola, ListaSimple config) throws InterruptedException {		 
        private synchronized void putMessage(int num) throws InterruptedException {		 
        //while (cola.llena() == true)  
		switch(num){
			case 1:{ //BLOCKING
				//System.out.print("\t\tReceive: Blocking\n");
				wait();
				System.out.print("\t\tSend: Blocking\n");
				//cola.InsertaFinal(message, prioridad, this.nomProceso, receptor);//.addElement(new java.util.Date().toString());
		        notify();
				break;}
			case 0: //NON-BLOCKING
				System.out.print("\t\tSend: Non-Blocking\n");
				break;
			default: 	     	
	 			break;				
			}
        wait(); 
        //cola.InsertaFinal(message, prioridad, this.nomProceso, receptor);//.addElement(new java.util.Date().toString());
        notify();
    }
 
    // Called by Consumer
    //public synchronized void getMessage(ListaSimpleCola cola, String pReceptor, ListaSimple config) throws InterruptedException {
        public synchronized void getMessage(int num) throws InterruptedException {
        notify();
        while (num!=0)
            wait();
        //caso FIFO
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		Date date = new Date();
                /*
		NodosListaCola aux = cola.PrimerNodo;
		while (aux.siguiente != null){
			if (aux.receptor == pReceptor){
				textAreaProceso.append("\nRecibido mensaje de :"+aux.emisor+",\n\tMensaje: "+aux.mensaje+"  "+ date); //String message = (String) messages.firstElement();
				System.out.println("\nRecibido mensaje de :"+aux.emisor+",\n\tMensaje: "+aux.mensaje+"  "+ date);
				//cola.eliminarMensaje(String receptor);
			}
		}
		if (aux.receptor == pReceptor){
			textAreaProceso.append("\nRecibido mensaje de :"+aux.emisor+",\n\tMensaje: "+aux.mensaje+"  "+ date); //String message = (String) messages.firstElement();
			System.out.println("\nRecibido mensaje de :"+aux.emisor+",\n\tMensaje: "+aux.mensaje+"  "+ date);
			//cola.eliminarMensaje(String receptor);
		}*/
    }

	@Override
	public void run() {
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		Date date = new Date();		
		textAreaProceso.append(date+"");	    	
//	    	int i =0;
//	    	while(i<3){	    		
//				Date date2 = new Date();		
//		    	textAreaProceso.append(date2+"\n     Listo.");
//		    	Thread.sleep (1000);
//		    	i++;
//	    	}
		textAreaProceso.append("\nEsperando...\n");
	}
}
