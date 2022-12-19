package task2;

public class resource {
    private int[] array;
    private int sum;

    resource(int[] array){
        this.array = array;
        this.sum = 0;
    }
    public void calc_sum(){
        this.sum = 0;
        for (int j : this.array) this.sum += j;
    }

    public int getSum() {
        return sum;
    }

    public int[] getArray() {
        return array;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }


}
