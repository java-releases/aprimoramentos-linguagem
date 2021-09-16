package exemplos;

public class MeuArquivoLeituraOutro implements AutoCloseable {

	private String tag;

	public MeuArquivoLeituraOutro(String tag) {
		this.tag = tag;
	}

	@Override
	public void close() throws IllegalStateException {
		throw new IllegalStateException("lan�ada pelo metodo close()");
	}

	public String getTag() {
		return tag;
	}

}