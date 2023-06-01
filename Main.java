package lets;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Funcionario moto = new Gerente("diego", "959577554", 1500, Genero.MASCULINO, Setor.JURIDICO, LocalDate.of(2022, Month.APRIL, 30), Bonificacao.GERENTE);

        System.out.println(moto);
    }
}
