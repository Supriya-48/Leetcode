class Solution {
    public String replaceDigits(String s) {
        int size=s.length();
        char[] arr=s.toCharArray();
        for(int i=1;i<size;i+=2){
            arr[i]=(char)(arr[i-1]+arr[i]-'0');
        }
        return String.valueOf(arr);
    }
}