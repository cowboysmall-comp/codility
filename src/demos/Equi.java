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
}
