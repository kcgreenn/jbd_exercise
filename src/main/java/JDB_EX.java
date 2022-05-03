public class JDB_EX {
    public static void main(String[] args){
        // Create instances of Dog and Frog classes and call various methods.
        Dog dog = new Dog();
        Frog frog = new Frog("Michigan",10);
        dog.printJump();
        dog.printBark();
        System.out.println(dog.getFurColor());
        dog.setFurColor("Black");
        System.out.println(dog.getFurColor());
        frog.printJump();
        frog.printCroak();
        System.out.println(frog.name);
    }
}
