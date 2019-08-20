package com.apiedu.apiedu.domain;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	private Integer id;
	private String nome;
	private String descricao;
	private Float duracao;
	
	private List<Aluno> alunos = new ArrayList<>();
	
	private Professor professor;
	
	public Curso() {
		
	}

	public Curso(Integer id, String nome, String descricao, Float duracao, Professor professor) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.duracao = duracao;
		this.professor = professor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Float getDuracao() {
		return duracao;
	}

	public void setDuracao(Float duracao) {
		this.duracao = duracao;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
