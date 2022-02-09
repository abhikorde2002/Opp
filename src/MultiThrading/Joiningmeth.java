package MultiThrading;

public class Joiningmeth {
    public static void main(String[] args) throws InterruptedException {
       Note note = new Note();
       Note note1=new Note();
       Note note2=new Note();

       note.setName("thread 1");
       note1.setName("Thread 2");
       note2.setName("Thread 3");

       note1.start();

       note1.join();

       note.start();
       note2.start();
        String name = Thread.currentThread().getName();
        for (int i=1;i<=3;i++){
            System.out.println(name);
        }
    }

}
class Note extends Thread{
    @Override
    public void run() {
       String name = Thread.currentThread().getName();
       for (int i=1;i<=3;i++){
           System.out.println(name);
       }
    }
}


