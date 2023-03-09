import java.util.*;

public class pro42576 {
    public static void main(String[] args) {
    }

    class Solution {
        public String solution(String[] participant, String[] completion) {
            String answer = "";
            Arrays.sort(participant);
            Arrays.sort(completion);

            if(completion.length >0){
                for(int i=0; i<completion.length; i++){
                    if(!(participant[i].equals(completion[i]))){
                        answer = participant[i];
                        break;
                    }else{
                        answer = participant[i+1];

                    }

                }
            }else{
                answer = participant[0];
            }
            return answer;
        }
    }
}
