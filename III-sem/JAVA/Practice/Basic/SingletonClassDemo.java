class SingletonClass {
  String s;
  static SingletonClass obj = null; // object assigned to null
  private SingletonClass() { // now no one cass access constructor outside the class to create an objects
    s = "Hello World... from singleton class";  
  }

  public static SingletonClass getInstanceMethod() { // this method will return the object reference(name of method is user defined)
     if (obj == null){
       obj = new SingletonClass(); // create an instance
     }
     return obj;
  }
  public void print() {
    System.out.println(s);
  }
}

public class SingletonClassDemo {
  public static void main(String[] args)
  {
    // Error because it's constructor is private so we will call method of this class
    // SingletonClass obj1 = new SingletonClass();

    SingletonClass obj1 = SingletonClass.getInstanceMethod();
    SingletonClass obj2 = SingletonClass.getInstanceMethod();
    SingletonClass obj3 = SingletonClass.getInstanceMethod();

    System.out.println(obj1); // hashcode
    System.out.println(obj2);
    System.out.println(obj3);
    obj1.print();
    obj2.print();  
    obj3.print();
  }
}