package exameninfra;

class Main2 {

    public static void main(String[] args) {

        VentanaProceso vp ;
        MailboxLog mbl;
        Thread t1 = new Thread(vp = new VentanaProceso("1"));
        Thread t2 = new Thread(mbl = new MailboxLog());
        t1.start();
        t2.start();
        
        ListaProcesos NuevaLista = new ListaProcesos();

    }

};
