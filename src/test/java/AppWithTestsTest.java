import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class AppWithTestsTest {

    @Test
    void returnSumm_ofTwoNumbers() {
        //GIVEN
        int number1=1, number2=2;
        //WHEN
        int  actual= AppWithTests.summation(number1,number2);
        //THEN
        int expected = 3;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void returnTrue_whenNumberIsEven(){
        //GIVEN
         int number=2;
        //WHEN
         boolean actual= AppWithTests.isEven(number);
        //THEN
        boolean expected = true;
        Assertions.assertEquals(expected,actual);

    }

    @Test
    void returnMulti_ofTwoNumbers(){
        //GIVEN
        int number1=3;
        int number2=2;
        //WHEN
        int actual= AppWithTests.multiplicationSum(number1,number2);
        //THEN
        int expected = 6;
        Assertions.assertEquals(expected,actual);

    }

    @Test
    void returnWorld_InCapitalLetters(){
        //GIVEN
        String text="Diana";
        //WHEN
        String actual= AppWithTests.toUppercase(text);
        //THEN
        String expected = "DIANA";
        Assertions.assertEquals(expected,actual);

    }

    @Test
    void returnTrue_whenNumberIsPositive(){
        //GIVEN
        int number=-3;
        //WHEN
        boolean actual= AppWithTests.isPositive(number);
        //THEN
        boolean expected = false;
        Assertions.assertEquals(expected,actual);

    }
}