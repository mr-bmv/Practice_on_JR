import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Программа находит все простые числа до 100
*/

class allSimple{
  public static void main(String[] args) throws Exception {

for ( int digit = 2; digit <= 100; digit++){
  for (int i = 2; i <=digit ; i++){
    if ( digit%i == 0 ){
      break;
      } else if (i == (int)digit/2){
        System.out.println(digit);
        break;
        }
      }
    }
  }
}
