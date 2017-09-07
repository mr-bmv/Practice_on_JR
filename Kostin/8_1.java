/*
Массив из четных чисел до 20
*/

class ArrayTwenty{
  public static void main(String[] args) {
    int j[] = new int[10];

    for (int i = 0; i< 10; i++){
      j[i]=(i+1)*2;
      System.out.print(j[i]+" ");
    }
    System.out.println(' ');

    for (int i =0; i<10; i++){
      j[i] = (i+1)*2;
      System.out.println(j[i]);
    }
    System.out.println(" ");
  }
}
