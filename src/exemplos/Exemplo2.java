package exemplos;

public class Exemplo2 {

	public static void main(String[] args) {

		// Devem ser separados por ; (ponto + vírgula);
		// O Último ; (ponto + vírgula) é de uso opcional;
		try (var lerLivro = new MeuArquivoLeitura("1"); var lerVideo = new MeuArquivoLeitura("2"); var lerTelevisao = new MeuArquivoLeitura("3");) {
			System.out.println("Try Block");
		} catch (Exception e) {
			System.out.println("Catch Block");
			e.printStackTrace();
		} finally {
			System.out.println("Finally Block");
		}
	}

}