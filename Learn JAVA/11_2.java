import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
Загадывается число от 1 до 10. Пользователь пытается угадать число. Машина дает
подсказки. Всего три попытки.
*/

class FindNumber{
  public static void main(String[] args) throws Exception  {
    int number = (int)(Math.random()*10+1);

    for (int i = 0 ; i < 3; i++){
      System.out.println("Введите целое число от 1 до 10. Нажмите Enter");
      BufferedReader bred = new BufferedReader(new InputStreamReader(System.in));
      int q = Integer.parseInt(bred.readLine());

      if ( q > number){
        System.out.println("Загаданное число меньше");
      } else if (q < number) {
        System.out.println("Загаднное число больше");
      } else {
        System.out.println("Вы угадали!!!");
        break;
      }

    }
        System.out.println("Загаданное число  " +number);
  }
}
