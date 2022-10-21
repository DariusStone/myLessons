package Less2;

public class myWork2Paragraph2 {
    public static void main(String[] args) {
        positiveOrNegative(6);
    }
/*2. Написать метод, которому в качестве параметра
    передается целое число, метод должен напечатать в консоль,
    положительное ли число передали или отрицательное.
    Замечание: ноль считаем положительным числом.*/
    private static void positiveOrNegative(int digit) {
        if (digit >= 0) System.out.println("Positive");
        else System.out.println("Negative");
    }
}

