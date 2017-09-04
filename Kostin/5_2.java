/*
Программа генерирует трехзначное число и определяет наибольшую цифру
*/

class TheBiggestFromThree {
  public static void main(String[] args) {
    int v = (int)(Math.random()*900) + 99; //897
    int a = v%10;
    int b = ((v - a)/10)%10;
    int c = ((v - a - 10*b)/100)%10;
    if (a > b && a > c){
      System.out.println("В числе "+v+" наибольшая цифра "+a);
    } else if (b > a && b > c) {
      System.out.println("В числе "+v+" наибольшая цифра "+b);
    } else {
      System.out.println("В числе "+v+" наибольшая цифра "+c);
    }
  }
}
