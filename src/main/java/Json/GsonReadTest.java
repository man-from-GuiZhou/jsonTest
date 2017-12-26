package Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class GsonReadTest {
    public static void main(String[] args) throws IOException {
        File file = new File(JsonObjectExample.class.getResource("/YuHao.json").getFile());
        String content = FileUtils.readFileToString(file);
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        Person yuHao = gson.fromJson(content,Person.class);
        System.out.println(yuHao.toString());
    }
}
