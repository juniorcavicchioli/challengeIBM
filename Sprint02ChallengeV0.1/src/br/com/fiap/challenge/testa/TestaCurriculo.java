package br.com.fiap.challenge.testa;

import java.util.ArrayList;

import br.com.fiap.challenge.model.Curriculo;
import br.com.fiap.challenge.model.Experiencia;
import br.com.fiap.challenge.model.Formacao;

public class TestaCurriculo {

	public static void main(String[] args) {
		
		Formacao formacao1 = new Formacao("FIAP", "Analise e Dev de Sistemas", "T�cnico Superior", "02/2022", "cursando");
		Formacao formacao2 = new Formacao("UNIP", "Jornalismo", "Bacharel", "02/2018", "completo");
		
		formacao2.setTermino("12/2020");
		ArrayList<Formacao> formacao = new ArrayList<Formacao>();
		formacao.add(formacao1);
		formacao.add(formacao2);
		
		System.out.println("Forma��o 1:");
		System.out.println("Curso: "+formacao.get(0).getCurso());
		System.out.println("Status: "+formacao.get(0).getStatus());
		System.out.println("Forma��o 2:");
		System.out.println("Curso: "+formacao.get(1).getCurso());
		System.out.println("Status: "+formacao.get(1).getStatus());
		
		
		Experiencia experiencia1 = new Experiencia("Jornal de Jundia�", "Colunista", "04/2020");
		experiencia1.setTermino("09/2021");
		Experiencia experiencia2 = new Experiencia("Prefeitura de Jundia�", "Lixeiro", "09/2021");
		
		ArrayList<Experiencia> experiencia = new ArrayList<Experiencia>();
		experiencia.add(experiencia1);
		experiencia.add(experiencia2);
		
		System.out.println("Experiencia 1:");
		System.out.println("Fun��o: "+experiencia.get(0).getFuncao());
		System.out.println("In�cio: "+experiencia.get(0).getInicio()+" Termino:"+experiencia.get(0).getTermino());		
		System.out.println("Experiencia 2:");
		System.out.println("Fun��o: "+experiencia.get(1).getFuncao());
		System.out.println("In�cio: "+experiencia.get(1).getInicio()+" Termino:"+experiencia.get(1).getTermino());
		
		ArrayList<String> idioma = new ArrayList<String>();
		idioma.add("Portugu�s - Nativo");
		idioma.add("Espanhol - intermedi�rio");
		
		Curriculo curriculo = new Curriculo(formacao, idioma);
		
		curriculo.setObjetivos("Crescer na �rea de tecnologia");
		curriculo.setExperiencia(experiencia);
		
		System.out.println("Objetivo: "+curriculo.getObjetivos());
		System.out.println("Idiomas: "+curriculo.getIdioma().get(0));
		System.out.println(curriculo.getIdioma().get(1));
	}

}
