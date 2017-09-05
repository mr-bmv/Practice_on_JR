/*
Выведите на экран все члены последовательности 2an-1–1, где a1=2,
которые меньше 10000.
*/

class LessThousand{
  public static void main(String[] args) {
    for ( int i = 2; 2*(i-1)-1 <=100; i++){
      System.out.println(2*(i-1)-1);
    }
  }
}
