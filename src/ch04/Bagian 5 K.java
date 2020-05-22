package ch04;

public class AngkaBernilaiBesar {

    public static void main(String[] args) {

        int [] nilai = {83, 12, 41, 38, 19, 26, 9,48, 20, 55, 8, 32, 3};

        System.out.print("Menampilkan Semua Data Yang Ada Di Dalam Array");

        for (int i = 0; i < nilai.length; i++) {
            System.out.print(nilai[i] + " ");
        }

        System.out.println();
        System.out.println();

        System.out.println("Angka Terbesar Setelah : ");

        for (int i = 0 ; i < nilai.length; i++) {
            for (int q=1;q<nilai.length-1;q++) {
                if (nilai[q] > nilai [i]) {

                    System.out.print(nilai[i] + " < " + " ; ");

                }
            }

            System.out.println();
            System.out.println();


        }

    }
    
}