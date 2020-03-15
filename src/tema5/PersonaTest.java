package tema5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PersonaTest {

	@Test
	@ParameterizedTest
	@DisplayName ("comprueba masa")
	@CsvSource({"45.6,45.6", "65.2,65.2"})
	void testCalculaMasa(double introducido, double esperado) {
//		Persona pe= new Persona();
//		pe.setMasa(introducido);
		assertEquals(introducido,esperado);
		assert
	}

	@Test
	void testMayorEdad() {
		Persona pe= new Persona();
		pe.setEdad(19);
		assertTrue(pe.mayorEdad());
	}

}
