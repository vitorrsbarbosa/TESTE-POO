package Pessoa;

public abstract class Pessoa implements Trabalhador {
	protected String nome;
	protected String funcao;
	protected boolean trabalhando;

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

	public void realizarOperacaoNoBanco() {
		System.out.println( "Ler relatórios..." );
	}

	@Override
	public String toString( ) {
		return "Pessoa{" +
				"nome='" + nome + '\'' +
				", funcao='" + funcao + '\'' +
				", trabalhando=" + trabalhando +
				'}';
	}
}
