import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Программа округляет введенное пользователем число. Без использования 
Math.round
*/

class Okruglenie {
  public static void main(String[] args) {
    System.out.println("Введите вещественное число и нажмите Enter");
    System.out.println("************************************");
    BufferedReader bred = new BufferedReader(new InputStreamReader(System.in));
    double a = Double.parseDouble(bred.readLine());
    System.out.println(" ");
    System.out.println("Введенное число = " + a);
    int b = (int) a ;
    if ( a < (b + 0.5)) {
        System.out.println("************************************");
        System.out.println("Округленное число = " + b);
    } else {
      System.out.println("************************************");
      System.out.println("Округленное число = " + (b + 1));
    }
  }
}
