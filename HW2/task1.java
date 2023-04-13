import java.util.InputMismatchException;
import java.util.Scanner;

// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
// Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

public class task1 {

    public static void main(String[] args) {
    System.out.print(InputFloat());
    }

    public static float InputFloat() {
        boolean test = false;
        float num = 0;
        while(test != true) {
            try {
                Scanner in = new Scanner(System.in);
                System.out.print("Введите любое вещественное число: ");
                num = in.nextFloat();
                test = true;
            }
            catch (InputMismatchException e) {
                System.out.println("Введенные вами данные не являются вещественным числом. Повторите попытку! ");
            }
        }
        return num;
    }

       
}    


  
   
