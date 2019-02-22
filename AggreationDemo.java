/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat_server;

/**
 *
 * @author 205117026
 */
class Address
{
    String country,state,district;
    Address(String country , String state,String district)
    {
        this.country=country;
        this.district=district;
        this.state=state;
    }
}
class Person
{
    String name;
    Address address;
    Person(String name , Address address)
    {
        this.name=name;
        this.address=address;
    }
}
public class AggreationDemo {
    public static void main(String args[])
    {
        Address address = new Address("India","MP","Dewas");
        Person p = new Person("Shubham",address);
        System.out.println(p.name);
        System.out.println(p.address.country);
        System.out.println(p.address.state);
        System.out.println(p.address.district);
    }
}
