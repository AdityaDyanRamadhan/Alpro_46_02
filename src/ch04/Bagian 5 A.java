package ch04;
public class menampilkanNilaiArray {

    public static void main(String[] args) {

        int q[] = {82,12,41,38,19,26,9,48,20,55,8,32,3};

        Array(q);

    }

    public static void Array(int[] w) {
        for (int i = 0; i < w.length; i++) {
            System.out.println(w[i] + "  ");
        }
    }

}