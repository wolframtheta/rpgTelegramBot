package ismaxvai.rpg;

import java.util.ArrayList;
import java.util.List;

public class CharacterCreationForm {
	private List<Skill> createdForm;
	private List<String> createdAptitudes;
	
	
	public List<String> getCreatedAptitudes() {
		return createdAptitudes;
	}

	public void setCreatedAptitudes(List<String> aptitudes) {
		this.createdAptitudes = aptitudes;
	}

	public List<Skill> getCreatedForm() {
		return createdForm;
	}

	public void setCreatedForm(List<Skill> form) {
		this.createdForm = form;
	}

	CharacterCreationForm(){
		createdForm = new ArrayList<Skill>();
		createdAptitudes = new ArrayList<String>();
	}
	
	public void addSkill(String skill, int min, int max){ 
		//NO ES POT REPETIR EL NOM
		Skill s = new Skill(skill, min, max);
		createdForm.add(s);
	}
	
	public void addAptitude(String aptitude){
		createdAptitudes.add(aptitude);
	}
	
	//retorna 0 si no puede borrar
	public int deleteSkill(String name){
		int size = createdForm.size();
		for(int i = 0; i < size; ++i){
			if(createdForm.get(i).getSkilName() == name) {
				createdForm.remove(createdForm.get(i).getSkilName());
				return 1;
			}
		}
		return 0;
	}
	
	public void setSkill(String name, int value){
		int size = createdForm.size();
		for(int i = 0; i < size; ++i){
			if(createdForm.get(i).getSkilName() == name) {
				createdForm.get(i).setActual(value);
			}
		}
	}
}

