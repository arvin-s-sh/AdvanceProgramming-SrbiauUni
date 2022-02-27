import java.util.*;

class practice_3
{
    public static void main(String[] args)
    {
        System.out.println("program 3");
        System.out.println("write number 1 : ");
        String strNum1 = new Scanner(System.in).nextLine();
        float intNum1 = Integer.parseInt(strNum1);
        System.out.println("write number 2 : ");
        String strNum2 = new Scanner(System.in).nextLine();
        float intNum2 = Integer.parseInt(strNum2);

        boolean loop = true;

        while (loop)
        {
            System.out.println("select what do you want to do (+ - * /) : ");
            String action = new Scanner(System.in).nextLine();

            switch (action)
            {
                case "+":
                    System.out.println(intNum1 + intNum2);
                    break;
                case "-":
                    System.out.println(intNum1 - intNum2);
                    break;
                case "*":
                    System.out.println(intNum1 * intNum2);
                    break;
                case "/":
                    System.out.println(intNum1 / intNum2);
                    break;
            }

            System.out.println("do you want to action again (y/n) ?");
            String wh = new Scanner(System.in).nextLine();
            wh = wh.toLowerCase();
            if (wh.equals("y"))
            {
                loop = true;
            }
            if (wh.equals("n"))
            {
                loop = false;
            }

        }
    }
}