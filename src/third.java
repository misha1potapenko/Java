import java.util.Scanner;

// Реализовать простой калькулятор
public class third {
    public static void main(String[] args) {
        try {

            System.out.print("Введите первое число = ");
            Scanner firstNum = new Scanner(System.in);
            double first = firstNum.nextDouble();
            System.out.print("Введите действие (- + / *): ");
            Scanner doNum = new Scanner(System.in);
            String doNumFor = doNum.nextLine();
            System.out.print("Введите второе число = ");
            Scanner secondNum = new Scanner(System.in);
            double second = secondNum.nextDouble();
            if (doNumFor.equals("+")) {
                double result = first + second;
                String str = String.format("%s+%s=",first,second);
                System.out.print(str);
                System.out.println(result);
            }
            if (doNumFor.equals("-")) {
                double result = first - second;
                String str = String.format("%s-%s=",first,second);
                System.out.print(str);
                System.out.println(result);
            }
            if (doNumFor.equals("/")) {
                double result = first / second;
                String str = String.format("%s-%s=",first,second);
                System.out.print(str);
                System.out.println(result);

            }
            if (doNumFor.equals("*")) {
                double result = first * second;
                String str = String.format("%s-%s=",first,second);
                System.out.print(str);
                System.out.println(result);
            }
            else System.out.println("Вы ввели не корректно, попробуйте снова");
        }
        catch (Exception e) {
            System.out.print("Вы не корректно ввели значение, попробуйте снова");
        }
    }
}
