package JavaProjectBloco1;

	import java.util.InputMismatchException;
	import java.util.Scanner;

	public class Apresentaçao extends BaseAvatar { 
		
		Scanner ler = new Scanner(System.in);

	    int falarcomquem;
	    
	    	public void apresentar() {      
	    		//Herança
	    		this.setNome("Manu");
	    		this.setIdade(this.soma(3,3)+this.soma(3, 5, 5));
	    		this.setgenero("não-binárie");
	    		System.out.println("Olá, eu sou "+this.getNome()+", muito prazer!!\nTenho "+this.getIdade()+" anos e sou uma pessoa "+this.getgenero()+".\nEstou aqui para te ajudar nessa trajetória e tirar suas dúvidas...\n");
	    		} 
	    	
	    	
	    	//Exceptions
			public void falarcomManuOuManu2() {
				try {
				System.out.println("Se você quer saber mais sobre a Generation digite o número correspondente as opções abaixo:");
				System.out.println("1- Para conhecer a Generation");
				System.out.println("2- Para tirar sua duvidas");
				falarcomquem=ler.nextInt();
				
				
				while(this.falarcomquem>2||this.falarcomquem<1)
				if(this.falarcomquem>2) {
					System.out.println("\nNúmero inválido, tente novamente:\n");
					System.out.println("Se você quer saber mais sobre a Generation digite o número correspondente as opções abaixo:");
					System.out.println("1- Para conhecer a Generation");
					System.out.println("2- Para tirar sua duvidas");
					falarcomquem=ler.nextInt();
				}
				else if(this.falarcomquem<1) {
					System.out.println("\nNúmero inválido, tente novamente:\n");
					System.out.println("Se você quer saber mais sobre a Generation digite o número correspondente as opções abaixo:");
					System.out.println("1- Para conhecer a Generation");
					System.out.println("2- Para tirar sua duvidas");
					falarcomquem=ler.nextInt();
				}
				
				}catch(InputMismatchException erro)
				{
					System.out.println("\nERRO -> Você digitou uma letra, por favor na próxima digite apenas números!");}
				
				}
		

}
