package pessoa;

public abstract class Pessoa implements Trabalhador {
	protected String nome;
	protected boolean trabalhando;
	protected TipoTrabalho tipoTrabalho;
	protected String cargo;
	protected boolean recebeBolsa;
	protected float salario;

	public Pessoa( String nome, TipoTrabalho tipoTrabalho ) {
		this.setNome( nome );
		this.setTipoTrabalho( tipoTrabalho );
		this.setCargo( tipoTrabalho.cargo );
		this.setSalario( tipoTrabalho.salario );
		if( this.getTipoTrabalho( ).equals( TipoTrabalho.ESTAGIO ) ) {
			this.setRecebeBolsa( true );
		}
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

	public float getSalario( ) {
		return salario;
	}

	public void setSalario( float salario ) {
		this.salario = salario;
	}

	public String getCargo( ) {
		return cargo;
	}

	public void setCargo( String cargo ) {
		this.cargo = cargo;
	}

	public boolean isRecebeBolsa( ) {
		return recebeBolsa;
	}

	public void setRecebeBolsa( boolean recebeBolsa ) {
		this.recebeBolsa = recebeBolsa;
	}

	public void realizarOperacaoNoBanco() {
		System.out.println( "Ler relatórios..." );
	}

	@Override
	public String toString( ) {
		return "Pessoa{" +
				"nome='" + nome + '\'' +
				", trabalhando=" + trabalhando +
				", tipoTrabalho=" + tipoTrabalho +
				", cargo='" + cargo + '\'' +
				", salario=" + salario +
				'}';
	}
}
