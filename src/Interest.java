import java.util.Scanner;
public class Interest {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.println("Выберите операцию: 1)Вычислить финальное значение, 2)Вычислить процент. Если хотите выйти нажмите любую кнопку");
        int destine;
        try {
            destine = p.nextInt();
        }catch (Exception e){
            System.out.println("Ошибка");
            return;
        }

        }

    }
}
