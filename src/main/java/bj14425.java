import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class bj14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashSet<String> S = new HashSet<>();
        int cnt=0;

        for(int i =0; i<N; i++){
            S.add(br.readLine());
        }

        for(int i=0; i<M; i++){
            String c = br.readLine();
            if(S.contains(c)){
                cnt++;
            }
        }
        System.out.println(cnt);

//        for(int i=0; i<M; i++){
//            chk = br.readLine();
//            for(int j=0; j<N; j++){
//                if(S[j].equals(chk)){
//                    cnt++;
//                    break;
//                }
//            }
//        }

    }
}
