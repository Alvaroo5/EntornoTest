package Ej19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LavadoraTest {
	
	@Test
	@DisplayName("Constructor valido de lavadora")
	void testConstructorPorDefecto() {
		Lavadora lavadora = new Lavadora();
		assertEquals(Electrodomestico.PRECIO_BASE_DEF, lavadora.getPrecioBase());
	    assertEquals(Electrodomestico.PESO_DEF, lavadora.getPeso());	
	    assertEquals(Electrodomestico.CONSUMO_ENERGETICO_DEF, lavadora.getConsumoEnergetico());
	    assertEquals(Electrodomestico.COLOR_DEF, lavadora.getColor());
	    assertEquals(Lavadora.CARGA_DEF, lavadora.getCarga());
	}
	
	@Test
	@DisplayName("Constructor valido de lavadora")
	void testConstructorConPrecioYPeso() {
        double precio = 350;
        double peso = 22;
        Lavadora lavadora = new Lavadora(precio, peso);
        assertEquals(precio, lavadora.getPrecioBase());
        assertEquals(peso, lavadora.getPeso());
        assertEquals(Electrodomestico.CONSUMO_ENERGETICO_DEF, lavadora.getConsumoEnergetico());
        assertEquals(Electrodomestico.COLOR_DEF, lavadora.getColor());
        assertEquals(Lavadora.CARGA_DEF, lavadora.getCarga());
    }
	
	@Test
	@DisplayName("Constructor valido de lavadora")
	void testConstructorCompleto() {
        double precio = 450;
        double peso = 40;
        char consumoEnergetico = 'A';
        String color = "rojo";
        int carga = 60;
        Lavadora lavadora = new Lavadora(precio, peso, consumoEnergetico, color, carga);
        assertEquals(precio, lavadora.getPrecioBase());
        assertEquals(peso, lavadora.getPeso());
        assertEquals(consumoEnergetico, lavadora.getConsumoEnergetico());
        assertEquals(color, lavadora.getColor());
        assertEquals(carga, lavadora.getCarga());
    }
	
	@Test
	@DisplayName("Constructor valido de lavadora")
	void testToString() {
        Lavadora lavadora = new Lavadora(120, 16, 'C', "verde", 15);
        String expectedString = "Lavadora{precioBase=120.0, color=verde, consumoEnergetico=C, peso=16.0, carga=15, precioFinal=350.0}";
        assertEquals(expectedString, lavadora.toString());
    }
	
	
	
}
