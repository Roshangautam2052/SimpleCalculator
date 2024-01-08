package Calculator;

public class Main {
    public static void main(String[]args){
        UserIO ui = new UserIO();
        ValueClass vc ;
        Calculator calculator = new Calculator();
        boolean flag = true;
        ui.displayMessage("*****Welcome to 2-digit Decimal Number Calculator*****");
        while(flag){
            ui.displayMessage("******Enter the digit to select the operation*****");
            ui.displayMessage("""
            1 For "Addition".
            2 For  "Subtraction".
            3 For  "Division".
            4 For  "Multiplication".
            5 For  "Absolute Difference".
            6 For  "Modulo Division".
            7 For  "Power".
            8 For  "SquareRoot"
            9 For  "Logarithm".
            10 For "Exit".
            """);

            int input = ui.takeIntegerInput("Enter your selection");
            switch(input){
                case 1:
                    vc= ui.takeInput("Enter first number", "Enter the second Number");
                    ui.displayMessage("The sum is:", calculator.addNumber(vc.getNumber1(), vc.getNumber2()));
                    break;
                case 2:
                    vc= ui.takeInput("Enter first number", "Enter the second Number");
                    ui.displayMessage("The difference is:", calculator.subtractNumber(vc.getNumber1(), vc.getNumber2()));
                    break;
                case 3:
                    vc= ui.takeInput("Enter first number", "Enter the second Number");
                    ui.displayMessage("The division is:", calculator.division(vc.getNumber1(), vc.getNumber2()));
                    break;
                case 4:
                    vc= ui.takeInput("Enter first number", "Enter the second Number");
                    ui.displayMessage("The product is:", calculator.multiply(vc.getNumber1(), vc.getNumber2()));
                    break;
                case 5:
                    vc= ui.takeInput("Enter first number", "Enter the second Number");
                    ui.displayMessage("The absolute difference sum is:", calculator.absoluteDifference(vc.getNumber1(), vc.getNumber2()));
                    break;
                case 6:
                    vc= ui.takeInput("Enter first number ", "Enter the second Number");
                    ui.displayMessage("The modulo division is:", calculator.moduloOperation(vc.getNumber1(), vc.getNumber2()));
                    break;
                case 7:
                    vc= ui.takeInput("Enter the mantissa ", "Enter the exponent");
                    ui.displayMessage("The power is: ", calculator.calculatePower(vc.getNumber1(), vc.getNumber2()));
                    break;
                case 8:
                    vc= ui.takeInput("Enter the number");
                    ui.displayMessage("The square root is: ", calculator.calculateSquareRoot(vc.getNumber1()));
                    break;
                case 9:
                    vc= ui.takeInput("Enter the number");
                    ui.displayMessage("The logarithm is: ", calculator.calculateLogarithm(vc.getNumber1()));
                    break;
                case 10:
                    flag = false;
                    ui.displayMessage("Thank you!!!");
                    break;

                default:
                    ui.displayMessage("Invalid input!!!");

            }

            }


        }

    }