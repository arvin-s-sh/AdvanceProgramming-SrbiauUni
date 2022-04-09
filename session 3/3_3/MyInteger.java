package session3_3;

public class MyInteger implements IMyInteger{
    public int num;
    public MyInteger(int num){
        this.num = num;
    }
    @Override
    public boolean isEven(int num) {
        if (isZero(num) == false){
            if (num%2 == 0){
                System.out.println("its even");
                return true;
            }
            else {
                System.out.println("its not even");
                return false;
            }
        }
        else {
            System.out.println("its not even");
            return false;
        }
    }

    @Override
    public boolean isOdd(int num) {
        if (isZero(num) == false){
            if (num%2 != 0){
                System.out.println("its odd");
                return true;
            }
            else {
                System.out.println("its not odd");
                return false;
            }
        }
        else {
            System.out.println("its not odd");
            return false;
        }
    }

    @Override
    public boolean isPositive(int num) {
        if (num >= 0){
            System.out.println("its positive");
            return true;
        }
        else {
            System.out.println("its not positive");
            return false;
        }

    }

    @Override
    public boolean isNegative(int num) {
        if (num < 0){
            System.out.println("its negative");
            return true;
        }
        else {
            System.out.println("its not negative");
            return false;
        }
    }

    @Override
    public boolean isZero(int num) {
        if (num == 0){
            System.out.println("its zero");
            return true;
        }
        else {
            return false;
        }

    }
}
