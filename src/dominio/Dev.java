package dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {

	private String nome;
	private Set<Modulos> modulosIncritos = new LinkedHashSet<Modulos>();
	private Set<Modulos> modulosConcluidos = new LinkedHashSet<Modulos>();
	
	public void progredir() {
		Optional<Modulos> cursoParaConcluir = modulosIncritos.stream().findFirst();
		if(!cursoParaConcluir.isEmpty()) {
			modulosIncritos.remove(cursoParaConcluir.get());
			modulosConcluidos.add(cursoParaConcluir.get());
		}
	}

	public void inscrever(Bootcamp bootcamp) {
		bootcamp.getAlunos().add(this);
		modulosIncritos.addAll(bootcamp.getTrilha());
	}
	
	public void exibirCursos() {
		System.out.println("Cursos incritos: ");
		modulosIncritos.forEach(curso -> System.out.println(curso.getTitulo()));
		System.out.println("============================================");
		System.out.println("Cursos concluídos: ");
		modulosConcluidos.forEach(curso -> System.out.println(curso.getTitulo()));
		System.out.println("============================================");
	}
	
	public double calcularTotalXp() {
		return modulosConcluidos.stream().mapToDouble(curso -> curso.calcularXp()).sum();
	}

	public Set<Modulos> getModulosIncritos() {
		return modulosIncritos;
	}

	public void setModulosIncritos(Set<Modulos> modulosIncritos) {
		this.modulosIncritos = modulosIncritos;
	}

	public Set<Modulos> getModulosConcluidos() {
		return modulosConcluidos;
	}

	public void setModulosConcluidos(Set<Modulos> modulosConcluidos) {
		this.modulosConcluidos = modulosConcluidos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
