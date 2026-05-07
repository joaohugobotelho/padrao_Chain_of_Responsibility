package chain_of_responsibility;

public class CentralAtendimento {
    private SuportHandler handler;

    public CentralAtendimento() {

        SuporteBasico basico = new SuporteBasico();
        SuporteTecnico tecnico = new SuporteTecnico();
        SuporteGerente gerente = new SuporteGerente();

        basico.setProximo(tecnico);
        tecnico.setProximo(gerente);

        handler = basico;
    }

    public String atender(String tipo) {
        return handler.tratarChamada(tipo);
    }
}
