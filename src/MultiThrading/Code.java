package MultiThrading;

 class Code implements Runnable{
    @Override
    public void run() {
       for (int i=1;i<=5;i++){
           System.out.println("Hello");
       }
    }
}
 class Jack{
    public static void main(String[] args) throws InterruptedException {
        Code Ak= new Code();
        Thread thread = new Thread(Ak);
        thread.start();


        for (int i=1;i<=5;i++){
            System.out.println("Main Thread");
        }
    }
}
