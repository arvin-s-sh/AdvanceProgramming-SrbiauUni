package practice_3;


public class equation {
    public float zaribX;
    public float zaribY;
    public float ansewr;
    public equation(float zaribX,float zaribY, float ansewr){
        this.zaribX =zaribX;
        this.zaribY = zaribY;
        this.ansewr = ansewr;
    }
    public void solve(){

    }
    public static void calculate(float x1 ,float y1 , float ans1,float x2 ,float y2 , float ans2){
        float x ;
        float y ;
        x=  ( ans1*y2 - y1*ans2 ) / ( x1*y2 - y1*x2 );
        y=  ( x1*ans2 - ans1*x2 ) / ( x1*y2 - y1*x2 );
        if (x == 0){
            System.out.println("dastgah ghabel hal nemibashad !");
        }
        else if (y == 0){
            System.out.println("dastgah ghabel hal nemibashad !");
        }
        else {
            System.out.println("x = "+x);
            System.out.println("y = "+y);
        }

    }

}
