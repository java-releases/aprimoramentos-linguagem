package exemplos;

public class MeuArquivoLeitura implements AutoCloseable {

	private String tag;

	public MeuArquivoLeitura(String tag) {
		this.tag = tag;
	}

	@Override
	public void close() throws Exception {
		System.out.println("Closed: " + tag);
	}

	public String getTag() {
		return tag;
	}

}