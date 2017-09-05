import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
Создайте программу, вычисляющую факториал натурального числа n, которое
пользователь введёт с клавиатуры.
*/

class factorial{
  public static void main(String[] args) throws Exception  {

    System.out.println("Введите целое число. Нажмите Enter");
    BufferedReader bred = new BufferedReader(new InputStreamReader(System.in));
    int q = Integer.parseInt(bred.readLine());

    int sum =1;

    for ( int i= 1; i <=q ; i++){
      sum*=i;
    }
    System.out.println(sum);
  }
}
