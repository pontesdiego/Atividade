package lets;

import java.time.LocalDate;

public class Motoboy extends Funcionario{

    private String placaDaMoto;

    public Motoboy(String nome, String cpf, double salarioBase, Genero genero, Setor setor, LocalDate dataAdmissao, String placaDaMoto) {
        super(nome, cpf, salarioBase, genero, setor, dataAdmissao);
        this.placaDaMoto = placaDaMoto;
    }

    public String getPlacaDaMoto() {
        return placaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }

    @Override
    public double getSalarioFinal() {
        return salarioBase;
    }

    @Override
    public String toString() {
        return "Motoboy: " +
                super.toString() +
                "placaDaMoto='" + placaDaMoto + '\'' +
                '}';
    }
}
