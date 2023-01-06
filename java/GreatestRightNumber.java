class Solution {
    public int[] replaceElements(int[] arr) {
        int size=arr.length;
        int max=-1;
        int[] res=new int[size];
        res[size-1]=-1;
        for(int i=size-2;i>-1;i--){
            res[i]= max >arr[i+1] ? max : arr[i+1];
            max=res[i]; 
        }
        return res;
    }
}