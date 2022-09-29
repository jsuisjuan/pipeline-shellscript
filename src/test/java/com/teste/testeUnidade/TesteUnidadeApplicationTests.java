package com.teste.testeUnidade;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TesteUnidadeApplicationTests {

	@Test
	void testandoCPFValido() {
		var valido = ValidadorCpf.validar("954.260.760-14");
		assertEquals(true, valido);
	}

	@Test
	void testandoCPFInvalido() {
		var valido = ValidadorCpf.validar("123.123.123-09");
		assertEquals(false, valido);
	}
}
