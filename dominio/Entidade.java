package dominio;

public abstract class Entidade extends Selecionavel {
	protected mapa.Mapa mapa;
	protected EntidadeEstado estado;
	protected Ponto2D posicao;
	
	protected Entidade() {}
	
	protected Entidade(Integer type) {
		super(type);
	}
	
	public abstract mapa.Mapa getMapa();
	
	public abstract EntidadeEstado getEstado();
	
	public abstract Ponto2D getPosicao();
	
	public abstract void setMapa(mapa.Mapa mapa);
	
	public abstract void setEstado(EntidadeEstado estado);
	
	public abstract void setPosicao(Ponto2D posicao);
}

