import java.util.Random;
public class Task5 {
       public static void main(String[] args) {
           int height = 5;
           int width = 10;
           int[][] array5 = new int[height][width];
           Random rand = new Random();
           for (int i = 0; i < height; i++) {
               for (int j = 0; j < width; j++) {
                   array5[i][j] = rand.nextInt(99);
                   System.out.print(array5[i][j] + " ");
               }
               System.out.println("");
           }
           System.out.println("=================================");
           int[] sums = new int[height];

           for (int i = 0; i < height; i++) {
               for (int j = 0; j < width; j++) {
                   sums[i] = sums[i] + array5[i][j];
               }
           }
           for (int i = 0; i < height; i++) {
               System.out.println(i + 1 + " (sum) => " + sums[i]);
           }
           System.out.println("=================================");
           int nomer_max_ryadka =0;
           int max_number = 0;
           for (int k=0;k<height;k++){
               if (sums[k]>max_number){
                   max_number=sums[k];
                   nomer_max_ryadka=k+1;
               }
               }
           System.out.println("Номер рядка з максимальною сумою чисел становить: " + nomer_max_ryadka);
       }
       }