import java.util.*;

class tamrin_classi
{
    public static void main(String[] args)
    {
        System.out.println("how many numbers do you want to input ?");
        String strCount = new Scanner(System.in).nextLine();
        int intCount = Integer.parseInt(strCount);

        int[] numbers = new int[intCount];
        for (int i = 0; i < intCount; i++)
        {
            System.out.println("write number " + (i + 1) + " :");
            String strNum = new Scanner(System.in).nextLine();
            int intNum = Integer.parseInt(strNum);
            numbers[i] = intNum;
        }

        System.out.println("write your special number :");
        String SNum = new Scanner(System.in).nextLine();
        int INum = Integer.parseInt(SNum);

        System.out.println("-----------------------------------------------");

        int amount = 0;
        int falseLoop =0;

        for (int item : numbers)
        {
            if (item == INum)
            {
                System.out.println("true");
                break;
            }

        }
        for (int item : numbers)
        {
            if (item != INum)
            {
                falseLoop++;
            }

        }
        if (falseLoop == intCount){
            System.out.println("false");
        }
        for (int item : numbers)
        {
            if (item == INum)
            {
                amount++;
            }
        }
        System.out.println("numbers of your special number is : " + amount);
    }
}