package com.practica3.calculadora;

import org.junit.jupiter.api.Test;

import com.practica3.calculadora.mate.Operacion;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class OperacionTest {
    
    private Operacion operacion;
    
    @BeforeEach
    void setUp() {
        operacion = new Operacion(10, 3); // Cambiado a 10/3 para probar decimales
    }
    
    @Test
    void testSumar() {
        assertEquals(13, operacion.sumar(), 0.001);
    }
    
    @Test
    void testRestar() {
        assertEquals(7, operacion.restar(), 0.001);
    }
    
    @Test
    void testMultiplicar() {
        assertEquals(30, operacion.multiplicar(), 0.001);
    }
    
    @Test
    void testDividir() {
        // 10/3 = 3.33333... 
        assertEquals(3.33333, operacion.dividir(), 0.001);
    }
    
    @Test
    void testDividirPorCero() {
        Operacion operacionCero = new Operacion(10, 0);
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            operacionCero.dividir();
        });
        assertEquals("No se puede dividir por cero", exception.getMessage());
    }
    
    @Test
    void testConNumerosNegativos() {
        Operacion opNegativos = new Operacion(-10, 3);
        assertEquals(-7, opNegativos.sumar(), 0.001);
        assertEquals(-13, opNegativos.restar(), 0.001);
        assertEquals(-30, opNegativos.multiplicar(), 0.001);
        assertEquals(-3.33333, opNegativos.dividir(), 0.001);
    }
    
    @Test
    void testConDecimales() {
        Operacion opDecimales = new Operacion(5.5, 2.2);
        assertEquals(7.7, opDecimales.sumar(), 0.001);
        assertEquals(3.3, opDecimales.restar(), 0.001);
        assertEquals(12.1, opDecimales.multiplicar(), 0.001);
        assertEquals(2.5, opDecimales.dividir(), 0.001);
    }
}