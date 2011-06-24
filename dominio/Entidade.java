package dominio;

public abstract class Entidade {
	protected mapa.Mapa mapa;
	protected EntidadeEstado estado;
	protected Ponto2D posicao;
	
	public abstract mapa.Mapa getMapa();
	
	public abstract EntidadeEstado getEstado();
	
	public abstract Ponto2D getPosicao();
	
	public abstract void setMapa(mapa.Mapa mapa);
	
	public abstract void setEstado(EntidadeEstado estado);
	
	public abstract void setPosicao(Ponto2D posicao);
}

