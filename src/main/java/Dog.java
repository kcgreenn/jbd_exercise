/**
 * Concrete implementation of an Animal. Implements
 * Bark and Jump interfaces.
 */
public class Dog extends Animal implements Bark{
    private String furColor;

    /**
     * Default Constructor
     */
    public Dog(){

    }
    /**
     * Constructor setting furColor for Dog instance
     * @param furColor
     */
    public Dog(String name, String furColor){
        this.name = name;
        this.furColor = furColor;
    }

    /**
     * @desc Returns the furColor member of Dog
     * @return String furColor
     */
    public String getFurColor() {
        return furColor;
    }

    /**
     * @desc Sets the furColor member with the furColor passed as parameter
     * @param furColor
     */
    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    /**
     * @desc Prints "I jump" to console, implemented from Jump interface
     */
    public void printJump(){
        System.out.println("I jump!");
    }

    /**
     * @desc Prints "Bark bark" to console, implemented from Bark interface
     */
    public void printBark(){
        System.out.println("Bark bark");
    }
}
