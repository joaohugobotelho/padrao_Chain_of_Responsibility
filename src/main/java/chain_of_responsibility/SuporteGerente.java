package chain_of_responsibility;

public class SuporteGerente extends SuportHandler {

    @Override
    public String tratarChamada(String tipo) {
        if (tipo.equalsIgnoreCase("financeiro")) {
            return "Gerente resolveu o problema financeiro.";
        }

        return "Problema não resolvido.";
    }
}
