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
        System.out.println ( array [0] + ",");
        System.out.println ( array [1] + ",");
        System.out.println ( array [2] + ",");

        double[] array2 = { 1.57,7.654,9.986};
        System.out.println ( array2 [0] + ",");
        System.out.println ( array2 [1] + ",");
        System.out.println ( array2 [2] + ",");

       long [] array3 = { 2020, 2021, 2022 };
        System.out.println ( array3 [0] + ",");
        System.out.println ( array3 [1] + ",");
        System.out.println ( array3 [2] + ",");

// 3 задание

        int [] arr11 = new int [3];
        arr11 [0] = 1;
        arr11 [1] = 2;
        arr11 [2] = 3;
        System.out.println ( arr11 [2] + ",");
        System.out.println ( arr11 [1] + ",");
        System.out.println ( arr11 [0] + ",");

        double[] arr22 = { 1.57,7.654,9.986 };
        System.out.println ( arr22 [2] + ",");
        System.out.println ( arr22 [1] + ",");
        System.out.println ( arr22 [0] + ",");

        long [] arr33 = { 2020,2021,2022 };
        System.out.println ( arr33 [2] + ",");
        System.out.println ( arr33 [1] + ",");
        System.out.println ( arr33 [1] + ",");

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