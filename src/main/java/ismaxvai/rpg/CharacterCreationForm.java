package ismaxvai.rpg;

import java.util.ArrayList;
import java.util.List;

public class CharacterCreationForm {
	private List<Skill> form; 
	private List<String> aptitudes;
	
	
	public List<Skill> getForm() {
		return form;
	}

	public void setForm(List<Skill> form) {
		this.form = form;
	}

	CharacterCreationForm(){
		form = new ArrayList<Skill>();
		aptitudes = new ArrayList<String>();
	}
	
	public void addSkill(String skill, int min, int max){ 
		//NO ES POT REPETIR EL NOM
		Skill s = new Skill(skill, min, max);
		form.add(s);
	}
	
	public void addAptitude(String aptitude){
		aptitudes.add(aptitude);
	}
	
	//retorna 0 si no puede borrar
	public int deleteSkill(String name){
		int size = form.size();
		for(int i = 0; i < size; ++i){
			if(form.get(i).getSkilName() == name) {
				form.remove(form.get(i).getSkilName());
				return 1;
			}
		}
		return 0;
	}
}

