package JavaProjectBloco1;

	public class BaseAvatar implements Falas  {

		//Encapsulamento
		private String nome;
		private int idade;
	    private String genero;

	    //Encapsulamento
	    public String getNome() {return nome;}

		public void setNome(String nome) {this.nome = nome;}

		public int getIdade() {return idade;}

		public void setIdade(int idade) {this.idade = idade;}

		public String getgenero() {return genero;}

		public void setgenero(String genero) {this.genero = genero;}
		
		
		//funções com assinaturas diferentes
		public int soma(int n1,int n2)
		{
			return n1+n2;
		}
		public int soma(int n1, int n2, int n3)
		{
			return n1+n2+n3;
		}
		
		
		//Polimorfismo/sobreposição
		@Override
		public void perguntasmanu() {

		}
		

}
