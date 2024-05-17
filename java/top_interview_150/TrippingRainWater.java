package top_interview_150;

import java.util.HashMap;

public class TrippingRainWater {
    public int trap(int[] height) {
        int[] leftmax = new int[height.length];
        int[] rightmax = new int[height.length];
        int maxi=0;
        for(int i=0;i<height.length;i++){
            if(height[i] > maxi){
                maxi = height[i];
                leftmax[i]= height[i];
            }else{
                leftmax[i] = maxi;
            }
        }
        maxi=0;
        for(int i=height.length-1;i>=0;i--){
            if(height[i] > maxi){
                rightmax[i]=height[i];
                maxi=height[i];
            }else{
                rightmax[i] = maxi;
            }
        }
        int sum=0;
        for(int i=0;i<height.length;i++){
            sum+= Math.min(leftmax[i],rightmax[i]) - height[i];
        }
        return sum;
    }
}
