class Address
{
    private String country;
    private String streetno;
    private String city;
    
    Address(String streetno ,String city, String country)
    {
        this.streetno = streetno;
        this.city = city;
        this.country = country;
    }
    public String get()
    {
        return streetno + ", " + city + ", " + country;
    }
}

class Person
{
    private String name;
    private int age;
    private Address address;//Its as "HAS-A" Example as "Person has address", or even we can also say age, name are also "HAS-A" example
    Person(String name, int age, String streetno, String city, String country)
    {
        address = new Address(streetno, city,country);
        this.name = name;
        this.age = age;
    }
    public void get()
    {
        System.out.printf("Name : %s %nAge  : %d%n", name, age);
        System.out.printf("Address : %s", address.get());
    }
}
public class HASAExample
{
    public static void main(String[] args)
    {
        Person p = new Person("Wasit Shafi", 23, "104-A", "Jamia Nagar", "India");
        p.get();
    }
}