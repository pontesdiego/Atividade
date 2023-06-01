package lets;

import java.time.LocalDate;

public abstract class CargoDeConfianca extends Funcionario{
    protected Bonificacao bonificacao;

    public CargoDeConfianca(String nome, String cpf, double salarioBase, Genero genero, Setor setor, LocalDate dataAdmissao, Bonificacao bonificacao) {
        super(nome, cpf, salarioBase, genero, setor, dataAdmissao);
        this.bonificacao = bonificacao;
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

    @Override
    public double getSalarioFinal() {
        return 0;
    }

    @Override
    public String toString() {
        return "CargoDeConfianca: " +
                super.toString() +
                "bonificacao: " + bonificacao;
    }
}
