package Json;

import com.google.gson.annotations.SerializedName;

public class Person {
   // @SerializedName("NAME")
    private String name;
    //@SerializedName("AGE")
    private int age;
   // @SerializedName("HOBBY")
    private String[] hobby;
    private Object house;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String[] getHobby() {
        return hobby;
    }

    public Object getHouse() {
        return house;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public void setHouse(Object house) {
        this.house = house;
    }

    public Person(){

    }

    public String toString(){
        return ""+this.name+" "+this.age;
    }

    public Person(String name, int age, String[] hobby, Object house) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
        this.house = house;
    }
}
