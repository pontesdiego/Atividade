package lets;

import java.time.LocalDate;

public class Diretor extends CargoDeConfianca{
    private double premio;

    public Diretor(String nome, String cpf, double salarioBase, Genero genero, Setor setor, LocalDate dataAdmissao, Bonificacao bonificacao, double premio) {
        super(nome, cpf, salarioBase, genero, setor, dataAdmissao, bonificacao);
        this.premio = premio;
    }

    public double getPremio() {
        return premio;
    }

    public void setPremio(double premio) {
        this.premio = premio;
    }

    @Override
    public String toString() {
        return "Diretor: " +
                "premio: " + premio +
                "\n bonificacao: " + bonificacao +
                "\n nome: '" + nome + '\'' +
                "\n cpf: '" + cpf + '\'' +
                "\n salarioBase: " + salarioBase +
                "\n genero: " + genero +
                "\n setor: " + setor +
                "\n dataAdmissao: " + dataAdmissao +
                '}';
    }
}
