import java.io.BufferedReader;
import java.io.InputStreamReader;

class NearestToTen{
  public static void main(String[] args)  throws Exception {

    System.out.println(" ВВЕДИТЕ ПЕРВОЕ ЧИСЛО. НАЖМИТЕ ENTER");
    BufferedReader bred = new BufferedReader(new InputStreamReader(System.in));
    double a = Double.parseDouble(bred.readLine());

    System.out.println(" ВВЕДИТЕ ВТОРОЕ ЧИСЛО. НАЖМИТЕ ENTER");
    BufferedReader bred2 = new BufferedReader(new InputStreamReader(System.in));
    double b = Double.parseDouble(bred2.readLine());

    double q = Math.abs(10 - a);
    double w = Math.abs(10 - b);
    System.out.println("****************************");
    if ( q < w){
      System.out.println(a + " БЛИЖЕ К 10 ЧЕМ " + b);
    } else if ( q > w) {
      System.out.println(b + " БЛИЖЕ К 10 ЧЕМ " + a);
    } else {
      System.out.println(a + " И " + b + " РАСПОЛОЖЕННОЫ ОДИНАКОВО ПО ОТНОШЕНИЮ К 10");
    }
  }
}
