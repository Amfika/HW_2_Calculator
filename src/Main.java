import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите первое число:");
            int str = scanner.nextInt();
            System.out.println("Какую операцию вы хотите сделать?\n 1) +  2) - 3) * 4) /");
            int str3 = scanner.nextInt();
            try {
                System.out.println("Введите второе число:");
                int str2 = scanner.nextInt();
                if (str3 == 1) {
                    int a = str + str2;
                    System.out.println("В сумме вы получите: " + a);
                } else if (str3 == 2) {
                    int b = str - str2;
                    System.out.println("Итог вычитания будет равняться: " + b);
                } else if (str3 == 3) {
                    int c = str * str2;
                    System.out.println("Итогом умножения будет: " + c);
                } else if (str3 == 4) {
                    int d = str / str2;
                    System.out.println("Итог деления будет: " + d);
                }
            }catch (ArithmeticException e){
                System.out.println("На 0 делить нельзя!");
            }
            System.out.println("Желаете продолжить? 1 - Да   2 - Нет");
            int str4 = scanner.nextInt();
                if (str4==1){
                }else {
                    System.out.println("До новых встреч!");
                    break;
                }
        }
    }
}