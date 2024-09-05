public class Largest {
    public static int findLargestinArray(int arr[]){
        int max=arr[0];
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] D={10,4,3,8,1};
        int[] E={15,8,23,9,4};
        int H=findLargestinArray(D);
        System.out.println("The largest element in the array is:"+H);
        int A=findLargestinArray(E);
        System.out.println("The largest element in the array is:"+A);
    }
}
