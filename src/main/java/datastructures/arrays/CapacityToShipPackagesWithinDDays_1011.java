package datastructures.arrays;

public class CapacityToShipPackagesWithinDDays_1011 {

    public int shipWithinDays(int[] weights, int days) {
        int high=0, low=0;
        for (int weight : weights) {
            high += weight;
            low = Math.max(low, weight);
        }
        while (low<high) {
            int mid = low+(high-low)/2;
            if (canShip(mid, weights, days)) {
                high=mid;
            } else {
                low = mid+1;
            }
        }
        return low;
    }

    private boolean canShip(int capacity, int[] weights, int daysCount) {
        int days=1, current=0;
        for (int weight : weights) {
            if ((current+weight) > capacity) {
                days+=1;
                current=0;
            }
            current+=weight;
        }
        return days<=daysCount;
    }

    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        CapacityToShipPackagesWithinDDays_1011 c = new CapacityToShipPackagesWithinDDays_1011();
        System.out.println(c.shipWithinDays(weights, 5));
    }
}
