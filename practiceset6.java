/*-------------------Practiceset6----------------------*/
/*Q1.WAP in java to print sum of 5 float numbers in an array.*/
class practiceset6{
    public static void main(String[] args){
        float [] array = { 7.6f, 8.6f, 9.6f, 7.3f, 12.4f };
        float sum = 0;
        for(int i = 0;i < 5;i++){
            sum = sum + array[i];
        }
        System.out.println(sum);
    }
}

/*Q2.WAP to find out whether a integer is present in an array or not.*/
class practiceset6{
    public static void main(String[] args){
        int [] array = {2,4,6,8,10};
        int n = 10;
        boolean found = false;
        for(int i = 0;i < 5;i++){
            if(n == array[i]){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println(n + " is present in an array!");
        }
        else{
            System.out.println(n + " is not present in an array!");
        }
    }
}

/*Q3.Calculate the average marks from an array containing marks of all students in physics using for each loop.*/
class practiceset6{
    public static void main(String[] args){
        int [] marks = {70,80,90,99,100};
        int sum = 0;
        for(int element:marks){
            sum = sum + element;
        }
        int avg = sum/marks.length;
        System.out.println("The average of physics marks is " + avg);
    }
}

/*Q4.Create a java program to add 2 matrices of size 2 x 3.*/
class practiceset6{
    public static void main(String[] args){
        int [][] mat1 = {{1,2,3},
                         {4,5,6}};
        int [][] mat2 = {{2,3,4},
                         {5,6,7}};
        int [][] result = {{0,0,0},
                         {0,0,0}};
        for(int i = 0;i < mat1.length;i++){
            for(int j = 0;j < mat1[i].length;j++){
                System.out.format("Setting value for i = %d and j = %d\n",i,j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for(int i = 0;i < mat1.length;i++){
            for(int j = 0;j < mat1[i].length;j++){
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println("");
        }
    }
}

/*Q5.WAP to reverse an array.*/
class practiceset6{
    public static void main(String[] args){
        int [] array = {5,10,15,20,25};
        int l = array.length;
        int n = Math.floorDiv(l,2);
        int temp;
        for(int i = 0;i < n;i++){
            temp = array[i];
            array[i] = array[l-i-1];
            array[l-i-1] = temp;
        }
        for(int element:array){
            System.out.println(element + " ");
        }
    }
}

/*Q6.WAP to  print maximum element of an array.*/
class practiceset6{
    public static void main(String[] args){
        int [] array = {5,10,15,20,25};
        int max = 0;
        for(int i = 0;i < array.length;i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println(max);
    }
}

/*Q7.WAP to print minimum element of an array.*/
class practiceset6{
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5};
        int min = arr[0];
        for(int i = 0;i < arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}

/*Q8.WAP in java that whether an array is sorted or not.*/
class practiceset6{
    public static void main(String[] args){
        int [] arr = {1,3,6,2,5};
        boolean sorted = true;
        for(int i = 0;i < arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                sorted = false;
                break;
            }
        }
        if(sorted){
            System.out.println("Sorted");}
        else{
            System.out.println("Not Sorted");}
    }
}