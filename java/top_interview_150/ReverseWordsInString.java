package top_interview_150;

public class ReverseWordsInString {
    public String reverseWords(String s) {
        if(s.isEmpty()){
            return s;
        }
        s = s.trim().replaceAll(" +"," ");
        String[] arr=s.split(" ");
        String[] reversed = new String[arr.length];
        int index=0;
        for(int i= arr.length - 1;i>=0;i--){
            System.out.println("dfd"+arr[i]+"sad");
            if(arr[i] != ""){
                reversed[index] = arr[i];
                index++;
            }
        }
        String res = String.join(" ",reversed);
        return res;
    }
}
