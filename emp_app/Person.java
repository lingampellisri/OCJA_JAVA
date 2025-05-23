package emp_app;

public class Person {

    private String  firstname;
    private String lastname;
    private int age;

    public Person(String firstname,String lastname,int age)
    {
        this.firstname=firstname;
        this.lastname=lastname;
        this.age=age;

    }

    public String getFirstName()
    {
        return firstname;
    }

    public void setFirstName(String firstname)
    {
        this.firstname=firstname;
    }


        public String getLastName()
    {
        return lastname;
    }

        public void setLastName(String lastname)
    {
        this.lastname=lastname;
    }

        public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age=age;
    }

    public String toString() {
        return firstname + " " + lastname + " (" + age + ")";
    }


    
}
