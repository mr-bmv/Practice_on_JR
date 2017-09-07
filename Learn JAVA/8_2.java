/*
Спортсмен на соревнованиях стреляет 3 раза. Программа по рандому показывает
результат
*/

class Shooting{
  public static void main(String[] args) {

     int a = (int)(Math.random()*2);
     int b = (int)(Math.random()*2);
     int c = (int)(Math.random()*2);

     System.out.print("Первый выстрел ");
     System.out.println(a == 1? "попал": "промазал");
     System.out.print("Второй выстрел ");
     System.out.println(b == 1? "попал": "промазал");
     System.out.print("Третий выстрел ");
     System.out.println(c == 1? "попал": "промазал");

     System.out.println("Общий счет = " + (a+b+c));
  }
}
