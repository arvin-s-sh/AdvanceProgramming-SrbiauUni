package session4_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws DeltaException {
        System.out.println("zarib x2 ra vared konid : ");
        String strZaribX2 = new Scanner(System.in).nextLine();
        float zaribX2 = Float.parseFloat(strZaribX2);
        System.out.println("zarib x ra vared konid : ");
        String strZaribX = new Scanner(System.in).nextLine();
        float zaribX = Float.parseFloat(strZaribX);
        System.out.println("c moadele ra vared konid : ");
        String strC = new Scanner(System.in).nextLine();
        float c = Float.parseFloat(strC);

        System.out.println("------------------------------------------");
        System.out.println("moadele be soorat zir mibashad : ");
        System.out.println("y = " + zaribX2 + "x^2 + " + zaribX + "x + " + c);
        System.out.println("------------------------------------------");

        DeltaCalc deltaCalc = new DeltaCalc(zaribX2,zaribX,c);
        if (deltaCalc.deltaCalc()<0){
            throw new DeltaException("moadele javabi nadarad !");
        }
        if (deltaCalc.deltaCalc()==0){
            System.out.println("moadele yek rishe darad : "+ (-zaribX)/(2*zaribX2));
        }
        if (deltaCalc.deltaCalc()>0){
            System.out.println("rishe 1 moadele : " + (-zaribX + Math.sqrt(deltaCalc.deltaCalc()))/2*zaribX2);
            System.out.println("rishe 2 moadele : " + (-zaribX - Math.sqrt(deltaCalc.deltaCalc()))/2*zaribX2);
        }

    }
}
