package Calculator;

public class ValueClass {
    private float number1;
    private float number2;

    ValueClass(float number) {
     this.number1 = number;
    }

    ValueClass(float number1, float number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    public float getNumber1(){
        return number1;
    }

    public float getNumber2(){
        return number2;
    }

}