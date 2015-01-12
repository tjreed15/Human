package brain;

public class RightLobe {

	int physical;
	int creative;
	int adventuresome;
	int subjective;
	int feminine;
	
	public RightLobe(){
		physical = 0;
		creative = 0;
		adventuresome = 0;
		subjective = 0;
		feminine = 0;
	}

	public RightLobe(int physical, int creative, int adventuresome,
			int subjective, int feminine) {
		super();
		this.physical = physical;
		this.creative = creative;
		this.adventuresome = adventuresome;
		this.subjective = subjective;
		this.feminine = feminine;
	}
	
	public String toString(){
		String toReturn = "";
		toReturn = toReturn + "Physical-" + physical;
		toReturn = toReturn + " Creative-" + creative;
		toReturn = toReturn + " Adventuresome-" + adventuresome;
		toReturn = toReturn + " Subjective-" + subjective;
		toReturn = toReturn + " Feminine-" + feminine;
		toReturn = toReturn + ". ";
		return toReturn;
	}

	public int getPhysical() {
		return physical;
	}

	public void setPhysical(int physical) {
		this.physical = physical;
	}

	public int getCreative() {
		return creative;
	}

	public void setCreative(int creative) {
		this.creative = creative;
	}

	public int getAdventuresome() {
		return adventuresome;
	}

	public void setAdventuresome(int adventuresome) {
		this.adventuresome = adventuresome;
	}

	public int getSubjective() {
		return subjective;
	}

	public void setSubjective(int subjective) {
		this.subjective = subjective;
	}

	public int getFeminine() {
		return feminine;
	}

	public void setFeminine(int feminine) {
		this.feminine = feminine;
	}
	
	
	
}
