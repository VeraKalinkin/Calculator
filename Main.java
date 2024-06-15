import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int numberOne = scan.nextInt();
        System.out.println("Выберете операцию:");
        System.out.println("1 - Сложение");
        System.out.println("2 - Вычитание");
        System.out.println("3 - Умножение");
        System.out.println("4 - Деление");
        int operation = scan.nextInt();
        System.out.println("Введите второе число: ");
        int numberTwo = scan.nextInt();
        scan.close();

        CalculationController controller = new CalculationController();
        switch (operation){
            case 1:
                controller.add(numberOne, numberTwo);
                break;
            case 2:
                controller.subtract(numberOne, numberTwo);
                break;
            case 3:
                controller.multiply(numberOne, numberTwo);
                break;
            case 4:
                controller.divide(numberOne, numberTwo);
                break;
        }

        }
}