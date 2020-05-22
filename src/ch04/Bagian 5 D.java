package ch04;

public class KelipatanAngka3 {

    public static void main(String[] args) {

        int q [] = { 82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3 };

        System.out.println(" ");
        System.out.print("Bilangan Kelipatan 3 Adalah : ");
        for (int i = 0; i < q.length; i++) {
            if (q [i] % 3 ==0) {
                System.out.print( q [i] + "  ");
            }
        }

        System.out.println(" ");

    }
    
}