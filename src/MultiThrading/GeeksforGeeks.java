package MultiThrading;

public class GeeksforGeeks {
    public static void main(String[] args) throws InterruptedException {
        SpaceCraft spaceCraft = new SpaceCraft();
        spaceCraft.start();
        spaceCraft.join();

        System.out.println("Countdown Completed");
    }
}
class SpaceCraft extends Thread{
    @Override
    public void run(){
        System.out.println("Count Down Begins!!!");
        for (int i=10;i>=1;i--){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
