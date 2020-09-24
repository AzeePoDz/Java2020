package pr1;

import java.util.Random;

public class main {
    // практическая 1.3
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int Sum = 0;
        for (int i = 0; i < array.length; i++) {
            Sum = Sum + array[i];
        }
        System.out.println(Sum);
        Sum = 0;
        int i = 0;
        while (i < array.length){
            Sum = Sum + array[i];
            i++;
        }
        System.out.println(Sum);
        Sum = 0;
        i = 0;
        do {
            Sum = Sum+array[i];
            i++;
        }
        while (i<array.length);
        System.out.println(Sum);
    }
// практическая 1.4
public static void Argum(String[] args){
        for (int j = 0; j< args.length; j++){
            System.out.println(args[j]);
        }
}
//Практическая 1.5
    public static void Harmony(String[] args){
        System.out.println(1);
        for (int l = 2; l < 11; l++)
            System.out.println(1+"/"+l);

    }
    //Практическая 1.6
    public static void Rand(String[] args)
    {
        Random random = new Random();
        int[] mas = new int[random.nextInt(100) + 10];

        for (int b = 0; b < mas.length; b++) {
            mas[b] = random.nextInt(100) + 10;
        }
        for (int b = 0; b < mas.length; b++)
            System.out.println(mas[b]);
    }
    //Практическая 1.7
    static int Factorial(int n)
    {
        int r = 1;
        for (int a = 2; a <= n+1; a++ ){
            r=r*a;
        }
        return r;
    }
}
