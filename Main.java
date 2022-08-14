public class Main
{
	public static void main(String[] args) {
        
        Animal cat = new Cat();
        Animal dog = new Dog();
        
        cat.setType("Bald");
        System.out.println(cat.getType());

        cat.speak();
        dog.speak();
        
        
	}
}
