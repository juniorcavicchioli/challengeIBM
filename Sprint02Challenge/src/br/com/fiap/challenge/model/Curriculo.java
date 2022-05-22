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
			System.out.println("Preencher seus objetivos ajuda o recrutador a saber se a empresa te ajudará a atingi-los!");
		}
		if (this.getHabilidades() != null) {
			pontos++;
		} else {
			System.out.println("Preencher suas habilidades faz com que o recrutador saiba no que você é capaz de fazer e se desenvolver!");
		}
		if (this.getCompetencias() != null) {
			pontos++;
		} else {
			System.out.println("Peencher suas competências ajuda o recrutador a saber se você tem o que é preciso para exercer o trabalho!");
		}
		if (this.getResumo() != null) {
			pontos++;
		} else {
			System.out.println("Um resumo bem escrito causa uma boa primeira impressão além de agilizar o trabalho do recrutador.");
		}
		if (this.getExperiencia() != null) {
			pontos++;
		} else {
			System.out.println("Relatar no que você é experiente é importante! Mesmo que seja apenas dizer que não possui.");
		}
		if (this.getFormacaoAcademica() != null) {
			pontos++;
		} else {
			System.out.println("Sua formação acadêmica, mesmo que seja do período escolar é útil!");
		}
		if (this.getIdioma() != null) {
			pontos++;
		} else {
			System.out.println("Todos falamos algum idioma, certo? Adicione pelo menos o seu idioma nativo.");
		}
		this.setPontos(pontos);
		if (this.getPontos() < 7) {
			System.out.println("Sua pontuação é de "+this.getPontos()+"/7. Ter um currículo completo ajuda a chamar mais a atenção de recutadores!");
		} else {
			System.out.println("Seu currículo está completo! Não esqueça de mantê-lo com informações corretas e atualizadas");
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
