package fatec.calc.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fatec.calc.servico.Calculadora;

public class UC01SomadeParcelas {
	
	static Calculadora calculadora;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calculadora = new Calculadora();
	}

	@Test
	public void UC01SomadeParcelas_com_sucesso() {
		assertEquals("resultado = ",5,calculadora.soma("3,2"));
	}
	
	@Test (expected = RuntimeException.class)
	public void UC01SomadeParcelas_dados_invalidos() {
		assertEquals("resultado = ",5,calculadora.soma("x,2"));
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
}
