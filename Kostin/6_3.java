import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Создать программу, которая будет выводить на экран меньшее
по модулю из трёх введённых пользователем вещественных чисел.
*/

class StupidMin {
  public static void main(String[] args) throws Exception  {

    System.out.println("Введите первое вещественное число. Нажмите Enter");
    BufferedReader bred = new BufferedReader(new InputStreamReader(System.in));
    double q = Double.parseDouble(bred.readLine());
    double q2 = Math.abs(q);

    System.out.println(" ");
    System.out.println("Введите второе вещественное число. Нажмите Enter");
    BufferedReader bred2 = new BufferedReader(new InputStreamReader(System.in));
    double w = Double.parseDouble(bred2.readLine());
    double w2 = Math.abs(w);

    System.out.println(" ");
    System.out.println("Введите третье вещественное число. Нажмите Enter");
    BufferedReader bred3 = new BufferedReader(new InputStreamReader(System.in));
    double e = Double.parseDouble(bred3.readLine());
    double e2 = Math.abs(e);
    System.out.println("************************************");

    double min = Math.min(Math.min(q2, w2), e2);

    if ( min == q2) {
      System.out.println("Минимальное по модулю число = "+q);
    } else if ( min == w2) {
      System.out.println("Минимальное по модулю число = "+w);
    } else{
      System.out.println("Минимальное по модулю число = "+e);
    }
  }
}
