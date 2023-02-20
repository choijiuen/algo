import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj1550 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String six = br.readLine();
        double res =0; ;

        for(int i=0; i<six.length(); i++){
            String a = six.substring(i,i+1);

            if(a.equals("A")){
                res += 10 * Math.pow(16,six.length()-i-1);
            }else if(a.equals("B")){
                res += 11 * Math.pow(16,six.length()-i-1);
            }else if(a.equals("C")){
                res += 12 * Math.pow(16,six.length()-i-1);
            }else if(a.equals("D")){
                res += 13 * Math.pow(16,six.length()-i-1);
            }else if(a.equals("E")){
                res += 14 * Math.pow(16,six.length()-i-1);
            }else if(a.equals("F")){
                res += 15 * Math.pow(16,six.length()-i-1);
            }else{
                res += Integer.parseInt(a)* Math.pow(16,six.length()-i-1);
            }

        }
        System.out.print((int)res);
    }
}
