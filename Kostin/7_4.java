/*
Создайте программу, выводящую на экран первые 20 элементов последовательности
2 4 8 10
*/
class FirstTwenty{
  public static void main(String[] args) {
    int sum = 0;
    for ( int i = 2; sum <= 19; i+=2){
      sum++;
      System.out.println(sum + " символ " + i);
    }
  }
}
