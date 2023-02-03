class Solution {
    public double findSlope(int x1,int y1,int x2,int y2){
        if(x2==x1){
            return Double.MAX_VALUE;
        }
        if(y2==y1){
            return 0;
        }
        return (double)(y2-y1)/(double)(x2-x1);
    }
    public int maxPoints(int[][] points) {
        int size=points.length;
        int count=0;
         if(size==1){
             return 1;
         }
        for (int i=0; i < size; i++) {
            Map<Double,Integer> map=new HashMap<>();
            for (int j=i+1; j < size; j++) {
                double slope = findSlope(points[i][0],points[i][1],points[j][0],points[j][1]);
                
                map.put(slope, map.getOrDefault(slope, 0) + 1);
            
                count = Math.max(count, map.get(slope));
            }    
        }
        return count + 1;
    }
}