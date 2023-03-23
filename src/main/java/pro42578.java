import java.util.*;

public class pro42578 {
    public int solution(String[][] clothes) {
        int answer = 0;
        HashSet<String> k = new HashSet<>();

        for(int i=0; i<clothes.length; i++){
            k.add(clothes[i][1]);
        }

        String[] s = new String[k.size()];
        int [] c = new int[k.size()];

        Iterator<String> iter = k.iterator();

        for(int j=0; j<k.size(); j++){
            s[j] = iter.next();
        }

        for(int i=0; i<k.size(); i++){
            for(int j=0; j<clothes.length; j++){
                if(s[i].equals(clothes[j][1])){
                    c[i]++ ;
                }
            }

        }

        int count=1;

        for(int i=0; i<k.size(); i++){
            count *= c[i]+1 ;
        }

        answer = count-1;

        return answer;
    }
}