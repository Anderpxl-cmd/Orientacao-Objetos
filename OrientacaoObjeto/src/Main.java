public class Main {
	public static void main(String[] args) {
		
		//Invoca��o da classe Livro para a main//
		Livro book = new Livro();
		
		//book � a vari�vel dada ao objeto livro para invocar suas caracter�sticas no void main//
		book.titulo = "A desonra";
		book.autor = "Machado de Souza";
		book.editora = "Marshall Law";
		book.paginas = 305;
		
		//comando para imprimir as informa��es passado para as caracter�sticas do objeto Livro//
		System.out.println("Titulo: "+ book.titulo +"\nAutor: "+ book.autor +"\nEditora: "+ book.editora +"\nPaginas: "+ book.paginas +"\n");
		
		Celular phone = new Celular();
		
		phone.tipo = "SmartPhone";
		phone.memoriaRam = 4;
		phone.memoria = 120;
		phone.app = 20;
		
		System.out.println("Tipo: "+ phone.tipo +"\nMemoria RAM: "+ phone.memoriaRam +"\nMemoria: "+ phone.memoria +"\nQuantidade de Apps: "+ phone.app +"\n");
		
		Flores flower = new Flores();
		
		flower.nome = "Cannabis Sativa";
		flower.medicinal = true;
		
		//condi��o para saber se o tipo da planta � medicinal ou n�o com a vari�vel booleana//
		if(flower.medicinal == true) {
			flower.tipo = "Medicinal";
		}
		else {
			flower.tipo = "N�o medicinal";
		}
		
		System.out.println("Nome: "+ flower.nome +"\nTipo: "+ flower.tipo +"\n");
		
		Mamiferos animal = new Mamiferos();
		
		animal.nome = "Le�o";
		animal.tipo = "Terrestre";
		
		System.out.println("Nome: "+ animal.nome +"\nTipo: "+ animal.tipo +"\n");
		
		Aves bird = new Aves();
		
		bird.nome = "Pato";
		bird.tipo = "Aqu�tico";
		bird.voa = true;
		
		if(bird.voa == true) {
			bird.validacaoVoa = "Voador";
		}
		else {
			bird.validacaoVoa = "N�o � voador";
		}
		
		System.out.println("Nome: "+ bird.nome +"\nTipo: "+ bird.tipo +"\nVoa: "+ bird.validacaoVoa +"\n");
		
	}
}
