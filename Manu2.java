package JavaProjectBloco1;

	import java.util.Scanner;

	public class Manu2 extends Apresentacao {

		Scanner ler =new Scanner(System.in);
		
		int res;
		
		//Polimorfismo/sobreposi��o
		@Override
		public void perguntasmanu() {
			
				res = ler.nextInt();
			
			if(res==0)
			{
				System.out.println("\nEsperamos ter te ajudado!\n\nCaso contr�rio, acesse nosso site  https://brazil.generation.org/ \r\n"
				   		+ "e tamb�m nossas redes: \nE-Mail: generationbrasil@outlook.com \r\n"
				   		+ "Instagram: @generationbrasil\r\n"
				   		+ "Whatsapp: 90000-0000\r\n\n\nVejo voc� por l�!!");
				System.exit(res);
			}
			
			
			while(res==1||res==2||res==3||res==4||res==5||res==6||res==7||res==8||res==9||res==0||res<0||res>9) {
				
				if(res==1)
				{
					System.out.println("\n1 -Como participar do nosso programa?");
					System.out.println("Inscreva-se online no programa por meio do link no site Generation e complete todas as\r\n"
							+ "etapas do processo seletivo (fiquei de olho em nossas redes sociais para saber quando os processos seletivos ser�o abertos)");
					 System.out.println("\nDigite outra op��o:");
						res=ler.nextInt();
				}
				else if(res==2)
				{
					System.out.println("\n2 -Preciso ter conhecimento em programa��o?");
					System.out.println("N�o precisa, a equipe Generation presta todo apoio necess�rio para desenvolvimento dos\r\n"
							+ "participantes, o que voc� precisa � de vontade para fazer acontecer!");
					System.out.println("\nDigite outra op��o:");
					res=ler.nextInt();
				}
				else if(res==3)
				{
					System.out.println("\n3 -Quais exig�ncias para poder participar?");
					System.out.println("Recrutamento de jovens (18-30 anos) com base em caracter�sticas intr�nsecas e requisitos profissionais para\r\n"
							+ "a profiss�o.");
					System.out.println("\nDigite outra op��o:");
					res=ler.nextInt();
				}
				else if(res==4)
				{
					System.out.println("\n4 -Quantos tempo dura o Bootcamp?");
					System.out.println("De 10 a 12 semanas de treinamento intensivo em habilidades t�cnicas, comportamentais e mentalidade.");
					System.out.println("\nDigite outra op��o:");
					res=ler.nextInt();
				}
				else if(res==5)
				{
					System.out.println("\n5 -N�o tenho internet e computador em casa, posso participar?");
					System.out.println("Prestamos servi�os de apoio social (ex: aux�lio internet, notebook e bolsa)\r\n"
							+ "(cada caso estar� sujeito a uma avalia��o socioecon�mica)");
					System.out.println("\nDigite outra op��o:");
					res=ler.nextInt();
				}
				else if(res==6)
				{
					System.out.println("\n6 -Como preparamos voc�?");
					System.out.println("A Generation adota uma abordagem diferente para ajudar voc�s a construir uma carreira de sucesso. Os\r\n"
							+ "instrutores e mentores da Generation conhecem cada aluno e contam com recursos, ferramentas e\r\n"
							+ "informa��es caso um aluno encontre obst�culos.\r\n"
							+ "\r\n"
							+ "-> Mentorias;\r\n"
							+ "->Elabora��o do curr�culo;\r\n"
							+ "->Ensaio para a entrevista;\r\n"
							+ "->Apoio cont�nuo.");
					System.out.println("\nDigite outra op��o:");
					res=ler.nextInt();
				}
				else if(res==7)
				{
					System.out.println("\n7 -O que voc� vai aprender?");
					System.out.println("->HABILIDADES T�CNICAS:\r\n"
							+ "Vamos ajudar voc� a aprender as habilidades t�cnicas para ser um desenvolvedor de sucesso com muitas\r\n"
							+ "sess�es interativas e pr�ticas.\r\n"
							+ "\r\n"
							+ "->HABILIDADES COMPORTAMENTAIS\r\n"
							+ "Em todos os trabalhos, existem habilidades essenciais que ajudar�o voc� a ter sucesso. Ajudaremos voc� a\r\n"
							+ "aprender como:\r\n"
							+ "\r\n"
							+ "");
					System.out.println("\nDigite outra op��o:");
					res=ler.nextInt();
				}
				else if(res==8)
				{
					System.out.println("\n8 -O que faz um desenvolvedor Junior?");
					System.out.println("Um(a) Desenvolvedor(a) Junior faz parte de uma equipe que projeta, constr�i e aperfei�oa aplicativos, sites e\r\n"
							+ "outros sistemas de software. Ele/ela est� envolvido(a) em todas as �reas de desenvolvimento, do design ao\r\n"
							+ "teste do produto.");
					System.out.println("\nDigite outra op��o:");
					res=ler.nextInt();	
				}
				else if(res==9)
				{
					System.out.println("\n9 -Como ser� sua jornada?");
					System.out.println("->Passo 1 - Concluir o processo de sele��o;\r\n"
							+ "->Passo 2 - Concluir o processo de orienta��o com a equipe da Generation. \r\n"
							+ "->Passo 3 - Iniciar o treinamento. Concluir todas as tarefas e frequentar as aulas diariamente, \npronto para aprender e interagir com o grupo e o instrutor");
					System.out.println("\nDigite outra op��o:");
					res=ler.nextInt();
				}
				
				else if(res>9)
				{
					System.out.println("\nOp��o inv�lida, Digite uma op��o de 1 � 9!");
					   res = ler.nextInt();
				}
				else if(res<0)
				{
					System.out.println("\nOp��o inv�lida, Digite uma op��o de 1 � 9!");
					   res = ler.nextInt();
				}
				else 
				{
					 System.out.println("\nEsperamos ter te ajudado!\n\nCaso contr�rio, acesse nosso site  https://brazil.generation.org/ \r\n"
						   		+ "e tamb�m nossas redes: \nE-Mail: generationbrasil@outlook.com \r\n"
						   		+ "Instagram: @generationbrasil\r\n"
						   		+ "Whatsapp: 90000-0000\r\n\n\nVejo voc� por l�!!");
					 System.exit(res);
				}
			}
			
		}
	
}
