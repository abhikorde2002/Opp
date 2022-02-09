package MultiThrading;

public class Test {
    public static void main(String[] args) throws InterruptedException {
      Worker worker =new Worker();
      worker.start();
      worker.join();

      for (int i=1;i<=5;i++){
          System.out.println("Abhi");
    //      Thread.sleep(2000);
      }
    }
}
class Worker extends Thread{

    public void run(){
       for (int i=1;i<=5;i++){
           System.out.println(i);
           try {
               Thread.sleep(2000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }
}

