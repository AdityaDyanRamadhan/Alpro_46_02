package ch04;

public class HitungJumlahSelisih {

    public static void main(String[] args) {

        int [] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        int jumlahnya = 0;
        System.out.print("Menampilkan Semua Data Di Array : ");
        int i;

        for  ( i=0; i < nilai.length; i ++ ) {
            System.out.print(nilai[i] + "  ");
        }

        System.out.println();

        int selisihnya = nilai[0]-nilai[1];
        for ( i=0; i < nilai.length; i ++ ) {
            if ( i == nilai.length-1 ) {

            } else {
                selisihnya = nilai[i]-nilai[i+1];

                System.out.println("selisihnya" +  nilai[i] + " Dengan " + nilai[i+1] + " = " + selisihnya);
                jumlahnya=jumlahnya+selisihnya;


            }

        }

        System.out.println("Jumlah Angka Selisih : " + jumlahnya);

    }
    
}