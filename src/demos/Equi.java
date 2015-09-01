package demos;


/*
    https://codility.com/demo/results/demo65WBRW-C5E/

*/
public class Equi {

    public int solution(int[] A) {

        long L = 0;
        long R = 0;

        for (int a : A)
            R += a;

        for (int i = 0; i < A.length; i++) {

            R -= A[i];

            if (L == R)
                return i;

            L += A[i];
        }

        return -1;
    }

    public static void main(String[] args) {

        Equi equi = new Equi();
        System.out.println(Integer.toString(equi.solution(new int[]{-1, 3, -4, 5, 1, -6, 2, 1})));
    }
}
