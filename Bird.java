public class Bird extends MyPet {
	private String breed;

	public Bird(String name, double weight, String breed) {
		super(name, weight);
		this.breed = breed;
	}
	@Override
	public String makeSound() {
		return "Caw! Caw!";
	}

	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed){
		this.breed = breed;
	}
	
}

