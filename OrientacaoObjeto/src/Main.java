public class Main {
	public static void main(String[] args) {
		
		//Invocação da classe Livro para a main//
		Livro book = new Livro();
		
		//book é a variável dada ao objeto livro para invocar suas características no void main//
		book.titulo = "A desonra";
		book.autor = "Machado de Souza";
		book.editora = "Marshall Law";
		book.paginas = 305;
		
		//comando para imprimir as informações passado para as características do objeto Livro//
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
		
		//condição para saber se o tipo da planta é medicinal ou não com a variável booleana//
		if(flower.medicinal == true) {
			flower.tipo = "Medicinal";
		}
		else {
			flower.tipo = "Não medicinal";
		}
		
		System.out.println("Nome: "+ flower.nome +"\nTipo: "+ flower.tipo +"\n");
		
		Mamiferos animal = new Mamiferos();
		
		animal.nome = "Leão";
		animal.tipo = "Terrestre";
		
		System.out.println("Nome: "+ animal.nome +"\nTipo: "+ animal.tipo +"\n");
		
		Aves bird = new Aves();
		
		bird.nome = "Pato";
		bird.tipo = "Aquático";
		bird.voa = true;
		
		if(bird.voa == true) {
			bird.validacaoVoa = "Voador";
		}
		else {
			bird.validacaoVoa = "Não é voador";
		}
		
		System.out.println("Nome: "+ bird.nome +"\nTipo: "+ bird.tipo +"\nVoa: "+ bird.validacaoVoa +"\n");
		
	}
}
