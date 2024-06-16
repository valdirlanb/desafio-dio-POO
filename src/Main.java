import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JS");
        curso2.setDescricao("Descrição curso de JS");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devVan = new Dev();
        devVan.setNome("Van");
        devVan.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Van: " + devVan.getConteudosInscritos());
        devVan.progredir();
        devVan.progredir();
        System.out.println("-------");
        System.out.println("Conteúdos Inscritos Van: " + devVan.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Van: " + devVan.getConteudosConcluidos());
        System.out.println("XP: " + devVan.calcularXp());

    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Maria: " + devMaria.getConteudosInscritos());
        devMaria.progredir();
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("-------");
        System.out.println("Conteúdos Inscritos Maria: " + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Maria: " + devMaria.getConteudosConcluidos());
        System.out.println("XP: " + devMaria.calcularXp());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/
    }
}
