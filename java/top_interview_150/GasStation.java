package top_interview_150;

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int currentSum = 0;
        int totalSum = 0;
        int station = 0;

        for(int i= 0; i < gas.length; i++) {

            currentSum += gas[i] - cost[i];
            totalSum += gas[i] - cost[i];

            if (currentSum < 0) {
                station = i+1;
                currentSum = 0;
            }

        }

        return totalSum >= 0 ? station : -1;
    }
}
