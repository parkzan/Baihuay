package com.example.parkzan.randomnuber.model;

import java.util.Random;

/**
 * Created by ParkZan on 10/22/2016.
 */

public class Huay {
    Random r = new Random();
    private int randomtry_2;
    private int randomtry_3;

    public String getRandomTwoDigits(){
       randomtry_2 = r.nextInt(100);
        if(randomtry_2<10){
            return "0"+randomtry_2;
        }
        return randomtry_2+"";
    }
    public String getRandomThreeDigits(){
        randomtry_3 = r.nextInt(1000);
        if(randomtry_3<10){
            return "00"+randomtry_3;
        }else if(randomtry_3<100){
            return  "0"+randomtry_3;
        }
        return randomtry_3+"";
    }
}
