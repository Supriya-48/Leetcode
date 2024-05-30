package top_interview_150;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        char[] c = s.toCharArray();
        int len = c.length;
        StringBuffer[] sb = new StringBuffer[numRows];
        for(int i=0;i<sb.length;i++){
            sb[i] = new StringBuffer();
        }
        int i=0;
        while(i<len){
            for(int j=0;j<numRows && i<len ;j++){
                sb[j].append(c[i++]);
            }
            for(int j=numRows-2;j>=1 && i<len ;j--){
                sb[j].append(c[i++]);
            }
        }
        for(i=1;i<sb.length;i++){
            sb[0].append(sb[i]);
        }
        return sb[0].toString();
    }
}
