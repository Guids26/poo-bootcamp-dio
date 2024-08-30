package dominio;

import java.time.LocalDate;

public class EscolaTech {

	public static void main(String[] args) {
		// Criando cursos
		Cursos cursoJava = new Cursos();
		cursoJava.setTitulo("Curso de Java");
		cursoJava.setDescricao("Aprenda os conceitos básicos de Java");
		cursoJava.setCargaHoraria(8);

		Cursos cursoSpring = new Cursos();
		cursoSpring.setTitulo("Curso de Spring Boot");
		cursoSpring.setDescricao("Aprenda como criar aplicações com Spring Boot");
		cursoSpring.setCargaHoraria(10);

		// Criando mentorias
		Mentorias mentoriaJava = new Mentorias();
		mentoriaJava.setTitulo("Mentoria sobre Java");
		mentoriaJava.setDescricao("Tire suas dúvidas sobre Java com um mentor experiente");
		mentoriaJava.setData(LocalDate.now());

		// Criando um bootcamp
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Um bootcamp intensivo para aprender Java e Spring Boot");
		bootcamp.getTrilha().add(cursoJava);
		bootcamp.getTrilha().add(cursoSpring);
		bootcamp.getTrilha().add(mentoriaJava);

		// Criando um desenvolvedor
		Dev devGuilherme = new Dev();
		devGuilherme.setNome("Guilherme");
		devGuilherme.inscrever(bootcamp);

		// Exibindo os módulos inscritos
		System.out.println("Antes de progredir:");
		devGuilherme.exibirCursos();

		// Progredindo em alguns cursos
		devGuilherme.progredir();
		devGuilherme.progredir();

		// Exibindo os módulos novamente
		System.out.println("Depois de progredir:");
		devGuilherme.exibirCursos();

		// Calculando o total de XP
		System.out.println("XP total: " + devGuilherme.calcularTotalXp());
	}

}
