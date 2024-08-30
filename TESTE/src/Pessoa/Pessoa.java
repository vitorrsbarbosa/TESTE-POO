package Pessoa;

public abstract class Pessoa implements Trabalhador {
	protected String nome;
	protected boolean trabalhando;
	protected TipoTrabalho tipoTrabalho;

	public Pessoa( String nome, TipoTrabalho tipoTrabalho ) {
		this.setNome( nome );
		this.setTipoTrabalho( tipoTrabalho );
	}

	public String getNome( ) {
		return nome;
	}

	public void setNome( String nome ) {
		this.nome = nome;
	}

	public boolean isTrabalhando( ) {
		return trabalhando;
	}

	public void setTrabalhando( boolean trabalhando ) {
		this.trabalhando = trabalhando;
	}

	public TipoTrabalho getTipoTrabalho( ) {
		return tipoTrabalho;
	}

	public void setTipoTrabalho( TipoTrabalho tipoTrabalho ) {
		this.tipoTrabalho = tipoTrabalho;
	}

	public void realizarOperacaoNoBanco() {
		System.out.println( "Ler relatórios..." );
	}

	@Override
	public String toString( ) {
		return "Pessoa{" +
				"nome='" + nome + '\'' +
				", funcao='" + tipoTrabalho + '\'' +
				", trabalhando=" + trabalhando +
				'}';
	}
}
