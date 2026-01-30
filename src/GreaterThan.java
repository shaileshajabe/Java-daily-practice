public class GreaterThan {
    public int greaterthan(int arr[]) {
        int sum = 0;
        int average = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        average = sum / (arr.length);
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > average) {
                count++;
            }
        }
        return count;
    }
}
