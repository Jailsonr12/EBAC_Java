package main.java;

// ================================
// Exercício 2 – Fibonacci recursivo
// + testes unitários (3+ testes)
// ================================

public class Fibonacci {

    /**
     * Retorna o n-ésimo valor de Fibonacci usando recursão.
     *
     * Regras:
     * F(0) = 0
     * F(1) = 1
     * F(n) = F(n-1) + F(n-2), para n >= 2
     *
     * @throws IllegalArgumentException se n for negativo.
     */
    public static long fibRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n não pode ser negativo");
        }
        if (n <= 1) {
            return n;
        }
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }
}
