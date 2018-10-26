import java.util.Random;
public class Task6 {
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
        int[] sums = new int[width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                sums[j] = sums[j] + array5[i][j];
            }
        }
        for (int i = 0; i < width; i++) {
            System.out.println(i + 1 + " (sum) => " + sums[i]);
        }
        System.out.println("=================================");
        int nomer_min_stovb =1;
        int min_number = sums[0];
        for (int k=1;k<width;k++){
            if (sums[k]<min_number){
                min_number=sums[k];
                nomer_min_stovb=k+1;
            }
        }
        System.out.println("Номер стовбця з мінімальною сумою чисел становить: " + nomer_min_stovb);
    }
}