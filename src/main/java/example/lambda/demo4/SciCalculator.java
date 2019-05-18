package example.lambda.demo4;

public class SciCalculator {
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public SciCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int invokeCalc(Calculator calculator){
        return calculator.calc(a,b);
    }
}
