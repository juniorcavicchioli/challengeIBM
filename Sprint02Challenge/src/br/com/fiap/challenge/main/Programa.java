package br.com.fiap.challenge.main;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.fiap.challenge.model.ContaCandidato;
import br.com.fiap.challenge.model.ContaRecrutador;
import br.com.fiap.challenge.model.Curriculo;
import br.com.fiap.challenge.model.Empresa;
import br.com.fiap.challenge.model.Endereco;
import br.com.fiap.challenge.model.Experiencia;
import br.com.fiap.challenge.model.Formacao;
import br.com.fiap.challenge.model.Requisitos;
import br.com.fiap.challenge.model.Vaga;

public class Programa {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Bem-vindo(a)!");
		System.out.println("");
		System.out.println("Vamos come�ar com seu cadastro de login.");
		
		System.out.println("Digite seu email:");
		String email = in.nextLine();
		
		System.out.println("Digite sua senha:");
		String senha = in.nextLine();
		
		boolean menuInicial = true;
		while (menuInicial) {
			try {
				System.out.println("Agora escolha o seu tipo de conta atrav�s do n�mero:");
				System.out.println("[1] Candidato");
				System.out.println("[2] Recrutador");
				System.out.println("[3] Sair");
				int tipoConta = Integer.parseInt(in.nextLine());
				switch (tipoConta) {
				case 1:
					ContaCandidato novaContaC = new ContaCandidato(email, senha);
					boolean menuContaC = true;
					while(menuContaC) {
						System.out.println("--------------------------------------------");
						System.out.println("Escolha sua op��o desejada:");
						System.out.println("--------------------------------------------");
						System.out.println("[1] Editar dados da conta");
						System.out.println("[2] Registrar um endere�o");
						System.out.println("[3] Criar curr�culo");
						System.out.println("[4] Sair");
						System.out.println("--------------------------------------------");
						int opcaoMenuConta = Integer.parseInt(in.nextLine());
						
						switch (opcaoMenuConta) {
						case 1:
							System.out.println("Insira seu nome:");
							novaContaC.setNome(in.nextLine());
							System.out.println("Insira seu telefone:");
							novaContaC.setTelefone(in.nextLine());
							System.out.println("Insira uma apresenta��o para seu perfil:");
							novaContaC.setDescricao(in.nextLine());
							System.out.println("Seus dados foram atualizados!");
							System.out.println("--------------------------------------------");
							System.out.println("Nome: " + novaContaC.getNome());
							System.out.println("Telefone: " + novaContaC.getTelefone());
							System.out.println("Apresenta��o do perfil:" + novaContaC.getDescricao());
							System.out.println("--------------------------------------------");
							
							break;
						
						case 2:
							System.out.println("Insira a rua:");
							String rua = in.nextLine();
							System.out.println("Insira o n�mero:");
							int numero = Integer.parseInt(in.nextLine());
							System.out.println("Insira a cidade:");
							String cidade = in.nextLine();
							System.out.println("Insira o estado:");
							String estado = in.nextLine();
							System.out.println("Insira o CEP:");
							String cep = in.nextLine();
							System.out.println("Insira um complemento (se houver):");
							String complemento = in.nextLine();
							
							Endereco endereco = new Endereco(rua, numero, cidade, estado, cep);
							endereco.setComplemento(complemento);
							
							novaContaC.setEndereco(endereco);
							System.out.println("Endere�o cadastrado!");
							
							System.out.println("--------------------------------------------");
							System.out.println("Rua: " + novaContaC.getEndereco().getRua());
							System.out.println("N�mero: " + novaContaC.getEndereco().getNumero());
							System.out.println("Cidade - Estado:" + novaContaC.getEndereco().getCidade()+" - "+novaContaC.getEndereco().getEstado());
							System.out.println("CEP: "+novaContaC.getEndereco().getCep());
							System.out.println("Complemento: "+novaContaC.getEndereco().getComplemento());
							System.out.println("--------------------------------------------");
							break;
							
						case 3:
							ArrayList<String> idiomas = new ArrayList<String>();
							
							System.out.println("Escreva seu(s) objetivo(s):");
							String objetivos = in.nextLine();
							System.out.println("Escreva sua(s) habilidade(s):");
							String habilidades = in.nextLine();
							System.out.println("Escreva sua(s) competencia(s)");
							String competencias = in.nextLine();
							System.out.println("Escreva seu idioma seguido pelo n�vel no formato:");
							System.out.println("Idioma - n�vel");
							idiomas.add(in.nextLine());
							int i = 1;
							while (i != 2) {
								try {
									System.out.println("Deseja inserir mais um idioma?");
									System.out.println("[1] Sim [2] N�o");
									i = Integer.parseInt(in.nextLine());
									
									if (i != 2 && i != 1) {
										System.out.println("Por favor, escolha um n�mero v�lido.");
										i = 1;
									} else if (i == 1) {
										System.out.println("Digite o idioma:");
										idiomas.add(in.nextLine());
									}
								} catch(NumberFormatException e) {
									System.out.println("Por favor, ins�ra um caractere v�lido.");
								}
							}
							
							System.out.println("Vamos registrar sua forma��o agora.");
							System.out.println("Digite a institui��o:");
							String instituicao = in.nextLine();
							System.out.println("Digite o curso:");
							String curso = in.nextLine();
							System.out.println("Digite o grau:");
							String grau = in.nextLine();
							System.out.println("Digite a data de in�cio no formato (mm/aaaa):");
							String inicio = in.nextLine();
							System.out.println("Digite a data de conclus�o. Pode ser prevista.");
							String termino = in.nextLine();
							System.out.println("Digite uma descri��o para seu curso (se quiser)");
							String descricao = in.nextLine();
							System.out.println("Digite o status atual do curso (ex. cursando, completo):");
							String status = in.nextLine();
							
							ArrayList<Formacao> formacao = new ArrayList<Formacao>();
							Formacao f1 = new Formacao(instituicao, curso, grau, inicio, status);
							f1.setTermino(termino);
							f1.setDescricao(descricao);
							formacao.add(f1);
							
							System.out.println("Vamos registrar sua experi�ncia agora.");
							System.out.println("Escreva a organiza��o ou o nome do projeto:");
							String organizacao = in.nextLine();
							System.out.println("Escreva a sua fun��o/cargo:");
							String funcao = in.nextLine();
							System.out.println("Escreva a data de inicio:");
							String inicioExp = in.nextLine();
							System.out.println("Digite a data de termino (se houver):");
							String terminoExp = in.nextLine();
							System.out.println("Escreva uma descri��o para a experi�ncia (se quiser. Prioridade se for um projeto):");
							String descricaoExp = in.nextLine();
							
							Experiencia exp1 = new Experiencia(organizacao, funcao, inicioExp);
							exp1.setTermino(terminoExp);
							exp1.setDescricao(descricaoExp);
							
							ArrayList<Experiencia> experiencias = new ArrayList<Experiencia>();
							experiencias.add(exp1);
							
							System.out.println("Escreva um resumo do seu curr�culo:");
							String resumo = in.nextLine();
							
							Curriculo curriculo = new Curriculo(formacao, idiomas);
							curriculo.setObjetivos(objetivos);
							curriculo.setHabilidades(habilidades);
							curriculo.setCompetencias(competencias);
							curriculo.setExperiencia(experiencias);
							curriculo.setResumo(resumo);
							
							novaContaC.setCurriculo(curriculo);
							
							System.out.println("Seu curr�culo foi criado!");
							System.out.println("--------------------------------------------");
							System.out.println("Resumo: " + novaContaC.getCurriculo().getResumo());
							System.out.println("Objetivo: " + novaContaC.getCurriculo().getObjetivos());
							System.out.println("Habilidades: " + novaContaC.getCurriculo().getHabilidades());
							System.out.println("Competencias: " + novaContaC.getCurriculo().getCompetencias());
							System.out.println("Experi�ncia em: " + novaContaC.getCurriculo().getExperiencia().get(0).getFuncao());
							System.out.println("Forma��o em: " + novaContaC.getCurriculo().getFormacaoAcademica().get(0).getCurso()+", atualmente "+ novaContaC.getCurriculo().getFormacaoAcademica().get(0).getStatus());
							System.out.println("--------------------------------------------");
							i = 1;
							while (i != 2) {
								try {
									System.out.println("Deseja que seu curr�culo seja analizado?");
									System.out.println("[1] Sim [2] N�o");
									i = Integer.parseInt(in.nextLine());
									if (i == 1) {
										curriculo.analisarCurriculo();
										i = 2;
									} else if (i != 1 && i !=2) {
										System.out.println("Digite uma op��o v�lida.");
									}
								} catch(NumberFormatException e) {
									System.out.println("Por favor, ins�ra um caractere v�lido.");
								}
							}
							
							break;
						
						case 4:
							System.out.println("At� logo.");
							menuContaC = false;
							menuInicial = false;
							break;
							
						default:
							System.out.println("Tente novamente.");
							break;
						
						}
					}
				case 2:
					ContaRecrutador novaContaR = new ContaRecrutador(email, senha);
					boolean menuContaR = true;
					while(menuContaR) {
						System.out.println("--------------------------------------------");
						System.out.println("Escolha sua op��o desejada:");
						System.out.println("--------------------------------------------");
						System.out.println("[1] Editar dados da conta");
						System.out.println("[2] Registrar uma empresa");
						System.out.println("[3] Criar uma vaga");
						System.out.println("[4] Sair");
						System.out.println("--------------------------------------------");
						int opcaoMenuConta = Integer.parseInt(in.nextLine());
						
						switch (opcaoMenuConta) {
						case 1: 
							System.out.println("Insira seu nome:");
							novaContaR.setNome(in.nextLine());
							System.out.println("Insira seu telefone:");
							novaContaR.setTelefone(in.nextLine());
							System.out.println("Seus dados foram atualizados!");
							System.out.println("--------------------------------------------");
							System.out.println("Nome: " + novaContaR.getNome());
							System.out.println("Telefone: " + novaContaR.getTelefone());
							System.out.println("--------------------------------------------");
							break;
						case 2:
							System.out.println("Digite o nome da empresa:");
							String nomeEmpresa = in.nextLine();
							System.out.println("Digite o telefone de contato:");
							String telefoneEmpresa = in.nextLine();
							System.out.println("Digite o CNPJ ou MEI, (se houver):");
							String cnpj = in.nextLine();
							
							System.out.println("Agora, vamos ao endere�o da empresa.");
							System.out.println("");
							System.out.println("Insira a rua:");
							String rua = in.nextLine();
							System.out.println("Insira o n�mero:");
							int numero = Integer.parseInt(in.nextLine());
							System.out.println("Insira a cidade:");
							String cidade = in.nextLine();
							System.out.println("Insira o estado:");
							String estado = in.nextLine();
							System.out.println("Insira o CEP:");
							String cep = in.nextLine();
							System.out.println("Insira um complemento (se houver):");
							String complemento = in.nextLine();
							
							Endereco enderecoEmpresa = new Endereco(rua, numero, cidade, estado, cep);
							enderecoEmpresa.setComplemento(complemento);
							Empresa empresa = new Empresa(nomeEmpresa, telefoneEmpresa, enderecoEmpresa, cnpj);
							
							novaContaR.setEmpresa(empresa);
							System.out.println("Empresa cadastrada!");
							System.out.println("--------------------------------------------");
							System.out.println("Nome: " + novaContaR.getEmpresa().getNome());
							System.out.println("Cadastro legal: " + novaContaR.getEmpresa().getCnpj());
							System.out.println("Cidade - Estado: " + novaContaR.getEmpresa().getEndereco().getCidade()+" - "+novaContaR.getEmpresa().getEndereco().getEstado());
							System.out.println("Telefone: " + novaContaR.getEmpresa().getTelefone());
							System.out.println("--------------------------------------------");
							break;
							
						case 3:
							System.out.println("Digite o t�tulo da vaga:");
							String titulo = in.nextLine();
							System.out.println("Digite o tipo de contrato:");
							String tipo = in.nextLine();
							System.out.println("Digite a descri��o da vaga:");
							String descricao = in.nextLine();
							System.out.println("Digite o sal�rio da vaga somente em n�meros:");
							double salario = Double.parseDouble(in.nextLine());
							System.out.println("Digite os beneficios da vaga:");
							String beneficios = in.nextLine();
							System.out.println("Digite a quantidade de vagas dispon�veis:");
							int quantidade = Integer.parseInt(in.nextLine());
							
							System.out.println("Digite as habilidades requeridas:");
							String habilidadesReq = in.nextLine();
							System.out.println("Digite a experiencia requerida:");
							String experienciaReq = in.nextLine();
							System.out.println("Digite as competencias requeridas:");
							String competenciasReq = in.nextLine();
							System.out.println("Digite o grau de ensino requerido:");
							String grauReq = in.nextLine();
							
							Requisitos requisitos = new Requisitos();
							requisitos.setHabilidade(habilidadesReq);
							requisitos.setExperiencia(experienciaReq);
							requisitos.setCompetencias(competenciasReq);
							requisitos.setGrauEnsino(grauReq);
							
							Vaga vaga = new Vaga();
							vaga.setTitulo(titulo);
							vaga.setTipo(tipo);
							vaga.setDescricao(descricao);
							vaga.setSalario(salario);
							vaga.setBeneficios(beneficios);
							vaga.setQuantidade(quantidade);
							vaga.setRequisitos(requisitos);
							ArrayList<Vaga> vagas = new ArrayList<Vaga>();
							novaContaR.getEmpresa().setVagas(vagas);
							
							System.out.println("Sua vaga foi criada!");
							System.out.println("--------------------------------------------");
							System.out.println("T�tulo: " + novaContaR.getEmpresa().getVagas().get(0).getTitulo());
							System.out.println("Escolaridade m�nima: " + novaContaR.getEmpresa().getVagas().get(0).getRequisitos().getGrauEnsino());
							System.out.println("Descri��o: "+novaContaR.getEmpresa().getVagas().get(0).getDescricao());							
							System.out.println("Vagas dispon�veis: " + novaContaR.getEmpresa().getVagas().get(0).getQuantidade());
							System.out.println("Tipo de contrato: " + novaContaR.getEmpresa().getVagas().get(0).getTipo());
							System.out.println("--------------------------------------------");
							
							break;
						
						case 4:
							System.out.println("At� logo...");
							menuContaR = false;
							menuInicial = false;
							break;
							
						default:
							System.out.println("Tente novamente...");
							break;
						}
					}
				case 3:
					System.out.println("Fique bem!");
					menuInicial = false;
					break;
					
				default:
					System.out.println("Tente novamente.");
					break;
				}
			} catch(NumberFormatException e) {
				System.out.println("Por favor, ins�ra um caractere v�lido.");
			}
		}
	}

}
