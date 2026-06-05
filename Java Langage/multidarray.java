/*-----------Multi-Dimensional Array------------------------------*/
class multidarray{
    public static void main(String[] args){
        int [][] flat = new int[2][3];//Syntax of multidimensional array
        flat[0][0] = 100;
        flat[0][1] = 101;
        flat[0][2] = 102;
        flat[1][0] = 103;
        flat[1][1] = 104;
        flat[1][2] = 105;
        //Displaying Flat numbers
        for(int i = 0;i <flat.length;i++){
            for(int j = 0;j < flat[i].length;j++){
                System.out.print(flat[i][j]);
                System.out.print(" ");
            }
            System.out.println("");//For new line
        }
    }
}