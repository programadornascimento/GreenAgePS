package personagem;


public abstract class NPC extends Entidade {
	protected String nome;
	protected Aparencia aparencia;
	
	public mapa.Mapa getMapa() {
		return mapa;
	}
	
	public EntidadeEstado getEstado() {
		return estado;
	}
	
	public Ponto2D getPosicao() {
		return posicao;
	}
	
	public String getNome() {
		return nome;
	}

	public Aparencia getAparencia() {
		return aparencia;
	}

	public void setMapa(mapa.Mapa mapa) {
		this.mapa = mapa;
	}
	
	public void setEstado(EntidadeEstado estado) {
		this.estado = estado;
	}
	
	public void setPosicao(Ponto2D posicao) {
		this.posicao = posicao;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setAparencia(Aparencia aparencia) {
		this.aparencia = aparencia;
	}
	
	public abstract boolean iniciar(Personagem pessoa);
}

