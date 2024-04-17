package top_interview_150;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int i=0,j=height.length-1;
        while(i<=j){
            int min = Math.min(height[i],height[j]);
            if(min*(j-i) >maxArea){
                maxArea = min*(j-i);
            }
            if(height[i]>height[j]){
                j--;
            }else{
                i++;
            }
        }
        return maxArea;
    }
}
