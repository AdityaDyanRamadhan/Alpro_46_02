package ch04;

public class Angka2 {

    public static void main(String[] args) {

        int [] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int angkaYangSama = 12;

        System.out.println("Menampilkan Semua Nilai Di Array : ");

        for (int i=0; i < nilai.length; i++) {
            System.out.print(nilai[i] + " ");
        }
        System.out.println("\n");

        System.out.print("Yang Hanya Memiliki Anga 2 Di Array Adalah = ");
        for (int i=0; i < nilai.length; i ++) {
            if (nilai.equals(angkaYangSama)) {
                System.out.print(nilai[i] + " ");
            }
        }

    }
    
}