/**
 * Abstract Animal class
 * Implements Jump interface
 * Inherited by Dog and Frog subclasses
 */
public abstract class Animal implements Jump {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

