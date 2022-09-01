
public class Main { // Create a Main class
    String x; // The Attribute

    // The constructor for the Main class
    public Main() {
        x = "Jon WTF"; // this is the value for the class attribute
    }

    public static void main(String[] args) {
        Main name = new Main(); // This is the object of class Main (This is what calls the constructor)
        System.out.println(name.x); // Print statement
    }
}