import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ct4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int count =0;

        for(int i=0; i<T; i++){
            int L = Integer.parseInt(br.readLine());    //바이트
            String s = br.readLine();
            String a[] = s.split("-");
            s = br.readLine();
            String b[] = s.split("-");
            s = br.readLine();
            String c[] = s.split("-");
            count =0;

            for(int j=0; j<a.length; j++){
                a[j] = String.format("%08d",Integer.parseInt(Integer.toBinaryString(Integer.parseInt(a[j]))));
                b[j] = String.format("%08d",Integer.parseInt(Integer.toBinaryString(Integer.parseInt(b[j]))));
                c[j] = String.format("%08d",Integer.parseInt(Integer.toBinaryString(Integer.parseInt(c[j]))));

                for(int x=0; x<8; x++){
                    int aa = Integer.parseInt(a[j].substring(x,x+1));
                    int bb = Integer.parseInt(b[j].substring(x,x+1));
                    int cc = Integer.parseInt(c[j].substring(x,x+1));

                    if(aa != bb || bb != cc || aa != cc){
                        ++count;
                    }

                }
            }
            System.out.println(count);

        }


    }
}