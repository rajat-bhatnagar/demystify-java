package com.thoughtworks.corejava.numbers;

import org.apache.commons.codec.binary.Hex;

import java.nio.ByteBuffer;

/**
 *
 * Create hexadecimal numbers from long types
 */
public class CreateHexadecimalNumbers {

    public static byte[] longToBytes(long x) {
        ByteBuffer buffer = ByteBuffer.allocate(Long.BYTES);
        buffer.putLong(x);
        return buffer.array();
    }

    public static String createHexString(long sequenceNumber){
        String hexString = Hex.encodeHexString(longToBytes(sequenceNumber));
        //Removing leading zeros
        return hexString.substring(8,16);
    }

    public static Long createHexNum(String hexString){
        return Long.decode("0x"+hexString);
    }

    public static void main(String[] args) {
        //Checking for boundary conditions
        long LONG_MAX = 2147483647;
        System.out.println("Input Number :: " + LONG_MAX);
        System.out.println("HexString : "+createHexString(LONG_MAX) + " :: HexNum : " +createHexNum(createHexString(LONG_MAX)));
        //Checking for numbers from 0 to 15
        for(int i =0 ;i <17;i++){
            System.out.println("HexString : "+createHexString(i) + " :: HexNum : " +createHexNum(createHexString(i)));
        }
    }
}
