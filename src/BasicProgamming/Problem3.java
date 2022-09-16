package BasicProgamming;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args){
        Scanner a = new Scanner(System. in );
        System.out.println("Masukkan angka");
        int nilai = a.nextInt();
        System.out.println("Faktor-faktornya");

        for (int z = 1; z <= nilai; z++)
            if (nilai % z == 0){
                System.out.println(z + " ");
            }
    }
}
