package personagem.item;

import personagem.Atributos;

public class ItemConsumivel extends Item {
	private Integer duracao;
	private Atributos modificadorDeAtributos;
	
	public Integer getDuracao() {
		return duracao;
	}

	public Atributos getModificadorDeAtributos() {
		return modificadorDeAtributos;
	}

	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}

	public void setModificadorDeAtributos(Atributos modificadorDeAtributos) {
		this.modificadorDeAtributos = modificadorDeAtributos;
	}
	
	public ElementoItem criar() {
		//Script para criar elemento de item consumível
		return null;
	}
}