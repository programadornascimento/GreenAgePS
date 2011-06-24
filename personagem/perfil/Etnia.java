package personagem.perfil;

import personagem.Aparencia;
import personagem.Atributos;

public class Etnia {
	private String nome;
	private Atributos modificadorDeAtributos;
	private Aparencia aparencia;
	
	public String getNome() {
		return nome;
	}
	
	public Atributos getModificadorDeAtributos() {
		return modificadorDeAtributos;
	}
	
	public Aparencia getAparencia() {
		return aparencia;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setModificadorDeAtributos(Atributos modificadorDeAtributos) {
		this.modificadorDeAtributos = modificadorDeAtributos;
	}
	
	public void setAparencia(Aparencia aparencia) {
		this.aparencia = aparencia;
	}
}

