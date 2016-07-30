package com.umanji.umanjiapp.model;

/**
 * Created by paul on 7/31/16.
 */
public class TestCDN {

    private String aa;
    private String bb;
    final String TYPE_ADMINISTRATOR           = "우만지행정전문가";
    final String TYPE_INTEREST                = "정치관심가";

    int foo = 0;
    int bar = 0;
    /*
    public TestCDN(String a, String b){

        aa = a;
        bb = b;

    }
*/


    public boolean isUpper(String a, String b) {
        switch(a){
            case TYPE_ADMINISTRATOR:
                foo = 10;
                break;

            case TYPE_INTEREST:
                foo = 5;
                break;
        }

        switch(b){
            case TYPE_ADMINISTRATOR:
                bar = 10;
                break;

            case TYPE_INTEREST:
                bar = 5;
                break;
        }



        if(foo > bar){
            return true;
        } else {
            return false;
        }

    }




}
