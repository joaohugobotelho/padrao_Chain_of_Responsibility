package chain_of_responsibility;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CentralAtendimentoTest {

    @Test
    public void deveResolverProblemaSenha() {
        CentralAtendimento central = new CentralAtendimento();

        assertEquals(
                "Suporte Básico resolveu o problema de senha.", // suporte basico resolve
                central.atender("senha")
        );
    }

    @Test
    public void deveResolverProblemaInternet() {
        CentralAtendimento central = new CentralAtendimento();

        assertEquals(
                "Suporte Técnico resolveu o problema de internet.", // suporte tecnico resolve o problema
                central.atender("internet")
        );
    }

    @Test
    public void deveResolverProblemaFinanceiro() {
        CentralAtendimento central = new CentralAtendimento();

        assertEquals(
                "Gerente resolveu o problema financeiro.",  // gerente resolve o financeiro
                central.atender("financeiro")
        );
    }

    @Test
    public void deveRetornarProblemaNaoResolvido() {
        CentralAtendimento central = new CentralAtendimento();  // cai aqui se ninguem conseguir resolver o problema

        assertEquals(
                "Problema não resolvido.",
                central.atender("servidor")
        );
    }
}
