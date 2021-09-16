package exemplos;

public class Exemplo7 {

	@SuppressWarnings("finally")
	public static void main(String[] args) {

		try (MeuArquivoLeituraOutro ler = new MeuArquivoLeituraOutro("lendo livro")) {
			throw new IllegalStateException("lançada uma RuntimeException a partir do block try");
		} finally {
			throw new RuntimeException("lançada uma RuntimeException a partir do block finally");
		}

	}

}