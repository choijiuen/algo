import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class bj10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> stack = new ArrayList<Integer>();

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if(s.equals("push")){
                for(int j=0; j<2; j++){
                    if(j==1){
                        stack.add(Integer.parseInt(st.nextToken()));
                    }
                }

//                System.out.println(stack.get(stack.size()-1));

            }
            else if(s.equals("pop")){
                if(stack.isEmpty()) {
                    System.out.println(-1);
                }
                else{
                    System.out.println(stack.get(stack.size()-1));
                    stack.remove(stack.size()-1);
                }

            }
            else if (s.equals("size")) {
                System.out.println(stack.size());
            }
            else if (s.equals("empty")) {
                if(stack.isEmpty()){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }
            else if (s.equals("top")) {
                if(stack.isEmpty()){
                    System.out.println(-1);
                }else{

                    System.out.println(stack.get(stack.size()-1));
                }
            }

        }
    }

}