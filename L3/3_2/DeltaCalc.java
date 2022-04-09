package session4_2;

public class DeltaCalc {
    float x2;
    float x;
    float c;
    public DeltaCalc(float x2,float x,float c){
        this.x2 = x2;
        this.x = x;
        this.c = c;
    }
    public float deltaCalc(){
        float delta = (x*x - (4*x2*c));
        return delta;
    }
}
