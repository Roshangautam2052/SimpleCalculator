package Calculator;
import java.lang.Math;


public class Calculator {

    public float addNumber(float number1, float number2){
        return number1+ number2;
    }

    public float subtractNumber(float number1, float number2){
        return number1- number2;
    }
    public float multiply(float number1, float number2){
        return number1*number2;
    }

    public float absoluteDifference(float number1, float number2){
        return Math.abs(number1- number2);
    }
        public float division(float number1, float number2){
        float division= 0;
        try{
            ValidateInput(number2);
             division = number1/number2;
        }
        catch(IllegalArgumentException e){
            System.out.println("Error!!!"+ e.getMessage());
        }
        return division;

        }

    public float moduloOperation(float number1, float number2) {
        return number1%number2;
    }

    public float calculatePower(float number1, float number2){
        return (float)(Math.pow(number1, number2));
    }

    public float calculateSquareRoot(float number1){
        return (float)Math.sqrt(number1);
    }
    public float calculateLogarithm(float number1){
        return (float)Math.log(number1);
    }
    public static void ValidateInput(float validationInput){
        if(validationInput ==0)
            throw new IllegalArgumentException("Division by zero is not possible");
    }

}

