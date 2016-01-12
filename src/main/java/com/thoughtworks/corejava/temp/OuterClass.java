package com.thoughtworks.corejava.temp;

import com.google.gson.Gson;

/**
 * Created by rajatbhatnagar on 1/12/16.
 * Class to demonstrate how an inner lass can be used to set a variable and used in outer class
 * TODO : Cleanup code
 */
public class OuterClass {
    protected InnerClass outerClass = new OuterClass.InnerClass();

    public String buildResponse(int status){
            String response;
            Gson gson = new Gson();
            String json;
            if(status == 1){
                response = outerClass.buildResponseInnerClass(1);
                json = gson.toJson(response);
            }else if(status == 2){
                response = outerClass.buildResponseInnerClass(2);
                json = gson.toJson(response);
            }else if(status == 3){
                response = outerClass.buildResponseInnerClass(3);
                json = gson.toJson(response);
            }else{
                throw new IllegalArgumentException("Something is bad");
            }
        return json ;

    }
    private class InnerClass {
        private String jsonString;
        private InnerClass innerClass ;
        public InnerClass(String jsonString) {
            this.jsonString = jsonString;
        }

        public InnerClass() {

        }

        public String buildResponseInnerClass(int status){
            String response;
            if(status == 1){
                response = "One";
            }else if(status == 2){
                response = "Two";
            }else if(status == 3){
                response = "Three";
            }else{
                throw new IllegalArgumentException("Something is bad");
            }
            return response;
        }

        @Override
        public String toString() {
            return "InnerClass{" +
                    "jsonString='" + jsonString + '\'' +
                    '}';
        }

        public InnerClass buildResponse(int status){

            if(status == 1){
                innerClass = new InnerClass("One");
            }else if(status == 2){
                innerClass = new InnerClass("Two");
            }else if(status == 3){
                innerClass = new InnerClass("Three");
            }else{
                throw new IllegalArgumentException("Something is bad");
            }
            return innerClass;
        }

    }

    public static void main(String[] args) {
        String response1 = new OuterClass().outerClass.buildResponse(1).toString();
        System.out.println("json 1 = " + response1);
        String response2 = new OuterClass().outerClass.buildResponse(2).toString();
        System.out.println("json 2 = " + response2);
        String response3 = new OuterClass().outerClass.buildResponse(3).toString();
        System.out.println("json 3 = " + response3);
        //String response4 = new OuterClass().outerClass.buildResponse(4);

    }
}
