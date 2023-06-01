package lets;

public enum Genero {
    MASCULINO("Masculino"),
    FEMININO("Feminino");

    private final String genero;

    Genero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }
}
