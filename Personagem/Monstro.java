package Personagem;

public class Monstro extends NPC {
	private Integer maximoMonstros;
	private Integer intervaloRenascimento;
	private Atributos atributos;
	
	public Integer getMaximoMonstros() {
		return maximoMonstros;
	}

	public Integer getIntervaloRenascimento() {
		return intervaloRenascimento;
	}

	public Atributos getAtributos() {
		return atributos;
	}

	public void setMaximoMonstros(Integer maximoMonstros) {
		this.maximoMonstros = maximoMonstros;
	}

	public void setIntervaloRenascimento(Integer intervaloRenascimento) {
		this.intervaloRenascimento = intervaloRenascimento;
	}

	public void setAtributos(Atributos atributos) {
		this.atributos = atributos;
	}

	public boolean iniciar(Personagem pessoa) {
		//Script do npc "Monstro"
		return false;
	}
}
