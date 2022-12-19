package task1;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int[] arr = new int[]{1,2,3,9,5,6,4,1,10,12};
        int k = 3;
        int len = arr.length / k;
        int sum = 0;
        int j = 0;
        for(int i=0; i<k; i++){
            int start = j;
            int finish = j + len;
            if(i == (k-1))
                finish = arr.length;
            MyThread t = new MyThread(arr, start, finish);
            t.start();
            t.join();
            sum+=t.getSum();
            j = j + len;
        }
        System.out.println(sum);
    }
}
