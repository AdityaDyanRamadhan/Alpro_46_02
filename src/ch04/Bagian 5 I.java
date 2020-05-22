package ch04;

public class SelisihArray {

    public static void main(String[] args) {

    int [] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
    System.out.print("Menampilkan Semua Data Di Array : ");

int i;
        for ( i=0; i < array.length; i++ ) {
            System.out.print(array[i] + "");
        }

        System.out.println();

        int selisihnya = array[0]-array[1];
        for ( i=0; i < array.length; i++ ) {
            if ( i==array.length-1 ) {

            } else {
                selisihnya = array[i]-array[i+1];


                System.out.println("Selisihnya " + array[i] + " Dengan " + array[i+1] + " : " + selisihnya);

            }
        }




    }
}