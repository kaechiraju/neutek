package demo.dataStructure.Arrays;


class Arrays {
    public static void main(String[] args) {
        int[] arr;

        arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        //#For_loops
        // size/length  is mentioned or given at the point of initialization of an array . Index is always one less then size of the array, as index is zero based
        for (int i = 0; i <= arr.length-1; i++) {
            System.out.println("Element at index for incrementor arr[" + i + "] : " + arr[i]);
        }

        int [] points = new int[]{ 1,2,3,4 };

        for (int value : points) {
            System.out.println("Element at index from for each with no index refernce + " +  + value);
        }



        int[] data = {10,20,30,40,50,60,71,80,90,91};
        System.out.println("decrementer for loop on data array with length " + data.length);

        for (int i = data.length-1; i > 0; i--) {
            System.out.println("Element at index  for decrementer  data [" + i + "] : " + data[i]);
        }


        System.out.println("Checking bit operators 1<1 :" + (1<1));
        System.out.println("Checking bit operators 1<=1 :" + (1<=1));
        System.out.println("Checking bit operators 1>1 :" + (1>1));
        System.out.println("Checking bit operators 1>=1 :" + (1>=1));


    }






}