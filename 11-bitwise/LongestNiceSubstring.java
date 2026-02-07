public class LongestNiceSubstring {
    public String longestNiceSubstring(String s) {
        if(s.length()<2) {return "";}
        int n = s.length(), lc=0, uc=0;
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z') {lc|=(1<<(ch-'a'));}
            else {uc|=(1<<(ch-'A'));}
        }
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            int bit = (ch>='a'&&ch<='z') ? 1<<(ch-'a') : 1<<(ch-'A');
            if((ch>='a'&&ch<='z'&&(uc&bit)==0) || (ch>='A'&&ch<='Z'&&(lc&bit)==0)){
                String left = longestNiceSubstring(s.substring(0,i));
                String right = longestNiceSubstring(s.substring(i+1));
                return (left.length()>=right.length()) ? left : right;
            }
        }
        return s;
    }
}