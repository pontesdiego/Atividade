package lets;

public enum Bonificacao {
    GERENTE(0.2),
    DIRETOR(0.4);

    protected final double calc;

    Bonificacao(double calc) {
        this.calc = calc;
    }

    public double getCalc() {
        return calc;
    }
}
