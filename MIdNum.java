
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bred = new BufferedReader( new InputStreamReader(System.in));
        double sum =0;
        int i =0;
        while(true){
            int s = Integer.parseInt(bred.readLine());
            if (s == -1) break;
            else{
                sum=sum+s;
                i++;
            }
        } 
        System.out.println(sum/i);
    }
}
