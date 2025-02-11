public class LeetCode1832 {
    public static void main(String[] args) {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }
    public static boolean checkIfPangram(String sentence) {
        if(sentence.length()<26){
            return false;
        }
        boolean[] arr = new boolean[26];
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)>='a' && sentence.charAt(i)<='z'){
                arr[sentence.charAt(i)-97] = true;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==false){
                return false;
            }
        }
        return true;
    }
}
