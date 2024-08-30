package dominio;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
	private String nome;
	private String descricao;
	private LocalDate dataInicial;
	private LocalDate datafinal;
	private Set<Modulos> trilha = new LinkedHashSet<Modulos>();
	private Set<Dev> alunos = new LinkedHashSet<Dev>();

	public Set<Dev> getAlunos() {
		return alunos;
	}

	public void setAlunos(Set<Dev> alunos) {
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(LocalDate dataInicial) {
		this.dataInicial = dataInicial;
	}

	public LocalDate getDatafinal() {
		return datafinal;
	}

	public void setDatafinal(LocalDate datafinal) {
		this.datafinal = datafinal;
	}

	public Set<Modulos> getTrilha() {
		return trilha;
	}

	public void setTrilha(Set<Modulos> trilha) {
		this.trilha = trilha;
	}

}
