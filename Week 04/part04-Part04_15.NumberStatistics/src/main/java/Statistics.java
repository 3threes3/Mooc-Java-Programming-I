
public class Statistics {

    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        this.count++;
        this.sum = this.sum + number;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        if (count < 1) {
            return 0;
        } else {
            double average = 0;
            average = 1.0 * sum / count;
            return average;
        }
    }

    public int getCount() {
        return this.count;
    }

}
