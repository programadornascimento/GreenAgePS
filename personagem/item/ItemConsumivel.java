package personagem.item;

import personagem.Atributos;
import personagem.Personagem;

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
	
	public boolean usar(Personagem pessoa) {
		//Script para usar item consumível
		return true;
	}
}