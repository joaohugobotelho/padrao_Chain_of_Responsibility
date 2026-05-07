package chain_of_responsibility;

public abstract class SuportHandler {
    protected SuportHandler proximo;

    public void setProximo(SuportHandler proximo) {
        this.proximo = proximo;
    }

    public abstract String tratarChamada(String tipo);
}
