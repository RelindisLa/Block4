package Rekursion;

public class DigitSumRecursiveDemo {

    public static void main(String[] args) {

        System.out.println("getDigitSum = " + getDigitSum(12));;
        System.out.println("getDigitSum2(6) = " + getDigitSum2(6));
        System.out.println("getDigitSum2(17) = " + getDigitSum2(17));
        System.out.println("getDigitSum2(234) = " + getDigitSum2(234));
        System.out.println("getDigitSum3(234) = " + getDigitSum3(234));
        System.out.println("getDigitSum3(3456) = " + getDigitSum3(3456));
        System.out.println("getDigitSum3(123456) = " + getDigitSum3(123456));

        System.out.println();
        System.out.println("power(2,5) = " + power(2,5));
        System.out.println("power2(4,5) = " + power2(4,5));

        System.out.println();
        System.out.println("multiplicate(2,3) = " + multiplicate(2,3));
        System.out.println("multiplicate(6,10) = " + multiplicate(6,10));

    }

    public static int getDigitSum(int number) {
        int sum = 0;
        while (number > 0){
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }

    public static int getDigitSum2(int number) {
        if (number < 10) {
            return number;
        }
        else {
            int lastNumber = number % 10;
            number = number / 10;
            return lastNumber + getDigitSum2(number);
        }
    }

    public static int getDigitSum3 (int number) {
        if (number < 10)
            return number;
        return number % 10 + getDigitSum3(number /10 );
    }


    public static int power(int a, int b) {
        //calculate a exp b (a hoch b) with a recursion
        if (b > 2)
            return a;
        /*{
            a = a * a;
            b--; }
         */
        return a * power(a, b-1);
    }


    public static int power2 (int a, int b) {
        if (b < 2)
            return a;
        return a * power2(a, b-1);
    }

    public static int multiplicate(int a, int b) {
        /* Multiplicate a * b, but just do it with + and recursion */
        if (a >= 1 && b >= 1 )
            return a + multiplicate(a, b-1);
        return 0;
    }
       
}
