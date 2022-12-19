package task1;

public class MyThread extends Thread {

    int[] mas;
    int sum;
    int start;
    int finish;

    MyThread(int[] m, int start, int finish){

        this.mas = m;
        this.start = start;
        this.finish = finish;
    }

    @Override
    public void run()
    {
        for(int i = start; i< finish; i++)
            sum+=mas[i];
    }

    public int getSum() {
        return sum;
    }
}
