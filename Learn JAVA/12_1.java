/*
Программа создает массив из случайных чисел от 1 до 100.
Затем создает второй массив на основании первого и меняет первые 5 чисел на
отрицетельные
*/

class ArrayRandom {
  public static void main(String[] args) {
    int arrayA[] = new int [10];

    for ( int i = 0; i<10; i++){
      arrayA[i] = (int)(Math.random()*100+1);
      System.out.print(arrayA[i] + " ");
    }

    System.out.println(" ");

    for ( int i = 0; i<10; i++){
      if( i < 5){
        arrayA[i] = - arrayA[i];
      } else {
        arrayA[i] = arrayA[i];
      }
      System.out.print(arrayA[i]+" ");
    }
    System.out.println(" ");
  }
}
