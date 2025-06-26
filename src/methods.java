public class methods {
    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args) {
        myStaticMethod(); // Call the static method
        // myPublicMethod(); This would compile an error

        methods myObj = new methods(); // Create an object of Main
        myObj.myPublicMethod(); // Call the public method on the object

        //example
        Car myCar =new Car();
        myCar.fullThrottle();
        myCar.speed(200);
    }
}
//Create a Car object named myCar.
// Call the fullThrottle() and speed() methods on the myCar object, and
// run the program:
class Car{

    // Create a fullThrottle() method
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    // Create a speed() method and add a parameter
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }
}