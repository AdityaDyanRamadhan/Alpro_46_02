package ch04;

public class totalAngkaArray {
    
    public static void main(String[] args) {


        int [] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.print("Menampilkan Semua Nilai Di Array : ");

        for (int i = 0; i < nilai.length; i ++) {
            System.out.println(nilai[i] + " ");
        }

        System.out.println();
        System.out.print("Jumlah Angka Yang Ada Di Dalam Array : " + nilai.length);

        System.out.println();

        int Jumlah = 0;
        for (int Angka : nilai) {
            Jumlah = Jumlah + Angka;
        }

        System.out.print("Penjumlahan Semua Angka Hasilnya : " + Jumlah);


    }

}