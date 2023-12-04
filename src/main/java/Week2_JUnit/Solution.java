package Week2_JUnit;
public class Solution {
    public static int max2Int(int a, int b) {
        return Math.max(a, b);
    }

    public static int minArray(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static String calculateBMI(double w, double h) {
        double opt = w / (h * h);
        opt = Math.round(opt * 10.0) / 10.0;
        String s = "nostring";
        if (opt < 18.5) {
            s = "Thiếu cân";
        } else if (opt >= 18.5 && opt <= 22.9) {
            s = "Bình thường";
        } else if (opt >= 23 && opt <= 24.9) {
            s = "Thừa cân";
        } else if (opt >= 25) {
            s = "Béo phì";
        }
        return s;
    }
}
