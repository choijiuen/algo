import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class bj3985 {
    static Map<Integer,Integer> guess;
    static Map<Integer,Integer> real;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int L = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int chk[] = new int[L+1];
        int count[] = new int[L+1];
        guess = new HashMap<>();
        real = new HashMap<>();

        for(int i=1; i<=L; i++){
            chk[i] =0;
        }

        for(int i=1; i<=N; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            guess.put(i,end-start+1);

            for(int j=start; j<=end; j++){
                if(chk[j] == 0){
                    chk[j] = i;
                }
            }
        }

        rollSort((HashMap<Integer, Integer>) guess);

        for(int i=1; i<=L; i++){
            count[chk[i]]++;
        }
        for(int i=1; i<=L; i++){
            real.put(i,count[i]);
        }

        rollSort((HashMap<Integer, Integer>) real);

    }

    static void rollSort(HashMap<Integer,Integer> map){
        List<Integer> size = new ArrayList<>(map.keySet());
        Collections.sort(size, (o1, o2) -> map.get(o2).compareTo(map.get(o1)));

        for(int key : size){
            System.out.println(key);
            break;
        }
    }


}
