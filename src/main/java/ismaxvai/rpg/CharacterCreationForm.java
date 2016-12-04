package ismaxvai.rpg;

import java.util.ArrayList;
import java.util.List;

public class CharacterCreationForm {
	private List<Skill> createdForm;
	
	public List<Skill> getCreatedForm() {
		return createdForm;
	}

	public void setCreatedForm(List<Skill> form) {
		this.createdForm = form;
	}

	CharacterCreationForm(){
		createdForm = new ArrayList<Skill>();
	}
	
	public void addSkill(String skill, int min, int max, int id){ 
		//NO ES POT REPETIR EL NOM
		Skill s = new Skill(skill, min, max, id);
		createdForm.add(s);
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
	
	public int setSkill(String name, int value){
		int size = createdForm.size();
		for(int i = 0; i < size; ++i){
			if(createdForm.get(i).getSkilName() == name) {
				return createdForm.get(i).setActual(value);
			}
		}
		return 0; //SI ARRIBA AQUI NO TROBA L'ESQUILL
	}
}

