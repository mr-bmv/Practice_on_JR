import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Пользователь вводит число. ПРограмма создает массив, с количеством символов
равных введенному числу и заполняет его случайным образом.
*/

class ArrayFromYou{
  public static void main(String[] args) throws Exception  {

    System.out.println("Введите целое число. Нажмите Enter");
    BufferedReader bred = new BufferedReader(new InputStreamReader(System.in));
    int q = Integer.parseInt(bred.readLine());

    int j[] = new int[q];

    for (int i =0; i<q; i++){
      j[i] = (int)(Math.random()*10+1);
      System.out.print(j[i] + " ");
    }
    System.out.println(' ');
  }
}
