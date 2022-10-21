package Less2;

public class myWork2Paragraph1 {
    public static void main(String[] args) {
        System.out.println(within10and20(2, 123));
    }
/*1. Написать метод, принимающий на вход два целых числа
    и проверяющий, что их сумма лежит в пределах
    от 10 до 20 (включительно),
    если да – вернуть true, в противном случае – false.*/
    static boolean within10and20(int varA, int varB) {
        int sum;
        sum = varA + varB;
        if (10 <= (varA + varB) && 20 >= (varA + varB))
            return true;
        else return false;
    }
    }
//следующее задание в отдельном классе под названием myWork2Paragraph2
