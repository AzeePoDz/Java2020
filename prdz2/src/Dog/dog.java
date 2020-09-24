package Dog;
import java.lang.*;
public class dog {
    private String name;
    private int age;
    public dog(String n, int a){
        name = n;
        age = a;
    }
    public dog(String n){
        name = n;
        age = 0;
    }
    public dog(){
        name = "Bob";
        age = 0;
    }
    public void setAge(){
        this.age = age;
    }
    public void setName(){
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public int getAge(int age){
        return age;
    }
    public String toString(){
        return this.name+", age "+this.age;
    }
    public void intoHumanAge(){
        System.out.println(name+"Ego vozrast"+age*7+"let");
    }

}
