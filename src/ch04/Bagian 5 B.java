package ch04;

import java.util.Scanner;

public class MencariSebuahAngka {


    public static void main(final String[] args) {

        final int nilai[] = {82,12,41,38,19,26,9,48,20,55,8,32,3};
        final Scanner yuk = new Scanner(System.in);
       

        System.out.println("SILAHKAN MASUKAN NILAI YANG INGIN DICARI");
        final int nilaiY = yuk.nextInt();
        for (int i = 0; i < nilai.length; i++) {

            if (nilai[i] == nilaiY) {
                System.out.println("Angka = " + nilaiY + "Berada Di Indeks " + i);
                yuk.close();
            }

        }

    }
    
}