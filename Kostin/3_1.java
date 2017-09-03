import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Программа выдает случайное число из диапазона, заданного пользователем
*/

class MyRandom {
  public static void main(String[] args) throws Exception {

    System.out.println("Введите целое число, оно будет является нижней границей Random. Нажмите Enter");
    BufferedReader bred = new BufferedReader(new InputStreamReader(System.in));
    int q = Integer.parseInt(bred.readLine()); 

    System.out.println(" ");
    System.out.println("Введите второе целое число. Оно будет является верхней границей Random. Нажмите Enter");
    BufferedReader bred2 = new BufferedReader(new InputStreamReader(System.in));
    int w = Integer.parseInt(bred2.readLine()); 
    System.out.println("************************************");

    System.out.println( (int)(Math.random()*(w - q + 1)) + q );
  }
}
