package ch04;

public class SelisihAngkaYangGenap {

    public static void main(final String[] args) {

        final int [] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};


        System.out.print("Menampilkan Semua Data Yang Ada Di Aray");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        int selisihnya = array [0] - array [1];
        for ( int i = 0; i < array.length; i++ ) {
            for (int q = i + 1 ; q <array.length; q++) {
                if ((array[i] % 2 == 0) && (array[q] % 2 == 0)) {
                    selisihnya = array[i] - array[q];
                    System.out.println(" Selisihnya " + array[i] + " Dengan " + array[q] + " : " + selisihnya);
                }
            }
            }

        }


    }
    
