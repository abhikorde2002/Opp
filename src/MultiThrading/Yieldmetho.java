package MultiThrading;

public class Yieldmetho {
    public static void main(String[] args) {
        thread1 t = new thread1();
        thread2 t1= new thread2();

        t.start();
        t1.start();
    }

}
class thread1 extends  Thread{
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i=1;i<=3;i++){
            System.out.println(name);
            Thread.yield();
        }
    }
}
class thread2 extends  Thread {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 1; i <= 3; i++) {
            System.out.println(name);
        }
    }
}