public class Largest{
    
    // create the static array ..
    static int arr[] = {20, 104, 20, 4, 100};

     // Method to find maximum in arr[] 
     static int max = arr[0];

     static int largest(){
        for ( int i = 1 ; i < arr.length; i++ ){
                if(arr[i] > max){
                    max = arr[i];
                }
        }
        return max;
     }

    // create the main method 

    public static void main(String args[]){
        //calling the function 
       System.out.println(largest());

    }
}