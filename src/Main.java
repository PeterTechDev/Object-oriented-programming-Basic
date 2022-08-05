import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Basico do Javinha");
        curso1.setCargaHoraria(5);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Angular");
        curso2.setDescricao("Basico de Angular");
        curso2.setCargaHoraria(3);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de milhões");
        //mentoria.setDescricacao("Um guia para sua carreira decolar");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

    }
}
