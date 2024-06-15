public class SubtractNumber extends Action{
    String name = " - ";

    public SubtractNumber(double numberOne, double numberTwo){
        super.name = name;
        super.numberOne = numberOne;
        super.numberTwo = numberTwo;
    }

    @Override
    public double action(double numberOne, double numberTwo) {
        return numberOne - numberTwo;
    }
}
