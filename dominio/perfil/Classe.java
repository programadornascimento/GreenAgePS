package dominio.perfil;

import java.util.Set;

import dominio.item.Equipamento;

public class Classe {
	private String nome;
	private Integer nivelMinimo;
	
	private Set<Equipamento> equipamentos;
	private Set<Habilidade> habilidades;
	private Classe antecessor;
	private Classe sucessor;
	
	public String getNome() {
		return nome;
	}
	
	public Integer getNivelMinimo() {
		return nivelMinimo;
	}
	
	public Set<Equipamento> getEquipamentos() {
		return equipamentos;
	}
	
	public Set<Habilidade> getHabilidades() {
		return habilidades;
	}
	
	public Classe getAntecessor() {
		return antecessor;
	}
	
	public Classe getSucessor() {
		return sucessor;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setNivelMinimo(Integer nivelMinimo) {
		this.nivelMinimo = nivelMinimo;
	}
	
	public void setEquipamentos(Set<Equipamento> equipamentos) {
		this.equipamentos = equipamentos;
	}
	
	public void setHabilidades(Set<Habilidade> habilidades) {
		this.habilidades = habilidades;
	}
	
	public void setAntecessor(Classe antecessor) {
		this.antecessor = antecessor;
	}
	
	public void setSucessor(Classe sucessor) {
		this.sucessor = sucessor;
	}
}
