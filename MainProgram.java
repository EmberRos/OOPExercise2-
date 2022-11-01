public class MainProgram
{
	public static void main(String[] args) {
		MyPet pet;
		Chicken chicken = new Chicken("",1,"Chicken");
		Bird bird = new Bird("", 5, "Eagle");

		pet = bird;
		System.out.println(pet.makeSound() + " " + "Im an " + bird.getBreed());
        
		
		pet = chicken;
		System.out.println(pet.makeSound() + " " + "Im a " + chicken.getType() );
	    		}
	
}
