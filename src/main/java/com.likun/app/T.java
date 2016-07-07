package com.likun.app;

import java.util.Random;

/**
 * Created by shuyun on 2016/7/5.
 */
public class T {
    public static void main(String [] args){
        int randowm = new Random().nextInt(9999);
        System.out.println(randowm);
        String code = (randowm + "0000").substring(0, 4);
        System.out.println(code);

    }
}
