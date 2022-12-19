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
            res.calc_sum();
            System.out.println(Thread.currentThread().getName()+ " Sum of array: " + res.getSum());
        }
    }
}
