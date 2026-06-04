package datastructures;

public class TotalWavinessOfNumbersInRangeI_3751 {

    public int totalWaviness(int num1, int num2) {
        int waviness = 0;
        for (int num=num1;num<=num2;num++) {
            String number = Integer.toString(num);
            for (int i=1;i<=number.length()-2;i++) {
                if (((number.charAt(i) < number.charAt(i-1) && number.charAt(i) < number.charAt(i+1)) ||
                        (number.charAt(i) > number.charAt(i-1) && number.charAt(i) > number.charAt(i+1)))) {
                    waviness++;
                }
            }
        }
        return waviness;
    }

    public static void main(String[] args) {
        TotalWavinessOfNumbersInRangeI_3751 t = new TotalWavinessOfNumbersInRangeI_3751();
        System.out.println(t.totalWaviness(4848, 4848));
    }
}
