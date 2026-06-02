package datastructures.graphs;

public class EarliestFinishTimeForLandAndWaterRidesI_3633 {

    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int answer = Integer.MAX_VALUE;
        for (int i=0;i< landStartTime.length;i++) {
            for (int j=0;j< waterStartTime.length;j++) {
                int timeToFinishLandRide = landStartTime[i]+landDuration[i];
                int finish1 = Math.max(timeToFinishLandRide, waterStartTime[j])+waterDuration[j];
                answer = Math.min(answer, finish1);

                int timeToFinishWaterRide = waterStartTime[j]+waterDuration[j];
                int finish2 = Math.max(timeToFinishWaterRide, landStartTime[i])+landDuration[i];
                answer = Math.min(answer, finish2);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] landStartTime = {2,8};
        int[] landDuration = {4,1};
        int[] waterStartTime = {6};
        int[] waterDuration = {3};
        EarliestFinishTimeForLandAndWaterRidesI_3633 e = new EarliestFinishTimeForLandAndWaterRidesI_3633();
        System.out.println(e.earliestFinishTime(landStartTime, landDuration, waterStartTime, waterDuration));
    }
}
