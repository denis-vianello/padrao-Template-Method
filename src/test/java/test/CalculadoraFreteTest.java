/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

package test;

import com.mycompany.fretetemplate.CalculadoraFrete;
import com.mycompany.fretetemplate.FreteNacional;
import com.mycompany.fretetemplate.FreteInternacional;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraFreteTest {

    @Test
    public void deveCalcularFreteNacional() {
        CalculadoraFrete frete = new FreteNacional();

        assertEquals(50.0, frete.calcularFrete(10), 0.001);
    }

    @Test
    public void deveCalcularFreteInternacional() {
        CalculadoraFrete frete = new FreteInternacional();

        assertEquals(150.0, frete.calcularFrete(10), 0.001);
    }

    @Test
    public void deveCalcularFreteNacionalParaCincoQuilos() {
        CalculadoraFrete frete = new FreteNacional();

        assertEquals(25.0, frete.calcularFrete(5), 0.001);
    }
}

