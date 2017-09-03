import java.io.BufferedReader;
import java.io.InputStreamReader;


class RootX{
  public static void main(String[] args)  throws Exception {

    System.out.println(" ВВЕДИТЕ a уравнения ax²+bx+c=0. НАЖМИТЕ ENTER");
    BufferedReader bred = new BufferedReader(new InputStreamReader(System.in));
    double a = Double.parseDouble(bred.readLine());

    System.out.println(" ВВЕДИТЕ b ЧИСЛО уравнения ax²+bx+c=0. НАЖМИТЕ ENTER");
    BufferedReader bred2 = new BufferedReader(new InputStreamReader(System.in));
    double b = Double.parseDouble(bred2.readLine());

    System.out.println(" ВВЕДИТЕ c ЧИСЛО уравнения ax²+bx+c=0. НАЖМИТЕ ENTER");
    BufferedReader bred3 = new BufferedReader(new InputStreamReader(System.in));
    double c = Double.parseDouble(bred3.readLine());

    if ( a == 0 || (2*b - 4*a*c) < 0) {
      System.out.println("КОРНЕЙ НЕТ!!!");
    } else {
    double x1 = (- b + Math.sqrt(2*b - 4*a*c))/(2*a);
    double x2 = ( b + Math.sqrt(2*b - 4*a*c))/(2*a);

    System.out.println( x1 + " и " + x2 + " корни уравнения " + a+"x²+"+b+"x"+"+"+c+"=0");
  }
  }
}
