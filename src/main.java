import br.com.DIO.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("PHP");
        curso2.setDescricao("descricao curso PHP");
        curso2.setCargaHoraria(10);

        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setDescricao("Mentoria de java");
        mentoria1.setTitulo("descricao mentoria java");
        mentoria1.setData(LocalDate.now());
        System.out.println(mentoria1);

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp java dev");
        bootcamp1.setDescricao("Descricao bootcamp java dev");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Dev devCamila = new Dev();
        devCamila.setNome("camila");
        devCamila.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos inscritos"+ devCamila.getConteudosInscritos());

        Dev devJoao = new Dev();
        devJoao.setNome("joao");
        devJoao.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos inscritos"+ devJoao.getConteudosInscritos());

        Dev devYago = new Dev();
        devYago.setNome("Yago");
        devYago.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos inscritos"+ devYago.getConteudosInscritos());
        devYago.progredir();
        System.out.println("Conteudos concluidos"+ devYago.getConteudosConcluidos());
        System.out.println(devYago.calcularXP());


        Dev devAndre = new Dev();
        devAndre.setNome("andre");
        devAndre.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos inscritos"+ devAndre.getConteudosInscritos());

        








    }
}
