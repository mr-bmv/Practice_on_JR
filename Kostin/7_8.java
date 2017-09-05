import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Выведите на экран все положительные делители натурального числа,
введённого пользователем с клавиатуры.
*/

class PositiveDev{
  public static void main(String[] args) throws Exception {

    System.out.println("Введите целое число. Нажмите Enter");
    BufferedReader bred = new BufferedReader(new InputStreamReader(System.in));
    int q = Integer.parseInt(bred.readLine());

    System.out.println("Положительные делители Вашего числа:");

    for ( int i = 1; i<=q ; i++){
      double dev = q*1.0/i;
      int dev2 = (int)dev;

      if ( dev == dev2 ){
        System.out.println(i);
      }
    }
  }
}
