import java.util.Random;
public class Task1 {
    public static void main(String[] args) {
    Random random = new Random();
        int [] arrey1 = new int [10];
        System.out.println("==============================");
        for (int i=0; i<arrey1.length; i++)
    {arrey1[i] = random.nextInt(99);
        System.out.print(arrey1[i]+" ");
    }
        System.out.println(" ");
    System.out.println("==============================");
        int min =arrey1[0];
        for (int i=0;i<arrey1.length; i++ )
        {
            if(arrey1[i]<min) {min=arrey1[i];}
        }
        System.out.println("Найближче до нуля значення дорівнює:" + min);
    }
}
