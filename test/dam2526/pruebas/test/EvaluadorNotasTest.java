package dam2526.pruebas.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import dam2526.pruebas.EvaluadorNotas;

public class EvaluadorNotasTest {

	@Test
	void notaCero_devuelveSuspenso() {
		EvaluadorNotas evaluador = new EvaluadorNotas();
		String resultado = evaluador.clasificarNota(0);
		assertEquals("Suspenso", resultado);
	}

	@Test
	void notaCinco_devuelveAprobado() {
		EvaluadorNotas evaluador = new EvaluadorNotas();
		String resultado = evaluador.clasificarNota(5);
		assertEquals("Aprobado", resultado);
	}

	@Test
	void notaSiete_devuelveNotable() {
		EvaluadorNotas evaluador = new EvaluadorNotas();
		String resultado = evaluador.clasificarNota(7);
		assertEquals("Notable", resultado);
	}

	@Test
	void notaNueve_devuelveSobresaliente() {
		EvaluadorNotas evaluador = new EvaluadorNotas();
		String resultado = evaluador.clasificarNota(9);
		assertEquals("Sobresaliente", resultado);
	}

	@Test
	void notaNegativa_lanzaExcepcion() {
		EvaluadorNotas evaluador = new EvaluadorNotas();
		assertThrows(IllegalArgumentException.class, () -> evaluador.clasificarNota(-1));
	}

	@Test
	void notaMayorQueDiez_lanzaExcepcion() {
		EvaluadorNotas evaluador = new EvaluadorNotas();
		assertThrows(IllegalArgumentException.class, () -> evaluador.clasificarNota(11));
	}

	@Test
	void notaCuatro_devuelveSuspenso() {
		EvaluadorNotas evaluador = new EvaluadorNotas();
		assertEquals("Suspenso", evaluador.clasificarNota(4));
	}

	@Test
	void notaSeis_devuelveAprobado() {
		EvaluadorNotas evaluador = new EvaluadorNotas();
		assertEquals("Aprobado", evaluador.clasificarNota(6));
	}

	@Test
	void notaOcho_devuelveNotable() {
		EvaluadorNotas evaluador = new EvaluadorNotas();
		assertEquals("Notable", evaluador.clasificarNota(8));
	}

	@Test
	void notaDiez_devuelveSobresaliente() {
		EvaluadorNotas evaluador = new EvaluadorNotas();
		assertEquals("Sobresaliente", evaluador.clasificarNota(10));
	}
}