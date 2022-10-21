package Less2;

import java.util.Scanner;

public class myWork2Paragraph2_Alternative {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ниже любое целое число: ");
        int x = in.nextInt();
        if (x >= 0) {
            System.out.println("positive");

        } else {
            System.out.println("negative");
        }
    }
}
// решил иначе, посмотрев рекомендованный курс Java Быстрый старт. Узнал о функции сканер.
//P.S.  следующий пункт дз в классе под названием myWorkParagraph3