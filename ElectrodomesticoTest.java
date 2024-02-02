package Ej19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ElectrodomesticoTest {

	@Test
	@DisplayName("Constructor valido de electrodomesticos")
	void testConstructorPorDefecto() {
        Electrodomestico electrodomestico = new Electrodomestico();
        assertEquals(Electrodomestico.COLOR_DEF, electrodomestico.getColor());
        assertEquals(Electrodomestico.CONSUMO_ENERGETICO_DEF, electrodomestico.getConsumoEnergetico());
        assertEquals(Electrodomestico.PRECIO_BASE_DEF, electrodomestico.getPrecioBase());
        assertEquals(Electrodomestico.PESO_DEF, electrodomestico.getPeso());
    }
	
	@Test
	@DisplayName("Constructor valido de electrodomesticos")
	void testConstructorConPrecioYPeso() {
        double precio = 500;
        double peso = 30;
        Electrodomestico electrodomestico = new Electrodomestico(precio, peso);
        assertEquals(precio, electrodomestico.getPrecioBase());
        assertEquals(peso, electrodomestico.getPeso());
        assertEquals(Electrodomestico.CONSUMO_ENERGETICO_DEF, electrodomestico.getConsumoEnergetico());
        assertEquals(Electrodomestico.COLOR_DEF, electrodomestico.getColor());
    }

	@Test
	@DisplayName("Constructor valido de electrodomesticos")
	void testConstructorCompleto() {
        double precio = 400;
        double peso = 25;
        char consumoEnergetico = 'A';
        String color = "rojo";
        Electrodomestico electrodomestico = new Electrodomestico(precio, peso, consumoEnergetico, color);
        assertEquals(precio, electrodomestico.getPrecioBase());
        assertEquals(peso, electrodomestico.getPeso());
        assertEquals(consumoEnergetico, electrodomestico.getConsumoEnergetico());
        assertEquals(color, electrodomestico.getColor());
    }

	@Test
	@DisplayName("Constructor valido de electrodomesticos")
    void testMetodosGet() {
        Electrodomestico electrodomestico = new Electrodomestico(250, 5, 'C', "negro");
        assertEquals(250, electrodomestico.getPrecioBase());
        assertEquals(5, electrodomestico.getPeso());
        assertEquals('C', electrodomestico.getConsumoEnergetico());
        assertEquals("negro", electrodomestico.getColor());
    }
	
	@Test
	@DisplayName("Constructor valido de electrodomesticos")
	void testToString() {
        Electrodomestico electrodomestico = new Electrodomestico(120, 7, 'B', "azul");
        String expectedString = "Electrodomestico{precioBase=120.0, color=azul, consumoEnergetico=B, peso=7.0, precioFinal=200.0}";
        assertEquals(expectedString, electrodomestico.toString());
    }
	
}
