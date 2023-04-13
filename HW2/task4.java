import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
public class task4 {
    
    public static void main(String[] args) throws IOException {
        System.out.print(InputString());
    
    }
    
    public static String InputString() throws IOException {
        boolean test = false;
        String str = null;
        while(test != true) {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                Scanner in = new Scanner(System.in);
                System.out.print("Введите любую строку, только не пустую: ");
                str = reader.readLine();
                if (str.equals("")) {
                    throw new RuntimeException("Веденные данные не могут быть пустыми! Поаторите попытку!");
                }
                test = true;
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return str;
    }
}
