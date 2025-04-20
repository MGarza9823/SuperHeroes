public class Superhero 
{
    //superhero attributes
    private String name;
    private String ability;
    private int powerLevel;


    //this is a constructor that initializes the superhero's attributes
    public Superhero(String name, String ability, int powerLevel)
    {
        this.name = name;
        this.ability = ability;
        this.powerLevel = powerLevel;
    }

    //a method displays the superhero's atrributes 
    public void displayHero() 
    {
        System.out.println(name + " - " + ability + " - Power Level: " + powerLevel);
    }

    //getter for the powerlevel
    public int getPowerLevel()
    {
        return powerLevel;
    }

}