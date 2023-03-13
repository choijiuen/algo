import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class bj10610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        ArrayList<Integer> nums = new ArrayList<>();
        String result ="";

        for(int i=0; i<N.length(); i++){
            nums.add(Integer.parseInt(N.substring(i,i+1)));
        }

        if(!(nums.contains(0))){
            System.out.println(-1);
        }else{
            Collections.sort(nums, Collections.reverseOrder());
            for(int i=0; i<N.length(); i++){
                result += Integer.toString(nums.get(i));
                if(Integer.parseInt(result) / 30 == 0){
                    System.out.println(result);
                }else{
                    /**
                     * 구현 해야함
                     */
                }
            }

        }

    }
}
