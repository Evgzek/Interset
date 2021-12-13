import java.util.Scanner;
public class Interest {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.println("Выберите операцию: 1)Вычислить финальное значение, 2)Вычислить процент. Если хотите выйти нажмите любую кнопку");
        int destine;
        try {
            destine = p.nextInt();
        } catch (Exception e) {
            System.out.println("Ошибка");
            return;
        }
        if (destine == 1) {
            int period;
            float a;
            float interest;
            System.out.println("Введите число, процент, период(ВАЖНО!!! период не отрицательный):");
            period = p.nextInt();
            a = p.nextFloat();
            interest = p.nextFloat();
            if (period < 0) {
                System.out.println("Введите НЕ отрицательный период");
                return;
            }
            for (int i = period; i > 0; i--) {
                a += (a * interest) / 100;
            }
            System.out.println("Итоговый результат: " + a);
        }
        if (destine == 2){
            int period;
            float first;
            float end;
            float interest;
            System.out.println("Введите первое, последнее числа, период(ВАЖНО!!! период не отрицательный):");
            period = p.nextInt();
            first = p.nextFloat();
            end = p.nextFloat();
            if (period < 0) {
                System.out.println("Введите НЕ отрицательный период");
                return;
            }
            interest = (float) (Math.pow(end/first, (float)1/period) - 1) * 100;
            System.out.println("Процент равен: " + interest);

        }


    }

    }

