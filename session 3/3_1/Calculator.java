package session3;


public class Calculator implements ICalculator {
    float num1;
    float num2;
    public Calculator(float num1,float num2){
        this.num1 = num1;
        this.num2 = num2;
    }


    @Override
    public float sum() {
        float sum = num1+num2;
        return sum;
    }

    @Override
    public float mines() {
        float mines = num1 - num2;
        return mines;
    }

    @Override
    public float multiple() {
        float multiple = num1 * num2;
        return multiple;
    }

    @Override
    public float devide() {
        float devide = num1 / num2;
        return devide;
    }
}
