package Personagem;

public abstract class Entidade {
	protected Mapa.Mapa mapa;
	protected EntidadeEstado estado;
	protected Ponto2D posicao;
	
	public abstract Mapa.Mapa getMapa();
	
	public abstract EntidadeEstado getEstado();
	
	public abstract Ponto2D getPosicao();
	
	public abstract void setMapa(Mapa.Mapa mapa);
	
	public abstract void setEstado(EntidadeEstado estado);
	
	public abstract void setPosicao(Ponto2D posicao);
}
