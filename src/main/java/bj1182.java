import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class bj1182 {
    static int N;
    static int S;
    static int nums[];
    static ArrayList<Integer> selected;
    static int sum;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        nums = new int[N];
        selected = new ArrayList<>();
        int start=0;
        int end=0;

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }

//        for(int i=start; i<N; i++){
            for(int j=start; j<end+1; j++){
                sum += nums[j];
            }
//            while(end<N){
                 end++;
//            }
//        }

//        rec_fun(0,1);
        System.out.println(count);

    }

//    static void rec_fun(int start, int end){
//
//        for(int i = start ; i< end; i++){
//            sum += nums[i];
//        }
//        if(sum == S){
//            count++;
//        }
//        while(end+1<=N){
//            rec_fun(start,end+1);
//        }
//
//    }


}
