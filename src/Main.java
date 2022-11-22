import java.util.Scanner;

// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n),
// n! (произведение чисел от 1 до n)
public class Main {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число n = ");
        int n = iScanner.nextInt();
        int b = n + 1;
        int k = (n * b) / 2;
        System.out.print("Tn = ");
        System.out.print(k);
        iScanner.close();
    }
}