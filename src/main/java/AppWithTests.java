public class AppWithTests {
    public static void main(String[] args) {
       // System.out.println(isPositive(7));
    }

    public static int summation(int number1,int number2){
        return number1+number2;
    }

    public static boolean isEven(int number){
        if(number==0 || number%2==0){
            return true;
        }
        else{
        return false;
        }
    }

    public static int multiplicationSum(int number1,int number2){
        return number1*number2;
    }

    public static String toUppercase(String text){
        String x= text.toUpperCase();
        return x;
    }

    public static boolean isPositive(int number){
        if(number>0){
            return true;
        }
        else{
            return false;
        }
    }
}
