import java.util.Scanner;
/*
Создать программу, которая будет проверять, является ли слово из пяти букв,
 введённое пользователем, палиндромом (примеры: «комок», «ротор»).
 Если введено слово не из 5 букв, то сообщать об ошибке.
 Программа должна нормально обрабатывать слово, даже если в нём использованы
 символы разного регистра. Например, слова «Комок» или «РОТОР» следует также
 считать палиндромами
*/

class Polindrom {
  public static void main(String[] args) {

    System.out.println("Введите слово из 5 букв");
    Scanner bred = new Scanner(System.in);
    String s = bred.nextLine();
    String str = s.toUpperCase();

    if ( s.length() != 5){
      System.out.println("Слово должно быть из 5 букв");
    } else if ( str.charAt(0) == str.charAt(4) && str.charAt(1) == str.charAt(3) && str.length() == 5 ){
      System.out.println("Введеное слово - ПОЛИНДРОМ");
    } else {
      System.out.println("Введенное слово - не полиндром");
    }
  }

}

