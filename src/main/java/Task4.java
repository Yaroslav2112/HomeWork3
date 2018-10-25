import java.util.Random;
public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrey1 = new int[10];
        int[] arrey3 = new int[10];
        System.out.println("==============================");
        for (int i = 0; i < arrey1.length; i++) {
            arrey1[i] = random.nextInt(99);
            arrey3 [i] = arrey1 [i];
            System.out.print(arrey1[i] + " ");
        }
        System.out.println(" ");
        System.out.println("==============================");
        int [] arrey2 = new int[10];
        for (int i = 0; i < arrey1.length; i++) {
            int sum = 0;
            while (arrey1[i]>0) {
                sum=sum+arrey1[i]%10;
                arrey1[i]=arrey1[i]/10;
                arrey2[i]=sum;};
            System.out.println("Сума цифр числа " +(i+1)+ " дорівнює "+sum);
        }
        System.out.println("==============================");
        int max= arrey2[0];
        int gg=0;
        for (int j=0; j<arrey2.length; j++) {
            if(arrey2[j]>max)
            {max=arrey2[j];
            gg=j;}
            }
    System.out.println("Максимальна сума цифр у числа: " + arrey3[gg]);
    }
    }

