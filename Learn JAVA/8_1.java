/*
Программа сообщает, кто сейчас дома. Ответ по рандому
*/

class WhoAtHome{
  public static void main(String[] args) {

    int a = (int)(Math.random()*2);
    int b = (int)(Math.random()*2);
    int c = (int)(Math.random()*2);

    System.out.println(a == 1 ? "Папа дома!":"Папы нет дома!");
    System.out.println(b == 1 ? "Мама дома!":"Мама нет дома!");
    System.out.println(c == 1 ? "Брат дома!":"Брата нет дома!");
  }
}
