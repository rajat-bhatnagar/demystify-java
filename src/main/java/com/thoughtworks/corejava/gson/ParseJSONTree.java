package com.thoughtworks.corejava.gson;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by rajatbhatnagar on 10/3/15.
 * <p/>
 * This program demonstrates how we can convert JSON to a JSON Object tree
 */
public class ParseJSONTree {
    public static void main(String[] args) {
        String url = "http://freemusicarchive.org/api/get/albums.json?api_key=60BLHNQCAOUFPIBZ";
        try {
            String inputJSON = IOUtils.toString(new URL(url));
            //Construct a JsonParser
            JsonParser parser = new JsonParser();
            //Construct a JSON element
            JsonElement element = parser.parse(inputJSON);
            // The JsonElement is the root node. It can be an object, array, null or
            // java primitive.
            if (element.isJsonObject()) {
                JsonObject albums = element.getAsJsonObject();
                // use the isxxx methods to find out the type of jsonelement. In our
                // example we know that the root object is the Albums object and
                // contains an array of dataset objects
                System.out.println(albums.get("title").getAsString());
                JsonArray datasets = albums.getAsJsonArray("dataset");
                for (int counter = 0; counter < datasets.size(); counter++) {
                    JsonObject dataset = datasets.get(counter).getAsJsonObject();
                    System.out.println("***************************");
                    System.out.println("JsonElement at counter " + counter);
                    System.out.println(dataset.get("album_id").getAsInt() + " " + dataset.get("album_title").getAsString());
                    System.out.println(dataset.get("artist_name").getAsString());
                }
                System.out.println("***************************");
            }
        } catch (MalformedURLException mue) {
            mue.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
