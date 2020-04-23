package numeroscomplejos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class Prueba {

	
	@Test
	void testASegundos() {
		System.out.println("segundos");
		hora h = new hora(13,41,32);
		int obtenido = h.aSegundos();
		int esperado =49292;
		assertEquals(obtenido,esperado);
	}

	@Test
	void testSegundosDesde() {
		System.out.println("segundodesde");
		hora h = new hora(13,41,32);
		hora h2 =new hora(5,54,21);
		
		int obtenido = h.segundosDesde(h2);
		int esperado = 28031;
		assertEquals(obtenido,esperado);
	}
	

	@Test
	void testIgualQue() {
		hora h = new hora(13,41,32);
		hora h2 =new hora(5,54,21);
		
		assertFalse(h.igualQue(h2));
		
	}

	@Test
	void testMenorQue() {
		hora h = new hora(13,41,32);
		hora h2 =new hora(5,54,21);
		assertFalse(h.menorQue(h2));
	}

	@Test
	void testMayorQue() {
		hora h = new hora(13,41,32);
		hora h2 =new hora(5,54,21);
		assertTrue(h.mayorQue(h2));
	}

}
