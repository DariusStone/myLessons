package Less2;

public class myWork2Paragraph5 {
    public static void main(String[] args) {
        System.out.println(isYearLeap(2000));
    }

    private static boolean isYearLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }else return false;
    }
}
/*
5. * Написать метод, который определяет,
        является ли год високосным, и возвращает boolean
        (високосный - true, не високосный - false).
        Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.*/
