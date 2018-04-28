package pl.sda.javastart.weekend1.day2;

public class Arrays2d {
    public static void main(String[] args) {
//        printGrid(10, 10);
        printGrid(13, 10);
        fillWithNumbers_2();
    }
    public static void printGrid(int n, int m) {
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
public static void fillWithNumbers_2(){
    int[][] ints = new int[5][5];
    for (int i = 0; i < ints.length; i++) {
        for (int j = 0; j < ints[i].length; j++) {
            if(i==j){
                ints[i][j] = j;
            }
            System.out.print(ints[i][j]+" ");
        }
        System.out.println();
    }

}
}
