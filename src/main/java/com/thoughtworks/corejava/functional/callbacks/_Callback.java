package com.thoughtworks.corejava.functional.callbacks;

import java.util.function.Consumer;

public class _Callback {
    public static void main(String[] args) {
        callback("Joe", "Moe", null);
        callback("Joe", null,
                value -> System.out.println(" Empty last name using callbacks")
        );

        // Similar concept using runnable when we do not want to pass the default value
        runnable("Joe", "Moe", null);
        runnable("Joe", null,
                () -> System.out.println(" Empty last name using runnable")
        );
    }

    static void callback(String firstName, String lastName, Consumer<String> callback) {
        System.out.println(" firstName - " + firstName);
        if (lastName != null) {
            System.out.println(" lastName - " + lastName);
        } else {
            callback.accept(firstName);
        }
    }

    static void runnable(String firstName, String lastName, Runnable runnable) {
        System.out.println(" firstName - " + firstName);
        if (lastName != null) {
            System.out.println(" lastName - " + lastName);
        } else {
            runnable.run();
        }
    }


}


/* Java scripts callbacks

function callbackdemo(firstname, lastname, callback) {
    console.log("firstname - "+firstname);
    if (lastname != null ) {
        console.log("lastname - "+lastname);
    } else {
        callback();
    }
}
*/
