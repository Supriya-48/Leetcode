class Solution {
    public int maxArea(int[] height) {
        int max=0,size=height.length;
        for(int i=0,j=size-1;i<size & j>=0;){
                int area=(j-i)*(Math.min(height[j],height[i]));
                max=max >area ? max:area;
                if(height[i]>height[j]){
                    j--;
                }else if(height[i]<height[j]){
                    i++;
                }else{
                    i++;
                    j--;
                }
        }
        return max;
    }
}