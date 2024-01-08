package Calculator;
import java.util.Scanner;

public class UserIO {
    private Scanner sc = new Scanner(System.in);

    public void displayMessage(String message){
        System.out.println(message);
    }
    public void displayMessage(String message, float number){
        System.out.println(message + number);
    }
    public int takeIntegerInput(String message){
        displayMessage(message);
        int userSelection = sc.nextInt();
        sc.close();
        return userSelection;

    }
    public ValueClass takeInput(String message1, String message2){
        displayMessage(message1);
        float firstNumber = sc.nextFloat();
        displayMessage(message2);
        float secondNumber = sc.nextFloat();
        sc.close();
        return new ValueClass(firstNumber, secondNumber);
    }
    public ValueClass takeInput(String message){
        displayMessage(message);
        float number = sc.nextFloat();
        sc.close();
        return new ValueClass(number);
    }



}