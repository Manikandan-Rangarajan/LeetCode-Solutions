import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode804 {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        Collections.addAll(lst,"alice","bob","charlie");
        System.out.println(isAcronym(lst,"abc"));
    }
    public static boolean isAcronym(List<String> words, String s) {
        System.out.println(words.size());
        if(words.size()!=s.length()){
            return false;
        }
        for(int i=0;i<words.size();i++){
            if(words.get(i).charAt(0) != s.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
