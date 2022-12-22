package task2;

public class resource {
    private int[] array;
    private int sum;

    resource(int[] array){
        this.array = array;
        this.sum = 0;
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
