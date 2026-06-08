package Interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestauranteTest {

    @Test
    void deveReconhecerPizza() {

        Expressao pizza =
                new PratoTerminal("Pizza");

        assertTrue(
                pizza.interpretar(
                        "Pizza, Refrigerante"
                )
        );
    }

    @Test
    void deveReconhecerLasanhaOuPizza() {

        Expressao pizza =
                new PratoTerminal("Pizza");

        Expressao lasanha =
                new PratoTerminal("Lasanha");

        Expressao consulta =
                new ExpressaoOu(
                        pizza,
                        lasanha
                );

        assertTrue(
                consulta.interpretar(
                        "Lasanha, Suco"
                )
        );
    }

    @Test
    void naoDeveReconhecerPratoInexistente() {

        Expressao pizza =
                new PratoTerminal("Pizza");

        assertFalse(
                pizza.interpretar(
                        "Hamburguer, Batata"
                )
        );
    }
}
