public class CountDouplicate {
    public static void main(String[] args) {
        int[] arr = {10,20,30,20,40,10};
        int[] list = new int[4];

        for(int i = 0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    list[i] = arr[i];
                }
            }
        }
        for(int k =0;k<list.length;k++){
            System.out.println(list[k]);
        }
    }
}
