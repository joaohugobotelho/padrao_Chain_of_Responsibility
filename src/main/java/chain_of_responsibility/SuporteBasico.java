package chain_of_responsibility;

public class SuporteBasico extends SuportHandler {

    @Override
    public String tratarChamada(String tipo) {
        if(tipo.equalsIgnoreCase("senha")) {
            return  "Suporte Básico resolveu o problema de senha.";
        }
        if (proximo != null) {
            return  proximo.tratarChamada(tipo);
        }

        return "problema nao resolvido";
    }
}
