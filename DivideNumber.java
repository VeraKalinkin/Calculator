public class DivideNumber extends Action{
    String name = " / ";

    public DivideNumber(double numberOne, double numberTwo){
        super.name = name;
        super.numberOne = numberOne;
        super.numberTwo = numberTwo;
    }

    @Override
    public double action(double numberOne, double numberTwo) {
        return numberOne / numberTwo;
    }
}
