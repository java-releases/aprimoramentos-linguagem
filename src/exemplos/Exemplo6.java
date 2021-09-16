package exemplos;

public class Exemplo6 {

	public static void main(String[] args) {

		try (MeuArquivoLeituraOutro ler = new MeuArquivoLeituraOutro("lendo livro")) {
			throw new RuntimeException("lançada uma RuntimeException a partir do block try");
		} catch (IllegalStateException e) {
			System.out.println("Capturada: " + e.getMessage());
			for (Throwable t : e.getSuppressed()) {
				System.out.println("Supressed: " + t.getMessage());
			}
		}

	}

}