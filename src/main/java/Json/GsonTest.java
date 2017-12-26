package Json;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Field;

public class GsonTest {
    public static void main(String args[]){
        Person NimaYu = new Person();
        NimaYu.setName("NimaYu");
        NimaYu.setAge(22);
        NimaYu.setHouse(null);
        NimaYu.setHobby(new String[]{"videoGame","swimming"});
        GsonBuilder gsonBuilder= new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        gsonBuilder.setFieldNamingStrategy(new FieldNamingStrategy() {
            public String translateName(Field field) {
                if(field.getName().equals("hobby")){
                    return "amusement";
                }
                return field.getName();
            }
        });
        Gson gson = gsonBuilder.create();
        System.out.println(gson.toJson(NimaYu));
    }
}
