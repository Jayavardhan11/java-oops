public class classes {
    int x = 5;

    public static void main(String[] args) {
        classes myObj = new classes();
        System.out.println(myObj.x);
        //Multiple Objects
        //You can create multiple objects of one class:
        classes myObj1 =  new classes();
        classes myObj2 =  new classes();
        //you can modify value of x for each object, if it not set as final
        myObj2.x = 10;
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
}
