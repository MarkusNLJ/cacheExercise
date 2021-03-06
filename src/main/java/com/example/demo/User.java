package com.example.demo;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.concurrent.TimeUnit;

public class User {
    private int id;

    public User(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    // simulates a slow call
    public String getDataSlow() throws InterruptedException {
        TimeUnit.SECONDS.sleep(10);
        String generatedString = RandomStringUtils.randomAlphabetic(1000);

        return generatedString;
    }
}
