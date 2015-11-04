package com.thoughtworks.corejava.reflection;

/**
 * Created by rajatbhatnagar on 11/3/15.
 */
public class HartfordLibraryVO extends LibraryVO {


    public HartfordLibraryVO(int location, String subject) {
        super(location, subject);
    }

    private int areaCode;

    public int getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }


}
