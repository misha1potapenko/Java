//2. Вывести все простые числа от 1 до 1000
import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        int i = 0;
        int count = 1;
        System.out.print("2,3,5,7,11,13,17,19,23,29,");
        for (i = 2; i < 1000; i++) {
            count ++;
            if (i % 2 != 0 & i % 3 != 0 &  i % 5 != 0 & i % 7 != 0 & i % 11 != 0
                    & i % 13 != 0 & i % 17 != 0 & i % 19 != 0 & i % 23 != 0 & i % 29 != 0) {
                System.out.printf("%s,",i);
            }
            if (count == 100) {
                System.out.println();
                count = 0;
            }
        }

    }
}
