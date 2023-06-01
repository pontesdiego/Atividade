package lets;

import java.time.LocalDate;
import java.util.Locale;

public abstract class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salarioBase;
    protected Genero genero;
    protected Setor setor;
    protected LocalDate dataAdmissao;

    public abstract double getSalarioFinal();

    public Funcionario(String nome, String cpf, double salarioBase, Genero genero, Setor setor, LocalDate dataAdmissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
        this.genero = genero;
        this.setor = setor;
        this.dataAdmissao = dataAdmissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome: '" + nome + '\'' +
                "\n, cpf: '" + cpf + '\'' +
                "\n, salarioBase: " + salarioBase +
                "\n, genero: " + genero +
                "\n, setor: " + setor +
                "\n, Data de Admissao: " + dataAdmissao;
    }
}
