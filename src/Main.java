public class Main {


    public static void main(String[] args) {

        System.out.println("Hello world!");

        myName("Fanuela");
        myAge(26);


        sum(3,4);
        System.out.println("Rezultatul adunarii este " + sum(3,4));

        diference(6,4);
        System.out.println("Rezultatul scaderii este " + diference(6,4));

        multiplication(5,6);
        System.out.println("Rezultatul inmultirii este " + multiplication(5,6));

        divide(60,5);
        System.out.println("Rezultatul impartirii este " + divide(60,5));

        Calculator.game();

        average(4,5,6);
        System.out.println("Media celor trei numere este " + average(4,5,6));

        Calculator.face();

        Calculator.rest(7,5);
        System.out.println("Restul impartirii dintre cele doua numere este " + Calculator.rest(7,5));

        Calculator.temperature(90);

        Calculator.distance(50);

        Calculator.speedTest(60,0,0,40);









    }

    public static void myName(String a){
        System.out.println("Numele meu este " + a);

    }

    public  static void  myAge(int b){
        System.out.println("Daniel are " + b + " de ani");

    }


    public static int sum(int firstNumber, int secondNumber){
        int result = firstNumber + secondNumber;
        return result;


    }

    public static int diference(int firstNumber, int secondNumber){
        int result =  firstNumber - secondNumber;
        return result;

    }

    public static int multiplication(int firstNumber, int secondNumber){
        int result = firstNumber * secondNumber;
        return result;

    }

    public static int divide(int firstNumber, int secondNumber){

        int result = firstNumber / secondNumber;
        return result;


    }

    public static int average(int firstNumber, int secondNumber, int thirdNumber){
        int result = (firstNumber + secondNumber + thirdNumber) / 3;
        return result;


    }




}