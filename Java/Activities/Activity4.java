package activities;

public class Activity4 {
    public static void main(String[] args) {
        int arr[]={10,5,35,8,40,-2,4,20,1};
        beforeSorting(arr);
        afterSorting(arr);
    }

    private static void beforeSorting(int[] arr) {
        System.out.print("Before sorting value: ");
        for(int val:arr){
            System.out.print(val+" ");
        }
    }

    private static void afterSorting(int[] arr) {
        System.out.println();
        System.out.print("After sorting value: ");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
