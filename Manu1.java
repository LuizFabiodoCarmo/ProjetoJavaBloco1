package JavaProjectBloco1;


	import java.util.Scanner;

	public class Manu1 extends Apresentacao  {

		Scanner ler = new Scanner(System.in);
		
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
					   		+ "Whatsapp: 90000-0000\r\n\n\nVejo voce por la!!");
				System.exit(res);
			}
			
			   
			  while(res==1||res==2||res==3||res==4||res==5||res==0||res<0||res>5) {
			   if(res==1)
			   {
				   System.out.println("\n1 -Sobre história generation");
					System.out.println("A Generation é uma organização independente e sem fins lucrativos fundada em 2014 pela McKinsey &\r\n"
								+ "Company para ajudar a eliminar a lacuna do desemprego  com velocidade e escala.\r\n"
								+ "No mundo todo, mais de 75 milhões de jovens estão desempregados. Ao mesmo tempo, muitas empresas\r\n"
								+ "não conseguem encontrar pessoas com as habilidades necessárias para preencher suas vagas de entrada.”\r\n");
					System.out.println("Digite outra opção:");
					res=ler.nextInt();
					
				}
			   else if(res==2)
			   {
				   System.out.println("\n2 -Missão Generation"); 
				   System.out.println("Nossa missão é transformar sistemas de educação para o emprego de maneira a preparar, colocar e apoiar\r\n"
				   		+ "pessoas em carreiras transformadoras que, de outra forma, seriam inacessíveis\r\n");	 
				   System.out.println("Digite outra opção:");
					res=ler.nextInt();
			   }
			   else if(res==3)
			   {
				   System.out.println("\n3 -Princípios e Valores Generation");
				   System.out.println("Ética, Responsabilidade social, respeito");
				   System.out.println("\nDigite outra opção:");
					res=ler.nextInt();
			   }
			   else if(res==4)
			   {
				   System.out.println("\n4 - Nossos programas:");
				   System.out.println("Temos programas de bootcamp para Pessoa Desenvolvedora .NET, Pessoa Desenvolvedora Web e Pessoa\r\n"
				   		+ "Desenvolvedora Mobile");
				   System.out.println("\nDigite outra opção:");
					res=ler.nextInt();
			   }
			   else if(res==5)
			   {
				   System.out.println("\n5 -Nossos parceiros");
				   System.out.println("NOSSOS PRINCIPAIS PARCEIROS DE IMPLEMENTAÇÃO \r\n"
				   		+ "McKinsey & Company,  BMA Barbosa Mussinich Aragão, IOS }Instituto da oportunidade social, ismart,\r\n"
				   		+ "Parceiros da Educação, FIAP, progra{m}aria, cpm cidadão pró-mundo, alura, Linkedin, {Perifacode();},\r\n"
				   		+ "Brasscom, 1MiO"
				   		+ "\n\nNOSSOS PARCEIROS EMPREGADORES:\r\n"
				   		+ "Loggi, MC1 win the market, BRQ Digital Solutions, Itaú, ITM, minutrade, luizalabs, vittude,\r\n"
				   		+ "iteris a software company, sumup, sanar, cpqd, alice, BEES, ThoughtWorks, Linear Softwares Matemáticos,\r\n"
				   		+ "NEXT, ORGANICOS in box, BBCHAIN, connectis, DDSD, certsys, foursys,, TAKING, Key People Insights,\r\n"
				   		+ "HST marketing eletronic transactions secure, INTELLIGENZA. IT & Business Solutions, e-core.");
				   System.out.println("\nDigite outra opção:");
					res=ler.nextInt();
			   }
			   else if(res>5){
				   System.out.println("\nOpção inválida, Digite uma opção de 1 à 5!");
				   System.out.println("Ou se quiser sair digite 0.");
				   res = ler.nextInt();
			   }
			   else if(res<0)
			   {
				   System.out.println("\nOpção inválida, Digite uma opção de 1 à 5!");
				   System.out.println("Ou se quiser sair digite 0.");
				   res = ler.nextInt();
				   
			   }else 
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
