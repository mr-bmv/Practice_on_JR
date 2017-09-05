import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Для введённого пользователем с клавиатуры натурального числа посчитайте сумму
 всех его цифр (заранее не известно сколько цифр будет в числе).
*/

class SumOfAll{
  public static void main(String[] args) throws Exception {

    System.out.println("Введите целое положительное число. Нажмите Enter");
    BufferedReader bred = new BufferedReader(new InputStreamReader(System.in));
    int q = Integer.parseInt(bred.readLine());

    System.out.println("************************************");

    String str = String.valueOf(q);

    int sum = 0;

    for (int i = 0; i<= str.length(); i++){
      int b = q%10;
      q = (q - b)/10;
      sum+=b;
    }
    System.out.println("Сумма цифр введенного числа = " + sum);
  }
}
