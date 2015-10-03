package com.thoughtworks.corejava.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by rajatbhatnagar on 10/3/15.
 * <p/>
 * This program demonstrates how a JSON can be read from a URL
 * i.e URL = http://freemusicarchive.org/api/get/albums.json?api_key=60BLHNQCAOUFPIBZ
 */
public class ReadJSONfromURL {
    public static void main(String[] args) {
        String url = "http://freemusicarchive.org/api/get/albums.json?api_key=60BLHNQCAOUFPIBZ";
        try {
            //Use Apache commons to read JSON content from URL
            String inputJSON = IOUtils.toString(new URL(url));
            //Use the Reader to read the json to a stream of tokens
            JsonReader reader = new JsonReader(new StringReader(inputJSON));
            handleObject(reader);
        } catch (MalformedURLException mue) {
            mue.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void handleObject(JsonReader reader) throws IOException {
        //beginObject() method Consumes the next token from the JSON stream and asserts that it is the beginning of a new object.
        reader.beginObject();
        while (reader.hasNext()) {
            //peek() method Returns the type of the next token without consuming it
            JsonToken token = reader.peek();
            //Check what value token has
            //BEGIN_ARRAY is The opening of a JSON array.
            if (token.equals(JsonToken.BEGIN_ARRAY)) {
                //handle the elements of JSON
                handleArray(reader);
            } else if (token.equals(JsonToken.END_OBJECT)) {
                //endObject() method Consumes the next token from the JSON stream and asserts that it is the end of the current object.
                reader.endObject();
            } else {
                handleNonArray(reader, token);
            }
        }

    }

    private static void handleNonArray(JsonReader reader, JsonToken token) throws IOException {
        if (token.equals(JsonToken.NAME)) {
            System.out.println(reader.nextName());
        } else if (token.equals(JsonToken.STRING)) {
            System.out.println(reader.nextString());
        } else if (token.equals(JsonToken.NUMBER)) {
            System.out.println(reader.nextDouble());
        } else {
            reader.skipValue();
        }
    }

    private static void handleArray(JsonReader reader) throws IOException {
        reader.beginArray();
        JsonToken token = reader.peek();
        while (true) {
            if (token.equals(JsonToken.END_ARRAY)) {
                reader.endArray();
                break;
            } else if (token.equals(JsonToken.BEGIN_ARRAY)) {
                handleObject(reader);
            } else if (token.equals(JsonToken.END_OBJECT)) {
                reader.endObject();
            } else {
                handleNonArray(reader, token);
            }
        }
    }
}
