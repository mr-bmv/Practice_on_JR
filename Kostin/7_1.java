/*
программа выводит на экран все четырёхзначные числа последовательности
 1000 1003 1006 1009 1012 1015 ….
*/

class ThreeLoop{
  public static void main(String[] args) {
    for (int i = 1000; i <= 9999 ; i+=3){
      System.out.print(" " + i);
    }
  }
}
