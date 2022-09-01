public class Main {
    public static void main(String[] args) {

        // 1 задание
        int [] arr1 = new int [3];
        arr1 [0] =  1;
        arr1 [1] = 2;
        arr1 [3] = 3;
        for ( int i = 0; i < arr1.length ; i++) {
            System.out.println ( arr1 [i]);
        }
        double [] arr2 = { 1.57, 7.654,9.986};
        for (int i = 0; i < arr2.length; i++) {
            System.out.println ( arr2 [i]); }

            String[] arr3 = { " Массив", "номер", "три"};
            for (int i = 0; i < arr3.length; i ++) {
                System.out.println ( arr3 [i]);
            }

            // 2 задание

            int [] array1 ;
            arr1 = new int [3];
            arr1 [0] = 1;
        arr1 [0] = 2;
        arr1 [0] = 3;
        System.out.println ( arr1 [0] + ",");
        System.out.println ( arr1 [1] + ",");
        System.out.println ( arr1 [2] + ",");

        double[] array2 = { 1.57,7.654,9.986};
        System.out.println ( arr2 [0] + ",");
        System.out.println ( arr2 [1] + ",");
        System.out.println ( arr2 [2] + ",");

        String[] array3 = {"Массив", "номер", "три"};
        System.out.println ( arr3 [0] + ",");
        System.out.println ( arr3 [1] + ",");
        System.out.println ( arr3 [2] + ",");

        // 3 задание

        int [] arr1 = new int [3];
        arr1 [0] = 1;
        arr1 [1] = 2;
        arr1 [2] = 3;
        System.out.println ( arr1 [2] + ",");
        System.out.println ( arr1 [1] + ",");
        System.out.println ( arr1 [0] + ",");

        double[] arr2 = { 1.57,7.654,9.986};
        System.out.println ( arr2 [2] + ",");
        System.out.println ( arr2 [1] + ",");
        System.out.println ( arr2 [0] + ",");

        String[] arr3 = {"Массив", "номер", "три"};
        System.out.println ( arr3 [2] + ",");
        System.out.println ( arr3 [1] + ",");
        System.out.println ( arr3 [1] + ",");

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