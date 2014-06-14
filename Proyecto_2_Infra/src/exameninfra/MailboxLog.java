package exameninfra;

import javax.swing.*;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MailboxLog extends JFrame implements Runnable {

    public JTextAreaWithScroll textArea;
    //Comando comando=new Comando();
    //MailBox mail=new MailBox();
    //VentanaProceso p1, p2,p3,p4,p5;
    //public Proceso nombreProceso; 
    //Grupo grupo=new Grupo();
    //ListaSimpleProceso lstProcesos;

    //public MailboxLog (Proceso nomProceso)
    public MailboxLog() {
        super("MAILBOX - LOG");
        setResizable(false);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(1, 1, 442, 342);

        textArea = new JTextAreaWithScroll(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        textArea.setToolTipText("Registro de eventos de la cola de mensajes");
        textArea.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        textArea.setBackground(new Color(0, 0, 0));
        textArea.setForeground(new Color(255, 255, 255));

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        textArea.setText("Log inicializado: " + date + "\n");
        getContentPane().add(textArea.getScrollPane());

        JSplitPane splitPane = new JSplitPane();
        getContentPane().add(splitPane, BorderLayout.SOUTH);

        //setListaProc(lstProc);
        JButton btnImprimirCola = new JButton("Continuar");
        btnImprimirCola.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                setVisible(true);
    			//lstProcesos.ocultarProcesos();
                //lstProcesos.Imprimir();
    			/*NodosListaProceso aux = lstProcesos.PrimerNodo;
                 int i = 0;
                 while (aux.siguiente!=null && i<6) {
                 aux.proceso.setVisible(false);
                 i++;
                 aux=aux.siguiente;
                 }
                 aux.proceso.setVisible(false);        		
                 */
            }
        });
        btnImprimirCola.setToolTipText("Oculta las ventanas y continúa con la terminal de comandos");
        splitPane.setLeftComponent(btnImprimirCola);

        JButton btnCerrar = new JButton("Cerrar y salir del sistema");
        btnCerrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                /*INSTRUCCIONES PARA CIERRE DE TODOS LOS PROCESOS Y EL MAILBOX*/
                int reply = JOptionPane.showConfirmDialog(null, "Esta operación cerrará todos los procesos del sistema de mensajería\n"
                        + " ¿Está seguro que desea salir?\n", "Salir", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }

            }
        });
        btnCerrar.setToolTipText("Cierra todos los procesos de éste sistema");
        splitPane.setRightComponent(btnCerrar);
    }

    public void agregarEvento(String evento) {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        textArea.append("\n" + evento + "  " + date);
    }

    public void setListaProc(ListaSimpleCircular lstProc) {
        //this.lstProcesos = lstProc;
    }

    public synchronized void suspender(String proceso) throws InterruptedException {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        textArea.append("\nProceso (" + proceso + ") Bloqueado en: " + date + "");
    }

    public synchronized void reanudar(String proceso) throws InterruptedException {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        textArea.append("\nProceso (" + proceso + ") Reanudado en: " + date + "");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {

                MailboxLog frmMailboxLog = new MailboxLog();
                frmMailboxLog.setVisible(true);
                frmMailboxLog.setLocation(10, 80);

            }
        });
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        this.setVisible(true);
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        textArea.append("" + date + "\n");
    }
}

class JTextAreaWithScroll extends JTextArea {

    private JScrollPane scrollPane;

    public JTextAreaWithScroll(int vsbPolicy, int hsbPolicy) {
        scrollPane = new JScrollPane(this, vsbPolicy, hsbPolicy);
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }
}
