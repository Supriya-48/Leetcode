package top_interview_150;

public class TwoSumSorted {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int start=0,end=numbers.length-1;
        while(start <= end){
            if(numbers[start]+numbers[end] == target){
                res = new int[]{start+1,end+1};
                break;
            }else if(numbers[start]+numbers[end] < target){
                start++;
            }else{
                end--;
            }
        }
        return res;
    }
}
