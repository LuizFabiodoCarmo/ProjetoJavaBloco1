package JavaProjectBloco1;

	import java.util.Scanner;

	public class Manu2 extends Apresentacao {

		Scanner ler =new Scanner(System.in);
		
		int res;
		
		//Polimorfismo/sobreposição
		@Override
		public void perguntasmanu() {
			
				res = ler.nextInt();
			
			if(res==0)
			{
				System.out.println("\nEsperamos ter te ajudado!\n\nCaso contrário, acesse nosso site  https://brazil.generation.org/ \r\n"
				   		+ "e também nossas redes: \nE-Mail: generationbrasil@outlook.com \r\n"
				   		+ "Instagram: @generationbrasil\r\n"
				   		+ "Whatsapp: 90000-0000\r\n\n\nVejo você por lá!!");
				System.exit(res);
			}
			
			
			while(res==1||res==2||res==3||res==4||res==5||res==6||res==7||res==8||res==9||res==0||res<0||res>9) {
				
				if(res==1)
				{
					System.out.println("\n1 -Como participar do nosso programa?");
					System.out.println("Inscreva-se online no programa por meio do link no site Generation e complete todas as\r\n"
							+ "etapas do processo seletivo (fiquei de olho em nossas redes sociais para saber quando os processos seletivos serão abertos)");
					 System.out.println("\nDigite outra opção:");
						res=ler.nextInt();
				}
				else if(res==2)
				{
					System.out.println("\n2 -Preciso ter conhecimento em programação?");
					System.out.println("Não precisa, a equipe Generation presta todo apoio necessário para desenvolvimento dos\r\n"
							+ "participantes, o que você precisa é de vontade para fazer acontecer!");
					System.out.println("\nDigite outra opção:");
					res=ler.nextInt();
				}
				else if(res==3)
				{
					System.out.println("\n3 -Quais exigências para poder participar?");
					System.out.println("Recrutamento de jovens (18-30 anos) com base em características intrínsecas e requisitos profissionais para\r\n"
							+ "a profissão.");
					System.out.println("\nDigite outra opção:");
					res=ler.nextInt();
				}
				else if(res==4)
				{
					System.out.println("\n4 -Quantos tempo dura o Bootcamp?");
					System.out.println("De 10 a 12 semanas de treinamento intensivo em habilidades técnicas, comportamentais e mentalidade.");
					System.out.println("\nDigite outra opção:");
					res=ler.nextInt();
				}
				else if(res==5)
				{
					System.out.println("\n5 -Não tenho internet e computador em casa, posso participar?");
					System.out.println("Prestamos serviços de apoio social (ex: auxílio internet, notebook e bolsa)\r\n"
							+ "(cada caso estará sujeito a uma avaliação socioeconômica)");
					System.out.println("\nDigite outra opção:");
					res=ler.nextInt();
				}
				else if(res==6)
				{
					System.out.println("\n6 -Como preparamos você?");
					System.out.println("A Generation adota uma abordagem diferente para ajudar vocês a construir uma carreira de sucesso. Os\r\n"
							+ "instrutores e mentores da Generation conhecem cada aluno e contam com recursos, ferramentas e\r\n"
							+ "informações caso um aluno encontre obstáculos.\r\n"
							+ "\r\n"
							+ "-> Mentorias;\r\n"
							+ "->Elaboração do currículo;\r\n"
							+ "->Ensaio para a entrevista;\r\n"
							+ "->Apoio contínuo.");
					System.out.println("\nDigite outra opção:");
					res=ler.nextInt();
				}
				else if(res==7)
				{
					System.out.println("\n7 -O que você vai aprender?");
					System.out.println("->HABILIDADES TÉCNICAS:\r\n"
							+ "Vamos ajudar você a aprender as habilidades técnicas para ser um desenvolvedor de sucesso com muitas\r\n"
							+ "sessões interativas e práticas.\r\n"
							+ "\r\n"
							+ "->HABILIDADES COMPORTAMENTAIS\r\n"
							+ "Em todos os trabalhos, existem habilidades essenciais que ajudarão você a ter sucesso. Ajudaremos você a\r\n"
							+ "aprender como:\r\n"
							+ "\r\n"
							+ "");
					System.out.println("\nDigite outra opção:");
					res=ler.nextInt();
				}
				else if(res==8)
				{
					System.out.println("\n8 -O que faz um desenvolvedor Junior?");
					System.out.println("Um(a) Desenvolvedor(a) Junior faz parte de uma equipe que projeta, constrói e aperfeiçoa aplicativos, sites e\r\n"
							+ "outros sistemas de software. Ele/ela está envolvido(a) em todas as áreas de desenvolvimento, do design ao\r\n"
							+ "teste do produto.");
					System.out.println("\nDigite outra opção:");
					res=ler.nextInt();	
				}
				else if(res==9)
				{
					System.out.println("\n9 -Como será sua jornada?");
					System.out.println("->Passo 1 - Concluir o processo de seleção;\r\n"
							+ "->Passo 2 - Concluir o processo de orientação com a equipe da Generation. \r\n"
							+ "->Passo 3 - Iniciar o treinamento. Concluir todas as tarefas e frequentar as aulas diariamente, \npronto para aprender e interagir com o grupo e o instrutor");
					System.out.println("\nDigite outra opção:");
					res=ler.nextInt();
				}
				
				else if(res>9)
				{
					System.out.println("\nOpção inválida, Digite uma opção de 1 à 9!");
					   res = ler.nextInt();
				}
				else if(res<0)
				{
					System.out.println("\nOpção inválida, Digite uma opção de 1 à 9!");
					   res = ler.nextInt();
				}
				else 
				{
					 System.out.println("\nEsperamos ter te ajudado!\n\nCaso contrário, acesse nosso site  https://brazil.generation.org/ \r\n"
						   		+ "e também nossas redes: \nE-Mail: generationbrasil@outlook.com \r\n"
						   		+ "Instagram: @generationbrasil\r\n"
						   		+ "Whatsapp: 90000-0000\r\n\n\nVejo você por lá!!");
					 System.exit(res);
				}
			}
			
		}
	
}
