package Personagem;

public class Pessoa extends NPC {
	private Sexo sexo;
	
	public Sexo getSexo() {
		return sexo;
	}
	
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	public boolean iniciar(Personagem pessoa) {
		//Script do npc "Pessoa"
		return false;
	}
}
