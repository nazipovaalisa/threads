package task2;

public class Main
{
    public static void main(String[] args) throws InterruptedException {

        int[] arr = new int[] {5, 1, 2, 6, 9, 10};
        resource res = new resource(arr);
        for (int i = 0; i < 2; i++){
            Thread t = new Thread(new MyThread(res));
            t.setName("Thread "+ i);
            t.start();
        }
    }
}