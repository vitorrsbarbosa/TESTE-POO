package Pessoa;

public abstract class Pessoa implements Trabalhador {
	private String nome;
	private String funcao;
	private boolean trabalhando;

	public String getNome( ) {
		return nome;
	}

	public void setNome( String nome ) {
		this.nome = nome;
	}

	public String getFuncao( ) {
		return funcao;
	}

	public void setFuncao( String funcao ) {
		this.funcao = funcao;
	}

	public boolean isTrabalhando( ) {
		return trabalhando;
	}

	public void setTrabalhando( boolean trabalhando ) {
		this.trabalhando = trabalhando;
	}

	public Pessoa( String nome, String funcao, boolean trabalhando ) {
		this.nome = nome;
		this.funcao = funcao;
		this.trabalhando = trabalhando;
	}

	@Override
	public String toString( ) {
		return "Pessoa: { \n" +
				"        nome = '" + nome + '\'' + ",\n" +
				"        funcao = '" + funcao + '\'' + ",\n" +
				"        trabalhando = " + trabalhando  + ",\n" +
				'}';
	}

	public void realizarOperacaoNoBanco() {
		System.out.println( "Ler relatórios..." );
	}
}
