public class CalculationController {

    public void multiply(double number1, double number2){
        MultiplyNumber multiplyNumber = new MultiplyNumber(number1, number2);
        printResult(multiplyNumber);
    }

    public void add(double number1, double number2){
        AddNumber addNumber = new AddNumber(number1, number2);
        printResult(addNumber);
    }

    public void divide(double number1, double number2){
        DivideNumber divideNumber = new DivideNumber(number1, number2);
        printResult(divideNumber);
    }

    public void subtract(double number1, double number2){
        SubtractNumber subtractNumber = new SubtractNumber(number1, number2);
        printResult(subtractNumber);
    }

    private void printResult(Action action){
        System.out.println(action.getNumberOne() + action.getName() + action.getNumberTwo() + " =");
        System.out.println(action.action(action.getNumberOne(), action.getNumberTwo()));
    }

}
