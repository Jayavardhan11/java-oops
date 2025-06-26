public class car_details{
    //create class attributes/fields
    int doors;
    String company ;
    String price ;
    // Create a class constructor for the Car class...
    //if ur creating constructor inside your .java file. make sure to use public keyword

    //Note that the constructor name must match the class name, and it cannot have a return type (like void).
    //
    //Also note that the constructor is called when the object is created.
    //
    //All classes have constructors by default: if you do not create a class constructor yourself,
    // Java creates one for you. However, then you are not able to set initial values for object attributes.


    //Java this Keyword
    //The this keyword in Java refers to the current object in a method or constructor
    //The this keyword is often used to avoid confusion when class attributes have the same name as method or constructor parameters.
    //


    public car_details(){
        this.doors=2;
    }
    //Calling a Constructor from Another Constructor
    //you can also use this() to call another constructor in the same class.
    //This is useful when you want to provide default values or reuse initialization code instead of repeating it.
    //Note: The call to this() must be the first statement inside the constructor.
    public car_details(String company){
        //base price and default no fof doors
        this(4,company,"50 lakhs");
    }

    //Constructor Parameters
    //Constructors can also take parameters, which is used to initialize attributes.

    public car_details(int doors,String company,String price){
        this.doors = doors;
        this.company=company;
        this.price=price;
    }

}