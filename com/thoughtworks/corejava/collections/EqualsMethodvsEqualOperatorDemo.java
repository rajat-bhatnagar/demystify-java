package com.thoughtworks.corejava.collections;

/**
 * Created by rajatbhatnagar on 6/2/15.
 */
public class EqualsMethodvsEqualOperatorDemo {
    public static void main(String[] args) {
        String str1 = new String("REST");
        String str2 = new String("REST");
        String str3 = new String("JAXB");
        String str4 = str3;
        String str5 = "REST";
        String str6 = "REST";
        String str7 = str6;
        String str8 = null;
        String str9 = null;

        //Checking equals method
        System.out.println("str1.equals(str2) :: "+str1.equals(str2)); //true
        System.out.println("str2.equals(str3) :: "+str2.equals(str3)); //false
        System.out.println("str1.equals(str6) :: "+str1.equals(str6)); //true

        //Try to compare two null objects by equals method
        try {
            System.out.println("str8.equals(str9) :: "+str8.equals(str9));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        //Try to compare two null objects by == operator
        System.out.println(str8 == str9);

        //Checking == operator
        System.out.print("str5==str6 :: ");
        System.out.println(str5==str6);//false
        System.out.print("str6==str7 :: ");
        System.out.println(str6==str7);//true
        System.out.print("str2==str6 :: ");
        System.out.println(str2==str6);//false
    }
}
