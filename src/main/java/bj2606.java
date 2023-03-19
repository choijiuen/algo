import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class bj2606 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;

        int N = Integer.parseInt(br.readLine());
        int line = Integer.parseInt(br.readLine());
//        HashSet<Integer> v = new HashSet<>();
        ArrayList<Integer> v = new ArrayList<>();

        for(int i=0 ; i<line; i++){
            st = new StringTokenizer(br.readLine());
            int l1= Integer.parseInt(st.nextToken());
            int l2= Integer.parseInt(st.nextToken());

            v.add(l1);
            v.add(l2);
        }

        System.out.println(v);
    }
}
