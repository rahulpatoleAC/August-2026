public class moveZeroToEnd {
    public static void main(String[] args){
        int[] arr = {0, 5, 0, 3, 8, 0, 2};
        int nonZero = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != 0){
                arr[nonZero] = arr[i] ;
                nonZero++;
            }
        }

        // fill remaining position with zero
        for(int i= nonZero ; i< arr.length ;i++){
            arr[i] = 0;
        }
        for(int i = 0; i < arr.length;i++){
        System.out.print( arr[i] + " ");
        }

    }
}
