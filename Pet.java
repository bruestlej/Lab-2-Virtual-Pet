// Add a Pet class here
public class Pet 
{
  // Add 3 instance variables
  private int mood;
  private int health;
  private int age;

  public Pet()
  {
    mood = 10;
    health = 10;
    age = 1;  
  }
  // Add 3 simple methods for the pet with no arguments
  public void Feed()
  {
    health = health + 1;

    print();

    System.out.println("Your pet licks its lips!");
  }

  public void Sleep()
  {
    age = age + 1;

    print();

    System.out.println("Your pet plops on the ground and begins to snore!");
  }

  public void Walk()
  {
    mood = mood + 1;

    print();

    System.out.println("Your pet feels strong!");
  }

   public void print()
  {
    System.out.println("Mood " + mood);
    System.out.println("Health: " + health);
    System.out.println("Age: " + age);
  }
}