import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class bj10867 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        HashSet<Integer> nums = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++){

            nums.add(Integer.parseInt(st.nextToken()));

        }

        List<Integer> res = new ArrayList<>(nums);

        Collections.sort(res);

        for(int i : res){
            System.out.print(i+" ");
        }
    }
}
