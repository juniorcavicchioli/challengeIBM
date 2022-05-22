package br.com.fiap.challenge.model;

import java.util.ArrayList;

public class Curriculo {
	private int id = Integer.parseInt("4" + Integer.toString(getNextId()));
	private String objetivos;
	private String habilidades;
	private String competencias;
	private String resumo;
	private ArrayList<Experiencia> experiencia;
	private ArrayList<Formacao> formacaoAcademica;
	private ArrayList<String> idioma;
	private int pontos;

	public Curriculo(ArrayList<Formacao> formacaoAcademica, ArrayList<String> idioma) {
		this.setIdioma(idioma);
		this.setFormacaoAcademica(formacaoAcademica);
	}
	private static int nextId = 1; // atributo estatico para gerar o id
	private static int getNextId() {
		return nextId++;
	}
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	public void analisarCurriculo() {
		int pontos = 0;
		this.setPontos(0);
		if (this.getObjetivos() != null) {
			pontos++;
		} else {
			System.out.println("Preencher seus objetivos ajuda o recrutador a saber se a empresa te ajudar� a atingi-los!");
		}
		if (this.getHabilidades() != null) {
			pontos++;
		} else {
			System.out.println("Preencher suas habilidades faz com que o recrutador saiba no que voc� � capaz de fazer e se desenvolver!");
		}
		if (this.getCompetencias() != null) {
			pontos++;
		} else {
			System.out.println("Peencher suas compet�ncias ajuda o recrutador a saber se voc� tem o que � preciso para exercer o trabalho!");
		}
		if (this.getResumo() != null) {
			pontos++;
		} else {
			System.out.println("Um resumo bem escrito causa uma boa primeira impress�o al�m de agilizar o trabalho do recrutador.");
		}
		if (this.getExperiencia() != null) {
			pontos++;
		} else {
			System.out.println("Relatar no que voc� � experiente � importante! Mesmo que seja apenas dizer que n�o possui.");
		}
		if (this.getFormacaoAcademica() != null) {
			pontos++;
		} else {
			System.out.println("Sua forma��o acad�mica, mesmo que seja do per�odo escolar � �til!");
		}
		if (this.getIdioma() != null) {
			pontos++;
		} else {
			System.out.println("Todos falamos algum idioma, certo? Adicione pelo menos o seu idioma nativo.");
		}
		this.setPontos(pontos);
		if (this.getPontos() < 7) {
			System.out.println("Sua pontua��o � de "+this.getPontos()+"/7. Ter um curr�culo completo ajuda a chamar mais a aten��o de recutadores!");
		} else {
			System.out.println("Seu curr�culo est� completo! N�o esque�a de mant�-lo com informa��es corretas e atualizadas");
		}
	}
	public int getId() {
		return id;
	}

	public String getObjetivos() {
		return objetivos;
	}

	public void setObjetivos(String objetivos) {
		this.objetivos = objetivos;
	}

	public String getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(String habilidades) {
		this.habilidades = habilidades;
	}

	public String getCompetencias() {
		return competencias;
	}

	public void setCompetencias(String competencias) {
		this.competencias = competencias;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public ArrayList<Experiencia> getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(ArrayList<Experiencia> experiencia) {
		this.experiencia = experiencia;
	}

	public ArrayList<Formacao> getFormacaoAcademica() {
		return formacaoAcademica;
	}

	public void setFormacaoAcademica(ArrayList<Formacao> formacaoAcademica) {
		this.formacaoAcademica = formacaoAcademica;
	}

	public ArrayList<String> getIdioma() {
		return idioma;
	}

	public void setIdioma(ArrayList<String> idioma) {
		this.idioma = idioma;
	}

}
