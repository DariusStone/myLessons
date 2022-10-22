package Less2;

public class myWork2Paragraph4 {
    public static void main(String[] args) {
        printText(4, "lorem");
    }
/*4. Написать метод, которому в качестве аргументов передается
    строка и число, метод должен отпечатать в консоль
    указанную строку, указанное количество раз;*/
    private static void printText(int times, String str) {
        for (int j = 0; j < times; j++) {
            System.out.println(str);
        }
    }
}
// задание со * решено в след классе myWorkParagraph5