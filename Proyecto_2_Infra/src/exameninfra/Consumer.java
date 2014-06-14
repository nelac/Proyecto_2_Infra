
package exameninfra;

class Consumer extends Thread { // implements Runnable {
    Producer producer;

    Consumer(Producer p) {
        producer = p;
    }

    //@Override
    public void run() {
        try {
            while (true) {
                String message = producer.getMessage();
                System.out.println("Got message: " + message);
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
        }
    }

    public static void main(String args[]) {
        Producer producer = new Producer();
        producer.start();
        Consumer consumer = new Consumer(producer);
        consumer.start();
    }
}