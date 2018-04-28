package pl.sda.javastart.weekend1.day2;

public class Arrays {
    public static void main(String[] args) {
        printGrid(10,10);

    }

    public static boolean comperArrays(int[] arraysOne, int[] arraysTwo){
        int iter = 0;
        for (int numberValue : arraysOne) {
            if(numberValue!=arraysTwo[iter]){
                return false;
            }
            iter++;
        }
        return true;
    }
    public static void printGrid(int n , int m){
        int[][] array = new int[n][m];
        for (int i :array [0] ) {
            for (int j :array[i]){
                System.out.print(array[i][j]+" ");
                }
            System.out.println();
            }
        }
    }

