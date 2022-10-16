public class Calculator {



public static char game(){
    System.out.println("     J     A      V      V     A");
    System.out.println("     J    A A      V    V     A A");
    System.out.println(" J   J   A A A      V  V     A A A");
    System.out.println(" J J J  A     A      V      A     A ");

    return 0;
}


public static char face(){
    System.out.println("    +---------------+  ");
    System.out.println("    [               ]  ");
    System.out.println(" {  [   0       0   ]  }");
    System.out.println("    [       ^       ]  ");
    System.out.println("    [     ' _ '     ]  ");
    System.out.println("    [_______________]  ");

    return 0;


}


    public static float rest(float firstNumber, float secondNumber){
    float result = firstNumber % secondNumber;
    return result;

    }



    public static float temperature(float tempFahrenheit){
     float result =  (5/9f) * ((tempFahrenheit - 32));
     System.out.println("Temperatura in Fahrenheit este de " + tempFahrenheit + " iar in Celsius este de " + result + " grade");
     return result;

}

    public static float distance(float inchDistance){
    float result = inchDistance / 39.370f;
        System.out.println("Daca distanta in inch este de " +inchDistance + " atunci in metri distanata este de " + result);
        return result;


    }



    public static float speedTest(float meter, float hour, float minutes, float seconds ){
    float result = meter/seconds;
    System.out.println("Daca in " + seconds + " de secunde masina parcurge " + meter + " metrii, atunci viteza ei este de " + result + " metrii/secunda");


    return result;
    }



}
