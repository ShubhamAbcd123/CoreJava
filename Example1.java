package demoinheritance;
public class Super {
    public static void main(String [] args)
    {
        Employe e= new Employe();
        e.dis();
    }
}
class Person
{
    String Fname;
    String Lname;
    Person()
    {
        this.Fname="Shubham";
        this.Lname="Karma";
    }
    public void dis()
    {
        System.out.println(Fname + " " + Lname);
    }
}
class Employe extends Person
{
    String org_name;
    Employe()
    {
        this.org_name="NITT";
    }
    @Override
    public void dis()
    {
        System.out.println(Fname + " " + Lname + " " + org_name);
        System.out.println(Fname + " " + Lname + " " + org_name);
    }
}
