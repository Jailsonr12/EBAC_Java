package teste.java;

// ================================
// Testes unitários - Exercício 1
// JUnit 5
// ================================

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private final Calculadora calc = new Calculadora();

    @Test
    @DisplayName("Deve somar corretamente")
    void deveSomar() {
        assertEquals(5, calc.somar(2, 3));
        assertEquals(0, calc.somar(2, -2));
        assertEquals(-7, calc.somar(-3, -4));
    }

    @Test
    @DisplayName("Deve subtrair corretamente")
    void deveSubtrair() {
        assertEquals(1, calc.subtrairPublico(3, 2));
        assertEquals(5, calc.subtrairPublico(3, -2));
        assertEquals(-1, calc.subtrairPublico(-3, -2));
    }

    @Test
    @DisplayName("Deve multiplicar corretamente")
    void deveMultiplicar() {
        assertEquals(6, calc.multiplicarPublico(2, 3));
        assertEquals(0, calc.multiplicarPublico(999, 0));
        assertEquals(-12, calc.multiplicarPublico(-3, 4));
    }

    @Test
    @DisplayName("Deve dividir corretamente (divisão inteira)")
    void deveDividir() {
        assertEquals(2, calc.dividirPublico(6, 3));
        assertEquals(3, calc.dividirPublico(7, 2)); // divisão inteira: 7/2 = 3
        assertEquals(-2, calc.dividirPublico(5, -2)); // 5/-2 = -2 (trunca)
    }

    @Test
    @DisplayName("Deve lançar erro ao dividir por zero (division by zero)")
    void deveLancarErroAoDividirPorZero() {
        assertThrows(ArithmeticException.class, () -> calc.dividirPublico(10, 0));
    }
}
