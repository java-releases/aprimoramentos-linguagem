package exemplos;

public class Exemplo4 {

	public static void main(String[] args) {
		final var lerLivro = new MeuArquivoLeitura("4");
		var lerVideo = new MeuArquivoLeitura("5");
		try (lerLivro; var lerTv = new MeuArquivoLeitura("6"); lerVideo) {
			System.out.println("try Block");
		} catch (Exception e) {
			System.out.println("catch Block");
			e.printStackTrace();
		} finally {
			System.out.println("finally Block");
		}
	}

}