public abstract class Action implements Operation{
    String name;
    double numberOne;
    double numberTwo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(double numberOne) {
        this.numberOne = numberOne;
    }

    public double getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(double numberTwo) {
        this.numberTwo = numberTwo;
    }
}
