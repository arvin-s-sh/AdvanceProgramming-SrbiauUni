package session6_2;

public class CarFactory {
    public ICar getCar(String car){
        if (car.equals("Benz")){
            return new Benz();
        }
        else if (car.equals("Bmw")){
            return new Bmw();
        }
        else {
            return new Peugeot();
        }
    }
}
