import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Программы выводит сумму цифр введенного пользователем числа.
Импорт для получения данных с клавиатуры
*/

class Sum_Any {
  public static void main(String[] args) throws Exception {
    System.out.println("Введите целое число и нажмите Enter");
    System.out.println("************************************");
    BufferedReader bred = new BufferedReader( new InputStreamReader(System.in));
    int a = Integer.parseInt(bred.readLine());
  //  int a = (int)(Math.random()*100);
    System.out.println(" ");
    System.out.println("Выбранное число = " + a);
    int sum = 0;
      while ( a > 0){
        int b = a%10;
        sum = sum + b;
        a = a/10;
      }
    System.out.println("************************************");
    System.out.println("Сумма цифр, выбранного числа = " + sum);
  }
}
