import java.io.BufferedReader;
import java.io.InputStreamReader;

class ChetNeChet{
  public static void main(String[] args) throws Exception {

    System.out.println(" ВВЕДИТЕ ЦЕЛОВЕ ЧИСЛО. НАЖМИТЕ ENTER");
    BufferedReader bred = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(bred.readLine());

    if ( a%2 == 0){
      System.out.println("ВЫ ВВЕЛИ ЧЕТНОЕ ЧИСЛО");
    } else {
      System.out.println("ВЫ ВВЕЛИ НЕЧЕТНОЕ ЧИСЛО");
    }
  }
}
