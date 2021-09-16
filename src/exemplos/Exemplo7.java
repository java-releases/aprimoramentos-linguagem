package exemplos;

public class Exemplo7 {

	@SuppressWarnings("finally")
	public static void main(String[] args) {

		try (MeuArquivoLeituraOutro ler = new MeuArquivoLeituraOutro("lendo livro")) {
			throw new IllegalStateException("lan�ada uma RuntimeException a partir do block try");
		} finally {
			throw new RuntimeException("lan�ada uma RuntimeException a partir do block finally");
		}

	}

}