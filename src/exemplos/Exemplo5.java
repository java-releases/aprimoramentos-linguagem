package exemplos;

public class Exemplo5 {

	public static void main(String[] args) {

		try (MeuArquivoLeituraOutro ler = new MeuArquivoLeituraOutro("lendo livro")) {
			throw new IllegalStateException("lançada pelo nova excption de dentro do block try");
		} catch (Exception e) {
			System.out.println("Capturada: " + e.getMessage());
			for (Throwable t : e.getSuppressed()) {
				System.out.println("Supressed: " + t.getMessage());
			}
		}
	}

}