package mathClass;

public class MinAndMaxMethods{

    public static void main(String[] args) {

        int maxNumber = Math.max(80, 32); // 80

        System.out.println(maxNumber);

        int maxNumber2 = Math.max(maxNumber, 45);
        int maxNumber3 = Math.max(maxNumber, 625);

        System.out.println("maxNumber = " + maxNumber2);// 80
        System.out.println("maxNumber2 = " + maxNumber2);// 125
        System.out.println("maxNumber3 = " + maxNumber3);// 625

        int minNumber =  Math.min(80,27);
        int minNumber2 = Math.min(minNumber, 2);

        System.out.println("\nminNumber = " + minNumber);// 27
        System.out.println("\nminNumber2 =" + minNumber2); // 2


        int minOfTwoNeg = Math.min ( -40, -60);

        double maxOfTwoDecimals = Math.max(1.7, 6.5);
        double maxOfTwoDecimalNeg = Math.max( -5.4, -27.2);

        System.out.println("maxOfTwoDecimals = " + maxOfTwoDecimals); // 6.5


        /*
        Find the max value of the given numbers and print them
        * 6, 9
        * 17, 49
        * 34.2, 12.5
        * -14, -32
        * 17, 49, 125
         */


        System.out.println("Max is "+ Math.max(6,9));

        System.out.println("Max is " + Math.max(17, 49));

        System.out.println("Max is" +  Math.max(34.2, 12.5));

        System.out.println("Max is" + Math.max(-14, -32));

        System.out.println("Max is " + Math.max(Math.max(17, 49), 125));


        /*
        Find the min value of the given numbers and print them
        * 6, 9
        * 17, 49
        * 34.2, 12.5
        * -14, -32
        * 17, 49, 125
        * 45, 32, 56, 89

          Expected output:
        * min is 6
        * min is 17
        * min is 12.5
        * min is -32
        * min is 17
        * min is 32
         */

        System.out.println("Min is " + Math.max(6,9));
        System.out.println("Min is " + Math.max(17, 49));
        System.out.println("Min is " + Math.max(34.2, 12.5));
        System.out.println("Min is " + Math.max(-14, -32));
        System.out.println("Min is " + Math.max(-17, -49));
        System.out.println("min is " + Math.min(Math.min(17,49), 125));

        System.out.println("min is " + Math.min(Math.min(45,32), Math.min(56, 89)));













    }

}