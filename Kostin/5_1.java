/*
Программа проверяет  попало ли случайно выбранное из отрезка [5;155]
 целое число в интервал (25;100) и сообщать результат на экран.
*/

class InRandomArea {
  public static void main(String[] args) {
    int v = (int)(Math.random()*161)-5;
    if ( v > 25 && v < 100) {
      System.out.println("Число "+v+" содержится в интервале (25;100)");
    } else {
      System.out.println("Число "+v+" не содержится в интервале (25;100)");
    }
  }
}
