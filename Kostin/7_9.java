import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Программа определяет, является ли число, введенное пользователем, простым.
*/

class SimpleDigit{
  public static void main(String[] args) throws Exception {

    System.out.println("Введите целое число. Нажмите Enter");
    BufferedReader bred = new BufferedReader(new InputStreamReader(System.in));
    double q = Double.parseDouble(bred.readLine());

    if ( q <= 0 || q%1 != 0){
      System.out.println("Введенное число не является ПРОСТЫМ");
    } else {
              for (int i = 2; i <=q ; i++){
                if ( q%i == 0 ){
                System.out.println("Введенное число не является ПРОСТЫМ");
                break;
              } else if (i == (int)q/2){
                System.out.println("ПРОСТОЕ");
                break;
              }
              }

    }
  }
}
