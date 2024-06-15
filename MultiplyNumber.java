public class MultiplyNumber extends Action{
    String name = " * ";

    public MultiplyNumber(double numberOne, double numberTwo){
        super.name = name;
        super.numberOne = numberOne;
        super.numberTwo = numberTwo;
    }

    @Override
    public double action(double numberOne, double numberTwo) {
        return numberOne * numberTwo;
    }
}
