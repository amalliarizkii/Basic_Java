package BasicProgamming;

public class Problem7 {
    private static float Mean(float[] numbers) {
        float Mean;
        float sum;
        int n = numbers.length;
        sum = 0;
        int i;

        for (i = 0; i < n; i++) {
            sum = sum + numbers[i];
        }

        return (sum/n);

    }

    public static void main (String[]args){
        float[] value = {1, 2, 3, 4};
        System.out.println(Mean(value));
    }
}
