package com.teste.testeUnidade;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TesteUnidadeApplicationTests {

	@Test
	void testandoCPFValido() {
		var valido = ValidadorCpf.validar("125.276.647-50");
		assertEquals(true, valido);
	}

	@Test
	void testandoCPFInvalido() {
		var invalido = ValidadorCpf.validar("125.276.647-53");
		assertEquals(false, invalido);
	}


}
