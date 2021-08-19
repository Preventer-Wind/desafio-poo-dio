import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDiogo = new Dev();
        devDiogo.setNome("Diogo");
        devDiogo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devDiogo.getConteudosInscritos());
        devDiogo.progredir();
        devDiogo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + devDiogo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devDiogo.getConteudosConcluidos());
        System.out.println("XP:" +devDiogo.calcularTotalXP());

        System.out.println("-------");

        Dev devThiago = new Dev();
        devThiago.setNome("Thiago");
        devThiago.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devThiago.getConteudosInscritos());
        devThiago.progredir();
        devThiago.progredir();
        devThiago.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + devThiago.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devThiago.getConteudosConcluidos());
        System.out.println("XP:" +devThiago.calcularTotalXP());

    }

}
