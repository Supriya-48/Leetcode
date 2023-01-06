class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int maxSquare=0;
        int count=0,side=0;
        int size=rectangles.length;
        for(int i=0;i<size;i++){
            side=Math.min(rectangles[i][0],rectangles[i][1]);
            System.out.print(side);
            if(maxSquare<side){
                count=1;
                maxSquare=side;
            }else if(maxSquare==side){
                count++;
            }
        }
        return count;
    }
}