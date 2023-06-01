package lets;

import java.time.LocalDate;

public class Gerente extends CargoDeConfianca{

    public Gerente(String nome, String cpf, double salarioBase, Genero genero, Setor setor, LocalDate dataAdmissao, Bonificacao bonificacao) {
        super(nome, cpf, salarioBase, genero, setor, dataAdmissao, bonificacao);
    }

    @Override
    public String toString() {
        return "Gerente: " +
                "bonificacao: " + bonificacao +
                ", nome: '" + nome + '\'' +
                ", cpf: '" + cpf + '\'' +
                ", salario Base: " + salarioBase +
                ", genero: " + genero +
                ", setor: " + setor +
                ", Data de Admissao: " + dataAdmissao ;

    }
}
