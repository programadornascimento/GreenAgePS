package dominio.item;

import dominio.Atributos;
import dominio.Item;

public class ItemConsumivel extends Item {
	private Integer duracao;
	private Atributos modificadorDeAtributos;
	
	public ItemConsumivel(String nome, String descricao, Integer valor, Integer duracao, Atributos modificadorDeAtributos) {
		super(nome, descricao, valor, 2);
		this.duracao = duracao;
		this.modificadorDeAtributos = modificadorDeAtributos;
		super.register(this);
	}

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