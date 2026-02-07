public class CountConsistentSubstrings {
    public static int countConsistentStrings(String allowed, String[] words) {
        int mask = 0;
        for(int i=0; i<allowed.length(); i++){
            char ch = allowed.charAt(i);
            mask|=(1<<(ch-'a'));
        }
        int res = 0;
        for(String word: words){
            boolean flag = true;
            for(int i=0; i<word.length(); i++){
                char ch = word.charAt(i);
                if((mask&(1<<(ch-'a')))==0) {flag=false; break;}
            }
            if(flag) {res++;}
        }
        return res;
    }    
}
