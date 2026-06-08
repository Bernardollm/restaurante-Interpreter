package Interpreter;

public class PratoTerminal implements Expressao {

    private String prato;

    public PratoTerminal(String prato) {
        this.prato = prato;
    }

    @Override
    public boolean interpretar(String contexto) {

        return contexto.contains(prato);
    }
}
