package homework_3;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        findminmax();

    }

    public static void fillarr() {
        int arr[] = {1, 0, 0, 1, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        //    System.out.print(arr[i] + " ");
        }

    }

    public static void fillarr2() {
        int arr2[] = new int[100];
        int number = 0;
        System.out.println("\n");
        for (int i = 0; i < arr2.length; i++) {
            number++;
            arr2[i] = number;
         //   System.out.println(arr2[i]);
        }
    }

    public static void fillarr3() {
        System.out.println("\n");
        int arr3[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
          //  System.out.print(arr3[i] + " ");
        }
    }

    public static void diagonalarr4() {
        System.out.println("\n");
        int n = 4;
        int arr4[][] = new int[n][n];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i][i] = 1;
            arr4[i][n - 1 - i] = 1;
            ;
        }
    }

    public static int[] initialarray(int len, int initialVaue) {
        int temporary_array[] = new int[len];
        for (int i = 0; i < len; i++) {
            temporary_array[i] = initialVaue;
        }
        return temporary_array;
    }
    public static void findminmax(){
        int arr5[] = {0,7,6,3,1,2,3};
        int max=arr5[0];
        int min=arr5[0];
        for (int i = 1; i < arr5.length - 1; i++) {
            if (arr5[i] > max) {
                max = arr5[i];
            }
            if (arr5[i] < min) {
                min = arr5[i];
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }

    }
  //  public static void shiftarray(int arrshift[], int n){
    //    for (int i = 0; i < n; i++) {
      //      arrshift[]

      //  }


