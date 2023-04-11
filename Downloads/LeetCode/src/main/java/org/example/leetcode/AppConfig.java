package org.example.leetcode;

public class AppConfig {
    private AppConfig(){

    }
    private static AppConfig obj=new AppConfig();

    public static AppConfig getInstance(){
        return obj;

    }
}
