package threads;

public class MyThread extends Thread{
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i=0;i<2000;i++){
            System.out.printf("Thread %s: %d%n",name,i);
        }
    }

    public static void main(String[] args) {
        System.out.println("Main thread!");
        MyThread myThread=new MyThread("Naimi");
        MyThread myThread1=new MyThread("Eltoni");

        myThread.start();
        myThread1.start();

    }
}
