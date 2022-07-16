package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Principal {

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
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devMaria = new Dev();
		devMaria.setNome("Maria");
		devMaria.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos "  + devMaria.getNome()  + ": " + devMaria.getConteudosInscritos());
		devMaria.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos " 	+ devMaria.getNome() + ": " + devMaria.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos "  + devMaria.getNome() + ": " + devMaria.getConteudosConcluidos());
		
		System.out.println("---------");
		
		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos "   + devJoao.getNome() + ": " + devJoao.getConteudosInscritos());
		devMaria.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos " 	+ devJoao.getNome() + ": " + devJoao.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos "  + devJoao.getNome() + ": " + devJoao.getConteudosConcluidos());
	}

}
