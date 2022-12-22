package task2;

public class MyThread implements Runnable
{
    resource res;
    MyThread(resource res){
        this.res = res;
    }

    @Override
    public void run() {
        synchronized (res)
        {
            res.setSum(0);
            for (int i = 0; i < res.getArray().length; i++) {
                res.setSum(res.getSum()+res.getArray()[i]);
            }
            System.out.println(Thread.currentThread().getName()+ " Sum of array: " + res.getSum());
        }
    }
}
