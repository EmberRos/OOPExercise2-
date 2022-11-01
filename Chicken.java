public class Chicken extends MyPet {
	private String type;

	public Chicken(String name, double weight, String type) {
		super(name, weight);
		this.type = type;
	}
	
	@Override
	public String makeSound() {
		return "Cluck!";
	}

	public String getType() {
		return type;
	}
	
	public void setType(String type){
		this.type = type;
	}
}


