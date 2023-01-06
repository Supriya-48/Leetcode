class Solution {
    public String toGoatLatin(String sentence) {
        String res="";
        String[] s=sentence.split(" ");
        for(int i=0;i<s.length;i++){
            char c=Character.toLowerCase(s[i].charAt(0));
            if(c=='a' | c=='e' |c=='i' |c=='o'|c=='u'){
                res+=s[i];
            }else{
                res+=s[i].substring(1,s[i].length())+s[i].charAt(0);
            }
            res+="ma";
            for(int j=0;j<=i;j++){
                res+='a';
            }
            if(i!=s.length-1){
                res+=" ";
            }
        }
        return res;
    }
}