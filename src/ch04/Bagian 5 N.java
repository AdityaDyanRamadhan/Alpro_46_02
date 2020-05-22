package ch04;

public class JumlahArrayAngkaSebelumnnya {

    public static void main(final String[] args) {

    final int [] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

    System.out.print("Menampilkan Semua Data Yang Ada di Array : ");

    for ( int i=0; i < nilai.length; i++ ) {
        System.out.print(nilai[i] + " ");
    }

    System.out.println();
    System.out.println();

    int jumlahnya = 0;
    for ( int i = 0; i < nilai.length; i++) {
        for ( final int array:nilai ) {
            if ( nilai[i] < nilai.length ) {
                jumlahnya=nilai.length-nilai[i];
            }
        }

        System.err.println("Jumlah Angka Sebelum : " + nilai[i] + " = " + jumlahnya);
    
    }
    }
  }