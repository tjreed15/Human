package brain;

public class LeftLobe {
	
	int verbal;
	int logical;
	int cautious;
	int objective;
	int masculine;
	
	public LeftLobe(){
		verbal = 0;
		logical = 0;
		cautious = 0;
		objective = 0;
		masculine = 0;
	}
	
	public String toString(){
		String toReturn = "";
		toReturn = toReturn + "Verbal-" + verbal;
		toReturn = toReturn + " Logical-" + logical;
		toReturn = toReturn + " Cautious-" + cautious;
		toReturn = toReturn + " Objective-" + objective;
		toReturn = toReturn + " Masculine-" + masculine;
		toReturn = toReturn + ". ";
		return toReturn;
	}

	public LeftLobe(int verbal, int logical, int cautious, int objective,
			int masculine) {
		super();
		this.verbal = verbal;
		this.logical = logical;
		this.cautious = cautious;
		this.objective = objective;
		this.masculine = masculine;
	}



	public int getVerbal() {
		return verbal;
	}

	public void setVerbal(int verbal) {
		this.verbal = verbal;
	}

	public int getLogical() {
		return logical;
	}

	public void setLogical(int logical) {
		this.logical = logical;
	}

	public int getCautious() {
		return cautious;
	}

	public void setCautious(int cautious) {
		this.cautious = cautious;
	}

	public int getObjective() {
		return objective;
	}

	public void setObjective(int objective) {
		this.objective = objective;
	}

	public int getMasculine() {
		return masculine;
	}

	public void setMasculine(int masculine) {
		this.masculine = masculine;
	}
	
	
	

}
