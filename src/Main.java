import br.com.desafio.dominio.Bootcamp;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
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
        // mentoria.setDescricacao("Um guia para sua carreira decolar");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Tomorrow Talents");

        bootcamp.setDescricao("Curso com duração de três meses para formação de nossos talentos");

        Dev devPeter = new Dev();
        devPeter.setNome("Peter");
        devPeter.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Peter" + devPeter.getConteudosInscritos());
        devPeter.progredir();
        System.out.println("Conteudos inscritos Peter" + devPeter.getConteudosConcluidos());

        Dev devLebron = new Dev();
        devLebron.setNome("Lebron");
        System.out.println("Conteudos inscritos Lebron" + devLebron.getConteudosInscritos());
    }
}
