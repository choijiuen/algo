import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class bj2798 {
    static int N;
    static int M;
    static Integer[] selected;
    static Integer[] nums;
    static int sum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        nums = new Integer[N];
        selected = new Integer[3];
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums, Collections.reverseOrder());

        rec_func(0,0,0);
        System.out.println(sum);
    }

    private static void rec_func(int k,int max, int start) {

        if(k == 3){
            sum =0;
            for(int i=0; i<3; i++){
                sum += selected[i];
//                System.out.print(selected[i]);
            }
//            System.out.println();
            if(sum > M){
                sum =0;
            }
            sum = Math.max(sum,max);

        }else{
//            for(int cand = selected[k-1]+1; cand <N; cand++){ //이전에 쓰였던 숫자보다 하나 큰 숫자 부터 시작
              for(int i = start ; i <N; i++){  //이전에 쓰였던 숫자보다 다음 숫자 부터 시작
                selected[k] = nums[i];
                rec_func(k+1,sum, i+1);
                selected[k]=0;
            }
        }
    }


}
