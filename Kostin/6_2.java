import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Программа считает сумму введенных пользователем ЦЕЛЫХ чисел.
*/

class StupidSum{
  public static void main(String[] args) throws Exception {
    System.out.println("Введите целое число. Нажмите Enter");
    BufferedReader bred = new BufferedReader(new InputStreamReader(System.in));
    double q = Double.parseDouble(bred.readLine());
    int q2 = (int)q;

    if ( q2 != q){
      System.out.println("ОШИБКА");
      System.out.println("Введенное первое число не является целым");
    }

    System.out.println(" ");
    System.out.println("Введите второе целое число. Нажмите Enter");
    BufferedReader bred2 = new BufferedReader(new InputStreamReader(System.in));
    double w = Double.parseDouble(bred2.readLine());
    System.out.println("************************************");

    int w2 = (int)w;
    if ( w2 != w) {
      System.out.println("ОШИБКА");
      System.out.println("Введенное второе число не является целым");
    } else {
    System.out.println("Сумма чисел равна " + (q + w));
    }
  }
}
