import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    void testSoma() {
        assertEquals(5, calc.somar(2, 3));
        assertEquals(-1, calc.somar(-2, 1));
        assertEquals(0, calc.somar(0, 0));
    }

    @Test
    void testSubtracao() {
        assertEquals(1, calc.subtrair(3, 2));
        assertEquals(-3, calc.subtrair(-2, 1));
        assertEquals(0, calc.subtrair(0, 0));
    }

    @Test
    void testMultiplicacao() {
        assertEquals(6, calc.multiplicar(2, 3));
        assertEquals(-2, calc.multiplicar(-1, 2));
        assertEquals(0, calc.multiplicar(0, 100));
    }

    @Test
    void testDivisao() {
        assertEquals(2, calc.dividir(6, 3));
        assertEquals(-2, calc.dividir(-6, 3));
    }

    @Test
    void testDivisaoPorZero() {
        assertThrows(ArithmeticException.class, () -> calc.dividir(5, 0));
    }
}
