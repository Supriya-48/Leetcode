package top_interview_150;

public class Candy {
    public int candy(int[] ratings) {
        int[] candies = new int [ratings.length];
        for(int i=0;i<ratings.length;i++){
            candies[i]=1;
        }
        for(int i=1;i<ratings.length;i++){
            if(candies[i-1] >= candies[i] && ratings[i-1] < ratings[i]){
                candies[i] = candies[i-1]+1;
            }
        }
        for(int i=ratings.length-2;i>=0;i--){
            if(candies[i+1] >= candies[i] &&  ratings[i+1] < ratings[i]){
                candies[i] = candies[i+1]+1;
            }
        }
        int sum=0;
        for(int i=0;i<candies.length;i++){
            sum+=candies[i];
        }
        return sum;
    }
}
