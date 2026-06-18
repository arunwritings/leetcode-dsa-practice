package datastructures;

public class AngleBetweenHandsOfAClock_1344 {

    public double angleClock(int hour, int minutes) {
        double minuteAngle = minutes*6;
        double hourAngle = (hour%12)*30;
        hourAngle = hourAngle+ (minutes*0.5);
        double diff = Math.abs(hourAngle-minuteAngle);
        return Math.min(diff, 360-diff);
    }

    public static void main(String[] args) {
        AngleBetweenHandsOfAClock_1344 a = new AngleBetweenHandsOfAClock_1344();
        System.out.println(a.angleClock(12,30));
    }
}
