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
import br.com.fiap.challenge.model.Site;
import br.com.fiap.challenge.model.Vaga;

public class Programa {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Site fiap = new Site("FIAP");
		ArrayList<ContaCandidato> contasC = new ArrayList<ContaCandidato>();
		ArrayList<ContaRecrutador> contasR = new ArrayList<ContaRecrutador>();
		fiap.setContasD(contasC);
		fiap.setContasR(contasR);
		ArrayList<Vaga> vagaS = new ArrayList<Vaga>();

		System.out.println("Bem vindo ao Tinder empresarial da FIAP!!!!");
		System.out.println("");
		System.out.println("Vamos começar");
		System.out.println("");
		boolean menuPrincipal = true;
		while (menuPrincipal) {
			ContaCandidato conta1 = new ContaCandidato("admin", "123");
			try {
			contasC.add(conta1);
			System.out.println("--------------------------------------------");
			System.out.println("Digite o número do recurso desejado:");
			System.out.println("--------------------------------------------");
			System.out.println("1 - Fazer login");
			System.out.println("2 - Cadastrar nova conta");
			System.out.println("3 - Sair");
			System.out.println("--------------------------------------------");
			int opcaoMenuPrincipal = Integer.parseInt(in.nextLine());

			switch (opcaoMenuPrincipal) {

			case 1:
				boolean menu2 = true;
				while (menu2) {
					try {
					System.out.println("--------------------------------------------");
					System.out.println("Digite o número do recurso desejado:");
					System.out.println("--------------------------------------------");
					System.out.println("1- Conta de Candidato");
					System.out.println("2- Conta Empresarial");
					System.out.println("3- Sair");
					System.out.println("--------------------------------------------");
					int opcaoMenu2 = Integer.parseInt(in.nextLine());

					switch (opcaoMenu2) {
					case 1:
						System.out.println("Digite o email");
						String email = in.nextLine();

						for (ContaCandidato contaC : fiap.getContasD()) {
							if (contaC.getEmail().equals(email)) {
								System.out.println("Digite a senha");
								String senha = in.nextLine();
								if (contaC.getSenha().equals(senha)) {

									boolean menu3 = true;
									while (menu3) {
										try {
										System.out.println("--------------------------------------------");
										System.out.println("Digite o número do recurso desejado:");
										System.out.println("--------------------------------------------");
										System.out.println("1- Ver detalhes da conta");
										System.out.println("2- Alterar detalhes da conta");
										System.out.println("3- Ver quantidade de vagas");
										System.out.println("4- Criar currículo");
										System.out.println("5- Sair");
										System.out.println("--------------------------------------------");
										int opcaoMenu3 = Integer.parseInt(in.nextLine());
										switch (opcaoMenu3) {
										case 1:

											System.out.println("Id: " + contaC.getId());
											System.out.println("Email: " + contaC.getEmail());
											System.out.println("Senha: " + contaC.getSenha());
											System.out.println("Nome: " + contaC.getNome());
											System.out.println("Telefone: " + contaC.getTelefone());
											try {
											System.out.println("Rua: " + contaC.getEndereco().getRua()
													+ "\nNumero da Rua: " + contaC.getEndereco().getNumero()
													+ "\nCidade: " + contaC.getEndereco().getCidade() + "\nComplemento"
													+ contaC.getEndereco().getComplemento() + "\nCep: "
													+ contaC.getEndereco().getCep());
											} catch (NullPointerException e) {
												System.out.println("Endereço não cadastrado");
											}
											System.out.println("Descrição do perfil:\n" + contaC.getDescricao());
											break;
										case 2:
											boolean menu4 = true;
											while (menu4) {
												try {
												System.out.println("--------------------------------------------");
												System.out.println("Digite o número do recurso desejado:");
												System.out.println("--------------------------------------------");
												System.out.println("1- Alterar email");
												System.out.println("2- Alterar senha");
												System.out.println("3- Alterar endereço");
												System.out.println("4- Alterar telefone");
												System.out.println("5- Alterar descriçao do perfil");
												System.out.println("6- Alterar nome");
												System.out.println("7- Sair");
												int opcaoMenu4 = Integer.parseInt(in.nextLine());
												switch (opcaoMenu4) {
												case 1:
													System.out.println("Digite seu novo email.");
													String novoEmail = in.nextLine();
													contaC.setEmail(novoEmail);
													break;
												case 2:
													System.out.println("Digite sua nova senha.");
													String novaSenha = in.nextLine();
													contaC.setSenha(novaSenha);
													break;
												case 3:
													boolean menu5 = true;
													while (menu5) {
														try {
														System.out.println("--------------------------------------------");
														System.out.println("Digite o número do recurso desejado:");
														System.out.println("--------------------------------------------");
														System.out.println("1- Alterar Rua");
														System.out.println("2- Alterar Numero da rua");
														System.out.println("3- Alterar Complemento");
														System.out.println("4- Alterar Cidade");
														System.out.println("5- Alterar Cep");
														System.out.println("6- Alterar Estado");
														System.out.println("7- Voltar");
														int opcaoMenu5 = Integer.parseInt(in.nextLine());
														switch (opcaoMenu5) {
														case 1:
															System.out.println("Digite sua nova Rua");
															String novaRua = in.nextLine();
															contaC.getEndereco().setRua(novaRua);
															break;
														case 2:
															System.out.println("Digite seu novo Numero");
															int novoNumero = Integer.parseInt(in.nextLine());
															contaC.getEndereco().setNumero(novoNumero);
															break;
														case 3:
															System.out.println("Digite seu novo complemento");
															String novoComplemento = in.nextLine();
															contaC.getEndereco().setComplemento(novoComplemento);
															break;
														case 4:
															System.out.println("Digite sua nova Cidade");
															String novaCidade = in.nextLine();
															contaC.getEndereco().setCidade(novaCidade);
															break;
														case 5:
															System.out.println("Digite seu novo Cep");
															String novoCep = in.nextLine();
															contaC.getEndereco().setCep(novoCep);
															break;
														case 6:
															System.out.println("Digite seu novo Estado");
															String novoEstado = in.nextLine();
															contaC.getEndereco().setEstado(novoEstado);
															break;
														case 7:
															menu5 = false;
															break;
														}
														} catch(NumberFormatException e) {
															System.out.println("Por favor, insíra um caractere válido.");
														}
													}
													break;
												case 4:
													System.out.println("Digite seu novo telefone.");
													String novoTelefone = in.nextLine();
													contaC.setTelefone(novoTelefone);
													break;
												case 5:
													System.out.println("Digite sua nova descrição de perfil.");
													String novaDescricao = in.nextLine();
													contaC.setDescricao(novaDescricao);
													break;
												case 6:
													System.out.println("Digite seu novo nome");
													String novoNome = in.nextLine();
													contaC.setNome(novoNome);
													;
													break;
												case 7:
													menu4 = false;
													break;

												}
												} catch(NumberFormatException e) {
													System.out.println("Por favor, insíra um caractere válido.");
													System.out.println("Voltando ao menu anterior");
												}
											}
											break;

										case 3:
											if (fiap.getContasR().size() > 0) {
												for (ContaRecrutador vagas : fiap.getContasR()) {

													if (vagas.getVagas().size() > 0) {
														System.out.println("Quantidade de vagas disponíveis: " + vagas.getVagas().size());
													} else {
														System.out.println("Não existem vagas disponiveis");
													}
												}
											}

											break;
										case 4:
											ArrayList<String> idiomas = new ArrayList<String>();

											System.out.println("Escreva seu(s) objetivo(s):");
											String objetivos = in.nextLine();
											System.out.println("Escreva sua(s) habilidade(s):");
											String habilidades = in.nextLine();
											System.out.println("Escreva sua(s) competencia(s)");
											String competencias = in.nextLine();
											System.out.println("Escreva seu idioma seguido pelo nível no formato:");
											System.out.println("Idioma - nível");
											idiomas.add(in.nextLine());
											int i = 1;
											while (i != 2) {
												try {
													System.out.println("Deseja inserir mais um idioma?");
													System.out.println("[1] Sim [2] Não");
													i = Integer.parseInt(in.nextLine());

													if (i != 2 && i != 1) {
														System.out.println("Por favor, escolha um número válido.");
														i = 1;
													} else if (i == 1) {
														System.out.println("Digite o idioma:");
														idiomas.add(in.nextLine());
													}
												} catch (NumberFormatException e) {
													System.out.println("Por favor, insíra um caractere válido.");
													System.out.println("Voltando ao menu anterior");
												}
											}

											System.out.println("Vamos registrar sua formação agora.");
											System.out.println("Digite a instituição:");
											String instituicao = in.nextLine();
											System.out.println("Digite o curso:");
											String curso = in.nextLine();
											System.out.println("Digite o grau:");
											String grau = in.nextLine();
											System.out.println("Digite a data de início no formato (mm/aaaa):");
											String inicio = in.nextLine();
											System.out.println("Digite a data de conclusão. Pode ser prevista.");
											String termino = in.nextLine();
											System.out.println("Digite uma descrição para seu curso (se quiser)");
											String descricao = in.nextLine();
											System.out.println(
													"Digite o status atual do curso (ex. cursando, completo):");
											String status = in.nextLine();

											ArrayList<Formacao> formacao = new ArrayList<Formacao>();
											Formacao f1 = new Formacao(instituicao, curso, grau, inicio, status);
											f1.setTermino(termino);
											f1.setDescricao(descricao);
											formacao.add(f1);

											System.out.println("Vamos registrar sua experiência agora.");
											System.out.println("Escreva a organização ou o nome do projeto:");
											String organizacao = in.nextLine();
											System.out.println("Escreva a sua função/cargo:");
											String funcao = in.nextLine();
											System.out.println("Escreva a data de inicio:");
											String inicioExp = in.nextLine();
											System.out.println("Digite a data de termino (se houver):");
											String terminoExp = in.nextLine();
											System.out.println(
													"Escreva uma descrição para a experiência (se quiser. Prioridade se for um projeto):");
											String descricaoExp = in.nextLine();

											Experiencia exp1 = new Experiencia(organizacao, funcao, inicioExp);
											exp1.setTermino(terminoExp);
											exp1.setDescricao(descricaoExp);

											ArrayList<Experiencia> experiencias = new ArrayList<Experiencia>();
											experiencias.add(exp1);

											System.out.println("Escreva um resumo do seu currículo:");
											String resumo = in.nextLine();

											Curriculo curriculo = new Curriculo(formacao, idiomas);
											curriculo.setObjetivos(objetivos);
											curriculo.setHabilidades(habilidades);
											curriculo.setCompetencias(competencias);
											curriculo.setExperiencia(experiencias);
											curriculo.setResumo(resumo);

											contaC.setCurriculo(curriculo);

											System.out.println("Seu currículo foi criado!");
											System.out.println("--------------------------------------------");
											System.out.println("Resumo: " + contaC.getCurriculo().getResumo());
											System.out.println("Objetivo: " + contaC.getCurriculo().getObjetivos());
											System.out
													.println("Habilidades: " + contaC.getCurriculo().getHabilidades());
											System.out.println(
													"Competencias: " + contaC.getCurriculo().getCompetencias());
											System.out.println("Experiência em: "
													+ contaC.getCurriculo().getExperiencia().get(0).getFuncao());
											System.out.println("Formação em: "
													+ contaC.getCurriculo().getFormacaoAcademica().get(0).getCurso()
													+ ", atualmente "
													+ contaC.getCurriculo().getFormacaoAcademica().get(0).getStatus());
											System.out.println("--------------------------------------------");
											i = 1;
											while (i != 2) {
												try {
													System.out.println("Deseja que seu currículo seja analizado?");
													System.out.println("[1] Sim [2] Não");
													i = Integer.parseInt(in.nextLine());
													if (i == 1) {
														curriculo.analisarCurriculo();
														i = 2;
													} else if (i != 1 && i != 2) {
														System.out.println("Digite uma opção válida.");
													}
												} catch (NumberFormatException e) {
													System.out.println("Por favor, insíra um caractere válido.");
													System.out.println("Voltando ao menu anterior");
												}
											}
											break;
										case 5:
											System.out.println("Voltar");
											menu3 = false;
											menu2 = false;
											break;
										}
										} catch(NumberFormatException e) {
											System.out.println("Por favor, insíra um caractere válido.");
											System.out.println("Faça login novamente.");
											break;
										}
									}
								}
							}
						}
						System.out.println("email ou senha invalido(s)");
						break;

					case 2:
						System.out.println("Digite o email");
						String email2 = in.nextLine();
						
						for (ContaRecrutador contaR : fiap.getContasR()) {
							if (contaR.getEmail().equals(email2)) {
								System.out.println("Digite a senha");
								String senha2 = in.nextLine();
								if (contaR.getSenha().equals(senha2)) {
									boolean menuContaR = true;
									while (menuContaR) {
										try {
										System.out.println("--------------------------------------------");
										System.out.println("Escolha sua opção desejada:");
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
											contaR.setNome(in.nextLine());
											System.out.println("Insira seu telefone:");
											contaR.setTelefone(in.nextLine());
											System.out.println("Seus dados foram atualizados!");
											System.out.println("--------------------------------------------");
											System.out.println("Nome: " + contaR.getNome());
											System.out.println("Telefone: " + contaR.getTelefone());
											break;
										case 2:
											System.out.println("Digite o nome da empresa:");
											String nomeEmpresa = in.nextLine();
											System.out.println("Digite o telefone de contato:");
											String telefoneEmpresa = in.nextLine();
											System.out.println("Digite o CNPJ ou MEI, (se houver):");
											String cnpj = in.nextLine();

											System.out.println("Agora, vamos ao endereço da empresa.");
											System.out.println("");
											System.out.println("Insira a rua:");
											String rua = in.nextLine();
											int numero = -1;
											while (numero == -1) {
												try {
											System.out.println("Insira o número:");
											numero = Integer.parseInt(in.nextLine());
												} catch(NumberFormatException e) {
													System.out.println("Por favor, insíra um caractere válido.");
												}
											}
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
											Empresa empresa = new Empresa(nomeEmpresa, telefoneEmpresa, enderecoEmpresa,
													cnpj);

											contaR.setEmpresa(empresa);
											System.out.println("Empresa cadastrada!");
											System.out.println("--------------------------------------------");
											System.out.println("Nome: " + contaR.getEmpresa().getNome());
											System.out.println("Cadastro legal: " + contaR.getEmpresa().getCnpj());
											System.out.println(
													"Cidade - Estado: " + contaR.getEmpresa().getEndereco().getCidade()
															+ " - " + contaR.getEmpresa().getEndereco().getEstado());
											System.out.println("Telefone: " + contaR.getEmpresa().getTelefone());
											break;

										case 3:
											for(ContaRecrutador conta : fiap.getContasR()) {
												if (conta.getEmail().equals(email2)) {
													System.out.println("Digite o título da vaga:");
													String titulo = in.nextLine();
													System.out.println("Digite o tipo de contrato:");
													String tipo = in.nextLine();
													System.out.println("Digite a descrição da vaga:");
													String descricao = in.nextLine();
													
													double salario = -1;
													while (salario == -1) {
													try {
													System.out.println("Digite o salário da vaga somente em números:");
													double salarioS = Double.parseDouble(in.nextLine());
													salario = salarioS;
													} catch(NumberFormatException e) {
														System.out.println("Por favor, insíra um caractere válido.");
													}
													}
													System.out.println("Digite os beneficios da vaga:");
													String beneficios = in.nextLine();
													
													int quantidade = -1;
													while (quantidade == -1) {
														try {
															System.out.println("Digite a quantidade de vagas disponíveis:");
															int quantidadeS = Integer.parseInt(in.nextLine());
															quantidade = quantidadeS;
														} catch(NumberFormatException e) {
															System.out.println("Por favor, insíra um caractere válido.");
														}
													}
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
													
													vagaS.add(vaga);
													conta.setVagas(vagaS);
													
													System.out.println("Sua vaga foi criada!");
													System.out.println("--------------------------------------------");
													System.out.println("Título: " + vaga.getTitulo());
													System.out.println("Escolaridade mínima: "+ vaga.getRequisitos().getGrauEnsino());
													System.out.println("Descrição: " + vaga.getDescricao());
													System.out.println(
															"Vagas disponíveis: " + vaga.getQuantidade());
													System.out
															.println("Tipo de contrato: " + vaga.getTipo());
													System.out.println("--------------------------------------------");
		
													break;
												}
											}
											break;
											
										case 4:
											System.out.println("Até logo...");
											menuContaR = false;
											break;

										default:
											System.out.println("Tente novamente...");
											break;
										}
										} catch(NumberFormatException e) {
											System.out.println("Por favor, insíra um caractere válido.");
										}
									}
								}
							}
						}
						System.out.println("E-mail ou Senha invalido(s)");
						break;

					case 3:
						System.out.println("Voltar");
						menu2 = false;
						break;
					default:
						System.out.println("Tente novamente...");
						break;
						
					}
					} catch(NumberFormatException e) {
						System.out.println("Por favor, insíra um caractere válido.");
						
					}
				}
				break;
			case 2:
				System.out.println("Digite seu email:");
				String email = in.nextLine();
				
				System.out.println("Digite sua senha:");
				String senha = in.nextLine();
				
				boolean menuRegistro = true;
				while (menuRegistro) {
					try {
						System.out.println("Agora escolha o seu tipo de conta através do número:");
						System.out.println("[1] Candidato");
						System.out.println("[2] Recrutador");
						System.out.println("[3] Sair");
						int tipoConta = Integer.parseInt(in.nextLine());
						
						switch (tipoConta) {
						case 1:
							ContaCandidato novaContaC = new ContaCandidato(email, senha);
							contasC.add(novaContaC);
							System.out.println("Sua conta foi cadastrada. Use o e-mail "+novaContaC.getEmail()+" para efetuar o login.");
							menuRegistro = false;
							break;
						case 2:
							ContaRecrutador novaContaR = new ContaRecrutador(email, senha);
							contasR.add(novaContaR);
							System.out.println("Sua conta foi cadastrada. Use o e-mail "+novaContaR.getEmail()+" para efetuar o login.");
							menuRegistro = false;
							break;
						case 3:
							System.out.println("Até logo...!");
							menuRegistro = false;
							break;
						default:
							System.out.println("Tente novamente...");
							break;
						}
					} catch(NumberFormatException e) {
						System.out.println("Por favor, insíra um caractere válido.");
						System.out.println("Voltando ao menu anterior");					
					}
				}
				break;
			case 3:
				System.out.println("Até logo...");
				menuPrincipal = false;
				in.close();
				break;

			}

		} catch(NumberFormatException e) {
			System.out.println("Por favor, insíra um caractere válido.");
		}
		}
	}

}
