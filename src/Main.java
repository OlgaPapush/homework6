public class Main {
    public static void main(String[] args) {

        // 1 задание
        int [] arr = new int [3];
        arr [0] =  1;
        arr [1] = 2;
        arr [2] = 3;
        for ( int i = 0; i < arr.length ; i++) {
            System.out.println ( arr [i]);
        }
        double [] arr2 = { 1.57, 7.654,9.986};
        for (int i = 0; i < arr2.length; i++) {
            System.out.println ( arr2 [i]); }

            long [] arr3 = { 2020, 2021, 2022 };
            for (int i = 0; i < arr3.length; i ++) {
                System.out.println ( arr3 [i]);
            }

        // 2 задание

        int [] array = new int [3] ;
        array [0] = 1;
        array [1] = 2;
        array [2] = 3;
        for ( int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i] + " , ");
        }

        double[] array2 = { 1.57, 7.654,9.986};
        for (int i = 0; i < arr2.length; i++) {
            System.out.println ( arr2 [i] + ","); }

        long [] array3 = { 2020, 2021, 2022 };
        for (int i = 0; i < arr3.length; i ++) {
            System.out.println ( arr3 [i] + ",");
        }

// 3 задание

        int [] arr11 = new int [3];
        arr11 [0] = 1;
        arr11 [1] = 2;
        arr11 [2] = 3;
        for ( int i = 0; i > arr11.length ; i--) {
            System.out.println(arr[i] + " , ");
        }

        double[] arr22 = { 1.57, 7.654,9.986};
        for (int i = 0; i > arr2.length; i--) {
            System.out.println ( arr2 [i] + ","); }

        long [] arr33 = { 2020, 2021, 2022 };
        for (int i = 0; i > arr3.length; i --) {
            System.out.println ( arr3 [i] + ",");
        }

        // 4 задание

        int[] array1 = new int [3];
        array1 [0] = 1;
        array1 [1] = 2;
        array1 [2] = 3;
        for (int i = 0; i < array1. length; i++){
            if (array1[i]%2!=0)
                array1[i] = array1[i]+1;
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.println (array1[i]);
        }
    }
}