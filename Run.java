package JavaProjectBloco1;

	import java.util.ArrayList;

	public class Run extends BaseAvatar {

		public static void main(String[] args) {
			
			//Collections
			
			ArrayList<String> op = new ArrayList<>();
			ArrayList<String> op2 = new ArrayList<>();

			op.add("\n1 -Sobre hist�ria generation");
			op.add("\n2 -Miss�o Generation");
			op.add("\n3 -Princ�pios e Valores Generation");
			op.add("\n4 -Nossos programa");
			op.add("\n5 -Nossos parceiros\n");
			
			op2.add("\n1 -Como participar do nosso programa?"); 
			op2.add("\n2 -Preciso ter conhecimento em programa��o?");
			op2.add("\n3 -Quais exig�ncias para poder participar?");
			op2.add("\n4 -Quantos tempo dura o Bootcamp?");
			op2.add("\n5 -N�o tenho internet e computador em casa, posso participar?");
			op2.add("\n6 -Como preparamos voc�?");
			op2.add("\n7 -O que voc� vai aprender?");
			op2.add("\n8 -O que faz um desenvolvedor Junior?");
			op2.add("\n9 -Como ser� sua jornada?\n");
			
		   Apresentacao a1 = new Apresentacao();
		   Manu1 m1 = new Manu1();
		   Manu2 m2 = new Manu2();
		   
		   a1.apresentar();
		   a1.falarcomManuOuManu2();
		 
		   if(a1.falarcomquem==1)
		   { 
			   System.out.println("\nLegal que queira saber mais sobre a Generation!!");
			   System.out.println("Digite o n�mero correspondente as op��o abaixo:");
			   System.out.println(op);
			   System.out.println("Se quiser sair digite 0.");
			   m1.perguntasmanu();
		   }
		   else if(a1.falarcomquem==2)
		   {
			   System.out.println("\nLegal, vamos la tirar suas d�vidas!!");
			   System.out.println("Digite o n�mero correspondente as op��o abaixo: ");
			   System.out.println(op2);
			   System.out.println("Se quiser sair digite 0.");
			   m2.perguntasmanu();
		   }
	 
		}
	
}
