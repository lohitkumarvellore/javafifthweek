public class Person
{
    private String name;
    private String email;
    private String phoneNumber;
    public Person(String theName, String theEmail, String thePhoneNumber)
    {
        this.name = theName;
        this.email = theEmail;
        this.phoneNumber = thePhoneNumber;
    }
    public String getName()
    {
        return this.name;
    }
    public String getEmail()
    {
        return this.email;
    }
    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }
    public void setName(String theName)
    {
        this.name = theName;
    }
    public void setEmail(String theEmail)
    {
        this.email = theEmail;
    }
    public void setPhoneNumber(String thePhoneNumber)
    {
        this.phoneNumber = thePhoneNumber;
    }
    public String toString()
    {
        return this.name + " " + this.email + " " + this.phoneNumber;
    }
    public static void main(String[] args)
    {
        Person p1 = new Person("Sana","abc@gmail.com","7856963514");
        System.out.println(p1);
        Person p2 = new Person("Jean","abc@gmail.com","7856963134");
        System.out.println(p2);
    }
}
