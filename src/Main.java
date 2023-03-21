import java.util.Scanner;

public abstract class Main extends Dog  {
    public static void main(String[] args) {
     int[][] num = {
             {1,2,3,4},
                   {4,5,6,7},
             {5,6,8,9}};
     for (int i = 0; i< num.length ;i++){
         for (int j = 0; j < num[i].length ; j++) {
             System.out.print(num[i][j] + " ");
         }
         System.out.println();
     }

}}