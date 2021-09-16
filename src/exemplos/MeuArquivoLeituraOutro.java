package exemplos;

public class MeuArquivoLeituraOutro implements AutoCloseable {

	private String tag;

	public MeuArquivoLeituraOutro(String tag) {
		this.tag = tag;
	}

	@Override
	public void close() throws Exception {
		System.out.println("Executando o metodo close();");
		throw new IllegalStateException("lançada pelo metodo close()");
	}

	public String getTag() {
		return tag;
	}

}