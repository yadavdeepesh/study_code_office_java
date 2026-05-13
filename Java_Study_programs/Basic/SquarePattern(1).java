class SquarePattern{
   
    public static void printSquare(int row, int col){
        int a,b;
        for(a = 1; a <= row; a++){
            for(b = 1;b <= col; b++){
                if(a == 1 || a == row || b == 1 || b == col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            
            }
            System.out.println(" ");
        }
    }
}