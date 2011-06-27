package dominio.perfil;

import dominio.Atributos;

public class Habilidade {
	private String nome;
	private Integer duracao;
	private TipoHabilidade tipo;
	private Atributos modificadorDeAtributos;
	private Integer nivelMinimo;
	
	public String getNome() {
		return nome;
	}
	
	public Integer getDuracao() {
		return duracao;
	}
	
	public TipoHabilidade getTipo() {
		return tipo;
	}
	
	public Atributos getModificadorDeAtributos() {
		return modificadorDeAtributos;
	}
	
	public Integer getNivelMinimo() {
		return nivelMinimo;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}
	
	public void setTipo(TipoHabilidade tipo) {
		this.tipo = tipo;
	}
	
	public void setModificadorDeAtributos(Atributos modificadorDeAtributos) {
		this.modificadorDeAtributos = modificadorDeAtributos;
	}

	public void setNivelMinimo(Integer nivelMinimo) {
		this.nivelMinimo = nivelMinimo;
	}
}
