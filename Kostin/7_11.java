/*
Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем,
что первый и второй члены последовательности равны единицам, а каждый
следующий — сумме двух предыдущих.
*/

class Fibonachee{
  public static void main(String[] args) {
    int sum = 0;
    int a = 0;
    int b =0;
    for ( int i = 1; sum <=10 ; ){
      sum++;
      b = i;
      i = i + a;
      a = b;
      System.out.println(sum + " член последовательности -" + i);
    }
  }
}
