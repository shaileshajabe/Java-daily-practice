import java.util.Arrays;

public class secondSmallestElement {
    //find the second-smallest element
    void secondsmallest(int arr[]){
        int firstS = Integer.MAX_VALUE;
        int secondS = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<firstS){
                secondS=firstS;
                firstS=arr[i];
            }else if (arr[i] > firstS && arr[i] < secondS) {
                secondS = arr[i];
            }
        }
        System.out.println(secondS);
    }

    void SecondSmall(int[] arr){
        if(arr.length<2){
            System.out.println(-1);
            return;
        }
        Arrays.sort(arr);
        int r=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>r){
                System.out.println(arr[i]);
                return;
            }
        }

        System.out.println(-1);
    }
}
