package Personagem;

public class Personagem extends Entidade {
	private String nome;
	private Atributos atributos;
	private Integer dinheiro;
	private Sexo sexo;
	private Integer nivel;
	private Etnia etnia;
	private Inventario inventario;
	
	public Mapa.Mapa getMapa() {
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
	
	public Atributos getAtributos() {
		return atributos;
	}
	
	public Integer getDinheiro() {
		return dinheiro;
	}
	
	public Sexo getSexo() {
		return sexo;
	}
	
	public Integer getNivel() {
		return nivel;
	}
	
	public Etnia getEtnia() {
		return etnia;
	}

	public Inventario getInventario() {
		return inventario;
	}

	public void setMapa(Mapa.Mapa mapa) {
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
	
	public void setAtributos(Atributos atributos) {
		this.atributos = atributos;
	}
	
	public void setDinheiro(Integer dinheiro) {
		this.dinheiro = dinheiro;
	}
	
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}
	
	public void setEtnia(Etnia etnia) {
		this.etnia = etnia;
	}
	
	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}
}
