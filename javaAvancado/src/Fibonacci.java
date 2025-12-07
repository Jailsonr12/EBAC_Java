import java.util.Map;

public class Fibonacci {

    private static final int MAX_ELEMENTOS = 100;
    private static final long[] elementosFibonacci = new long[MAX_ELEMENTOS];


    public static long encontrarElementoPD(int n) {
        for(int i = 0; i < MAX_ELEMENTOS; i++) {
            elementosFibonacci[i] = -1;
        }

        return encontraElementoFibonacci(n);
    }

    public static long encontraElementoFibonacci(int n) {

        if(elementosFibonacci[n] == -1){
            if (n <= 1) {
                elementosFibonacci[n] = n;
            }else{
                elementosFibonacci[n] = encontraElementoFibonacci(n - 1) + encontraElementoFibonacci(n - 2);
            }
        }
        return elementosFibonacci[n];
    }

    static void main() {
        int n = 50;

        System.out.println("Elemento " + n + ": "+ encontrarElementoPD(n));
    }


}
