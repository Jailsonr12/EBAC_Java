package main.java;

// ================================
// Exercício 1 + Exercício 3
// Classe Calculadora com JavaDoc
// + testes unitários (JUnit 5)
// ================================

/**
 * Calculadora simples para operações básicas.
 *
 * <p>Observação: o enunciado pede métodos privados. Para permitir testes unitários
 * sem usar reflection, eu mantive os métodos "core" privados e expus métodos públicos
 * finos (wrappers) que delegam para os privados.</p>
 */
public class Calculadora {

    /**
     * Soma dois inteiros.
     */
    public int somar(int a, int b) {
        return adicionar(a, b);
    }

    /**
     * Subtrai dois inteiros.
     */
    public int subtrairPublico(int a, int b) {
        return subtrair(a, b);
    }

    /**
     * Multiplica dois inteiros.
     */
    public int multiplicarPublico(int a, int b) {
        return multiplicar(a, b);
    }

    /**
     * Divide dois inteiros.
     *
     * @throws ArithmeticException se b for 0 (division by zero).
     */
    public int dividirPublico(int a, int b) {
        return dividir(a, b);
    }

    // ========== Métodos pedidos no enunciado (privados) ==========

    private int adicionar(int a, int b) {
        return a + b;
    }

    private int subtrair(int a, int b) {
        return a - b;
    }

    private int multiplicar(int a, int b) {
        return a * b;
    }

    private int dividir(int a, int b) {
        // Em Java, divisão inteira por zero lança ArithmeticException automaticamente.
        return a / b;
    }
}
