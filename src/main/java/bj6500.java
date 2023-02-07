import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class bj6500 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a,a1 ;
        String chk;
        HashSet<Integer> h = new HashSet<>();

        while(true){
            a = Integer.parseInt(br.readLine());
            h.clear();
            h.add(a);

            if(a == 0) break;

            for(int i=0; i<1000; i++){
                a1 = a;
                a = a * a;

                chk = Integer.toString(a);

                if (chk.length() < 8) {
                    while (true) {
                        chk = "0" + chk;
                        if (chk.length() == 8) {
                            break;
                        }
                    }
                }
                a = Integer.parseInt(chk.substring(2, 6));
                h.add(a);
//                System.out.println(a+" "+a1);
//                break;
                if(a == a1) break;
            }


            System.out.println(h.size());

        }

    }

}
