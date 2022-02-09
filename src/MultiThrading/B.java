package MultiThrading;

 class A extends Thread {
     @Override
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println("Abhi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
  class B{
      public static void main(String[] args)  throws InterruptedException{
         A t = new A();
         t.start();


          for (int i=1;i<=5;i++){
              System.out.println("Demon");
              Thread.sleep(1000);
          }
      }
  }
