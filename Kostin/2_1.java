import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Программа вывод на экран результат деления двух целых чисел и указывает остаток
*/

class WholeAndRest {
  public static void main(String[] args) throws Exception {
    System.out.println("Введите первое целое число и нажмите Enter");
    BufferedReader bred = new BufferedReader(new InputStreamReader(System.in));
    int q = Integer.parseInt(bred.readLine());
    System.out.println(" ");
    System.out.println("Введите второе целое число и нажмите Enter");
    BufferedReader bred2 = new BufferedReader(new InputStreamReader(System.in));
    int w = Integer.parseInt(bred2.readLine());
    System.out.println("************************************");
    System.out.println( q + " / " + w + " = " + q/w +" и " + q%w +" в остатке");
  }
}         
