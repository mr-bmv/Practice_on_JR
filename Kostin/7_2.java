/*
Программа выводит на экран первые 55 элементов
последовательности 1 3 5 7 9 11 13 15 17 …
*/

class TwoLoops{
  public static void main(String[] args) {
    int sum = 0;
    for (int i =1; sum <=54; i+=2 ){
      sum++;
      System.out.println(sum + " символ " + i);
    }
  }
}
