package datastructures.graphs;

public class EarliestFinishTimeForLandAndWaterRidesII_3635 {

    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int landAndWater = calculateTime(landStartTime,landDuration, waterStartTime, waterDuration);
        int waterAndLand = calculateTime(waterStartTime, waterDuration, landStartTime,landDuration);
        return Math.min(landAndWater, waterAndLand);
    }

    private int calculateTime(int[] firstStartTime, int[] firstDuration, int[] secondStartTime, int[] secondDuration) {
        int earliestFirstEnd = Integer.MAX_VALUE;
        for (int i=0;i<firstStartTime.length;i++) {
            int endTime = firstStartTime[i]+firstDuration[i];
            earliestFirstEnd = Math.min(endTime, earliestFirstEnd);
        }

        int minimumTimeTotal = Integer.MAX_VALUE;
        for (int i=0;i< secondStartTime.length;i++) {
            int secondTripStart = Math.max(earliestFirstEnd, secondStartTime[i]);
            int totalTime = secondTripStart+secondDuration[i];
            minimumTimeTotal = Math.min(minimumTimeTotal, totalTime);
        }
        return minimumTimeTotal;
    }

    public static void main(String[] args) {
        int[] landStartTime = {2,8};
        int[] landDuration = {4,1};
        int[] waterStartTime = {6};
        int[] waterDuration = {3};

        EarliestFinishTimeForLandAndWaterRidesII_3635 e = new EarliestFinishTimeForLandAndWaterRidesII_3635();
        System.out.println(e.earliestFinishTime(landStartTime, landDuration, waterStartTime, waterDuration));
    }
}
