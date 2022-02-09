package MultiThrading;

public class ThreadJoining extends  Thread{
    @Override
    public void run(){
        for (int i=0;i<2;i++){
            try {
                Thread.sleep(500);
                System.out.println("Current Thread: " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
class C{
    public static void main(String[] args) {
        ThreadJoining t1 =new ThreadJoining();
        ThreadJoining t2 =new ThreadJoining();

        t1.start();

        try {
            System.out.println("Current Thread : "+Thread.currentThread().getName());
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();

        try{
            System.out.println("Current Thread : "+Thread.currentThread().getName());
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
