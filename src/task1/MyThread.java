package task1;

public class MyThread extends Thread {

    private int[] mas;
    private int sum;
    private int start;
    private int finish;

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
        System.out.println(this.getName() + " "+sum);
    }

    public int getSum() {
        return sum;
    }
}
