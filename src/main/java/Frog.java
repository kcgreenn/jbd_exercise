/**
 * Concrete implementation of an Animal. Implements
 * Croak and Jump interfaces.
 */
public class Frog extends Animal implements Croak{
    private int poisonLevel;

    /**
     * @desc Frog Class default constructor
     */
    public Frog(){

    }
    /**
     * @desc  Frog Class constructor
     * @param name
     * @param poisonLevel
     */
    public Frog(String name, int poisonLevel){
        this.name = name;
        this.poisonLevel = poisonLevel;
    }

    /**
     * @desc Returns the poisonLevel of the Frog instance
     * @return int posionLevel
     */
    public int getPoisonLevel() {
        return poisonLevel;
    }

    /**
     * Sets the poisonLevel member of Frog class.
     * @param poisonLevel
     */
    public void setPoisonLevel(int poisonLevel) {
        this.poisonLevel = poisonLevel;
    }

    /**
     * @desc Prints "Croak croak" to console, implemented from Croak interface
     */
    public void printCroak(){
        System.out.println("Croak croak");
    }

    /**
     * @desc Prints "I jump" to console, implemented from Jump interface
     */
    public void printJump(){
        System.out.println("I Jump!");
    }
}
