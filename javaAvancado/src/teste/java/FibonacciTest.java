package teste.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    @DisplayName("Casos base: F(0)=0 e F(1)=1")
    void deveCalcularCasosBase() {
        assertEquals(0, Fibonacci.fibRecursive(0));
        assertEquals(1, Fibonacci.fibRecursive(1));
    }

    @Test
    @DisplayName("Valores conhecidos: F(2)=1, F(3)=2, F(10)=55")
    void deveCalcularValoresConhecidos() {
        assertEquals(1, Fibonacci.fibRecursive(2));
        assertEquals(2, Fibonacci.fibRecursive(3));
        assertEquals(55, Fibonacci.fibRecursive(10));
    }

    @Test
    @DisplayName("Entrada inválida: n negativo deve lançar exceção")
    void deveLancarExcecaoParaNegativo() {
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.fibRecursive(-1));
    }
}
text
Copiar código
