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
        System.out.println(k);
        int forFacktor = 1;
        for (int i = 1; i < n + 1; i++) {
            if (n == 0) forFacktor = 1;
            else {
                forFacktor = forFacktor * i;

            }
        }
        System.out.print("n! = ");
        System.out.println(forFacktor);
        iScanner.close();
    }
}