package exemplos;

public class Exemplo1 {

	public static void main(String[] args) {

		try (var ler = new MeuArquivoLeitura("macaco")) {
			System.out.println("Try Block");
			System.out.println("Leu: " + ler.getTag());
			System.out.println("O recurso será fechado após ler essa linha!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally Block");
		}
	}

}