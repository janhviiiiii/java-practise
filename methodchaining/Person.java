package methodchaining;

public class Person{

    private String name;
    private int age;

    Person(String name, int age)
    {
        this.name=name;
        setAge(age);
    }

    public Person setName(String name)
    {
        this.name=name;
        return this;
    }

    public Person setAge(int age)
    {
        if(age > 0)
        {
            this.age=age;
        }
        return this;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public Person display()
    {
        
        System.out.println("Name of "+this+" is: "+getName());
        System.out.println("Age "+this+" is: "+getAge());

        return this;
    }

}