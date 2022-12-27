class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result=new ArrayList<>();
        int size=candies.length;
        int j;
        int maxi=-1;
        for(int i=0;i<size;i++){
            maxi=Math.max(candies[i],maxi);
        }
        for(int i=0;i<size;i++){
            result.add(candies[i]+extraCandies >=maxi ? true : false);
        }
        return result;
    }
}