public class SuperheroRoster
{

    public static void main(String[] args)
    {
        //declares and initializes arrays for the superhero name, ability, powerlevel 
        String[] heroNames = {"Wolverine", "Spiderman", "Hulk" };
        String[] abilities = {"Metal claws", "Wall-crawling", "Strength"};
        int[] powerLevels = {85, 80, 100};
    
    // prints the super heroes name and details using a loop
    System.out.println("SuperHero Roster: ");

    for (int i = 0; i < heroNames.length; i++) 
    {
        System.out.println(heroNames[i] + " - " + abilities[i] + " - Power Level: " + powerLevels[i]);
    }

    System.out.println("\nSearching for hero: Wolverine");
    searchHero(heroNames, abilities, powerLevels, "Wolverine");

    double avg = calculateAveragePower(powerLevels);
    System.out.println("\nAverage Power Level: " + avg);

    System.out.println("\nSuperhero List: ");
    Superhero[] heroes = new Superhero[heroNames.length];
    for (int i = 0; i < heroes.length; i++)
    {
        heroes[i] = new Superhero(heroNames[i], abilities[i], powerLevels[i]);
        heroes[i].displayHero();
    }
    //prints the heroes sorted by power level in descending order
     System.out.println("\nHeroes Sorted by Power Level (Descending Order): ");
     sortHeroesByPower(heroes);
        for (Superhero hero : heroes)
        {
            hero.displayHero();
        }

    }

// searches for the hero by name and gives their details
public static void searchHero(String[] names, String[] abilities, int[] powerLevels, String target)
        {
            boolean found = false;
            for (int i = 0; i < names.length; i++)
            {
                if (names[i].equalsIgnoreCase(target))
                {
                    System.out.println("Hero found: " + names[i] + " - " + abilities[i] + " - Power Level: " + powerLevels[i]);
                    found = true;
                    break;
                }
            }
            if (!found)
            {
                System.out.println("Hero not found: " + target);
            }
        }
        // Calculates the average power level
        public static double calculateAveragePower(int[] powerLevels)
        {
            int sum = 0;
            for (int power: powerLevels)
            {
                sum += power;
            }
            return (double) sum/ powerLevels.length;
        }
        // sorts an array of heroes by power level in descending order
        public static void sortHeroesByPower(Superhero[] heroes)
        {
            for (int i = 0; i < heroes.length - 1; i++)
            {
                for(int j = i + 1; j < heroes.length; j++)
                {
                    if (heroes[j].getPowerLevel() > heroes[i].getPowerLevel())
                    {
                        Superhero temp = heroes[i];
                        heroes[i] = heroes[j];
                        heroes[j] = temp;
                    }
                }
            }
        }
}