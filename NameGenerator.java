package FakeNameGenerator;
import java.util.Random;

public class NameGenerator {
	  private String[] firstNames = {"Emily", "Michael", "Jessica", "Jacob", "Amanda"};
	    private String[] lastNames = {"Smith", "Johnson", "Williams", "Jones", "Brown"};
	    private String newFirstName;
	    private String newLastName;
	    private String newName;
	    private Random rand;

	    public NameGenerator() {
	        rand = new Random();
	    }

	    public void greetUser() {
	        System.out.println("You are about to receive a new name :)");
	    }

	    public void generateName() {
	        newFirstName = firstNames[rand.nextInt(firstNames.length)];
	        newLastName = lastNames[rand.nextInt(lastNames.length)];
	        newName = newFirstName + " " + newLastName;
	    }

	    public void printName() {
	        System.out.println("\nYour new name is " + newName + "\nHello, " + newName);
	    }

	    public String getNewFirstName() {
	        return newFirstName;
	    }

	    public void setNewFirstName(String newFirstName) {
	        this.newFirstName = newFirstName;
	    }

	    public String getNewLastName() {
	        return newLastName;
	    }

	    public void setNewLastName(String newLastName) {
	        this.newLastName = newLastName;
	    }

	    public String getNewName() {
	        return newName;
	    }

	    public void setNewName(String newName) {
	        this.newName = newName;
	    }
	}
