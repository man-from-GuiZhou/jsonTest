package Json;

//import com.sun.org.apache.xpath.internal.operations.String;
import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class JsonObjectExample {
    public static void main(String args[]) throws IOException {

        File file = new File(JsonObjectExample.class.getResource("/YuHao.json").getFile());
        String content = FileUtils.readFileToString(file);
        JSONObject jsonObject = new JSONObject(content);
        if(!jsonObject.isNull("name")) {
            System.out.println("nmae is :" + jsonObject.getString("name"));
        }
        System.out.println("age is :"+jsonObject.getInt("age"));
        JSONArray hobby=jsonObject.getJSONArray("hobby");
        for(Object item:hobby){
            System.out.println(item.toString());
        }
        //testJson();
        //testJsonMap();
        //testJsonBean();
    }

    public static void testJson(){
        JSONObject yuHao= new JSONObject();
        Object nullObject = null;
        yuHao.put("name","YuHao");
        yuHao.put("age",22);
       // String[] hobbyString = {"videoGame","swiming"};
        yuHao.put("hobby",new String[]{"videoGame","swiming"});
        yuHao.put("house",nullObject);
        System.out.println(yuHao.toString());
    }

    public static void testJsonMap(){
        Map<String,Object>yuHao = new HashMap<String,Object>();
        Object nullObject = null;
        yuHao.put("name","YuHao");
        yuHao.put("age",22);
        // String[] hobbyString = {"videoGame","swiming"};
        yuHao.put("hobby",new String[]{"videoGame","swiming"});
        yuHao.put("house",nullObject);
        System.out.println(new JSONObject(yuHao).toString());
    }

    public static void testJsonBean(){
        Person NimaYu = new Person();
        NimaYu.setName("NimaYu");
        NimaYu.setAge(22);
        NimaYu.setHouse(null);
        NimaYu.setHobby(new String[]{"videoGame","swimming"});
        System.out.println(new JSONObject(NimaYu).toString());
    }
}
