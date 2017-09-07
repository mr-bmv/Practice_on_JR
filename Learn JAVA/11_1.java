/*
Программа выводит квадраты чисел от 1 до 10 , на другой строчке от 10 до 1
*/

class TwoRowsOfSqr{
  public static void main(String[] args) {

    for (int i =1; i<=10; i++){
      System.out.print(i*i + " ");
    }

    System.out.println(" ");

    for (int i = 10; i>=1; i--){
      System.out.print(i*i + " ");
    }
    System.out.println(" ");
  }
}
