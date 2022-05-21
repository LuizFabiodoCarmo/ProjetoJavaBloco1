package JavaProjectBloco1;

	import java.util.ArrayList;

	public class Run extends BaseAvatar {

		public static void main(String[] args) {
			
			//Collections
			
			ArrayList<String> op = new ArrayList<>();
			ArrayList<String> op2 = new ArrayList<>();

			op.add("\n1 -Sobre história generation");
			op.add("\n2 -Missão Generation");
			op.add("\n3 -Princípios e Valores Generation");
			op.add("\n4 -Nossos programa");
			op.add("\n5 -Nossos parceiros\n");
			
			op2.add("\n1 -Como participar do nosso programa?"); 
			op2.add("\n2 -Preciso ter conhecimento em programação?");
			op2.add("\n3 -Quais exigências para poder participar?");
			op2.add("\n4 -Quantos tempo dura o Bootcamp?");
			op2.add("\n5 -Não tenho internet e computador em casa, posso participar?");
			op2.add("\n6 -Como preparamos você?");
			op2.add("\n7 -O que você vai aprender?");
			op2.add("\n8 -O que faz um desenvolvedor Junior?");
			op2.add("\n9 -Como será sua jornada?\n");
			
		   Apresentacao a1 = new Apresentacao();
		   Manu1 m1 = new Manu1();
		   Manu2 m2 = new Manu2();
		   
		   a1.apresentar();
		   a1.falarcomManuOuManu2();
		 
		   if(a1.falarcomquem==1)
		   { 
			   System.out.println("\nLegal que queira saber mais sobre a Generation!!");
			   System.out.println("Digite o número correspondente as opção abaixo:");
			   System.out.println(op);
			   System.out.println("Se quiser sair digite 0.");
			   m1.perguntasmanu();
		   }
		   else if(a1.falarcomquem==2)
		   {
			   System.out.println("\nLegal, vamos la tirar suas dúvidas!!");
			   System.out.println("Digite o número correspondente as opção abaixo: ");
			   System.out.println(op2);
			   System.out.println("Se quiser sair digite 0.");
			   m2.perguntasmanu();
		   }
	 
		}
	
}
