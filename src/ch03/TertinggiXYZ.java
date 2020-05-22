package ch03;

public class nilaiTertinggiXYZ {

    public static void main(String[] args) {

        int x = 2;
        int y = 12;
        int z = 23;


        System.out.println("Nilai X = " + x);
        System.out.println("Nilai y = " + y);
        System.out.println("Nilai z = " + z);

        if (  x > y && x > z  ) {

            System.out.println("Nilai Tertinggi Adalah = " + x);

        } else if ( y > x && y > z ) {
            
            System.out.println("Nilai Tertinggi Adalah = " + y);

        } else {

            System.out.println("Nilai Tertinggi Adalah = " + z);

        }
        


    }
    
}