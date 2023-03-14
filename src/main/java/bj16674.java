import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class bj16674 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();
        ArrayList<String> nums = new ArrayList<>();
        int zeroToten[] = new int[10];

        for(int i=0; i<N.length(); i++){
            nums.add(N.substring(i,i+1));
        }

        for(int i=0; i<N.length(); i++){
            if(nums.get(i).equals("0")){
                ++zeroToten[0];
            }else if(nums.get(i).equals("1")){
                ++zeroToten[1];
            }else if(nums.get(i).equals("2")){
                ++zeroToten[2];
            }else if(nums.get(i).equals("8")){
                ++zeroToten[8];
            }else{
                System.out.println(0);
            }
        }

        for(int i=0; i<10; i++) {
            if((zeroToten[0] >0 || zeroToten[1] >0 || zeroToten[2] >0 || zeroToten[8] >0)
            && (zeroToten[0] ==0 || zeroToten[1] ==0 || zeroToten[2] ==0 || zeroToten[8] ==0)){
                System.out.println(1);
            }else if((zeroToten[0] >0 && zeroToten[1] >0 && zeroToten[2] >0 && zeroToten[8] >0)
                    && (zeroToten[0] != zeroToten[1] )){
                System.out.println(2);
            }else if((zeroToten[0] >0 && zeroToten[1] >0 && zeroToten[2] >0 && zeroToten[8] >0)
                    && (zeroToten[0] == zeroToten[1] == zeroToten[2])){
                System.out.println(8);
            }




        }

//        System.out.println(zeroToten[0]);
    }
}
