public class ArithmeticProgress {
	public static void main(String[] args) {
        int[] arr = {2, 6, 8, 10, 12,14,16,18};
        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] arr) {
        int sum = 0;
        int n = arr.length + 1;
        for (int i : arr) {
            sum += i;
        }
        return n * (n + 1) - sum;
    }

}

