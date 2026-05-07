package chain_of_responsibility;


public class SuporteTecnico extends SuportHandler {

    @Override
    public String tratarChamada(String tipo) {
        if (tipo.equalsIgnoreCase("internet")) {
            return "Suporte Técnico resolveu o problema de internet.";
        }

        if (proximo != null) {
            return proximo.tratarChamada(tipo);
        }

        return "Problema não resolvido.";
    }

}
