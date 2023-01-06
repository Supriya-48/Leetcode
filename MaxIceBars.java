import java.util.Arrays;
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int icecream=0,size=costs.length;
        while (icecream < size && costs[icecream] <= coins) {
            coins -= costs[icecream];
            icecream += 1;
        }

        return icecream;
        
    }
}