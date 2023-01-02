package steps;

import pages.AmazonMainPage;
import pages.TelevisionPage;

public class PageInitializer {
    public static AmazonMainPage main;
    public static TelevisionPage TV;
    public static void initializePageObjects(){
        main = new AmazonMainPage();
        TV = new TelevisionPage();
    }

}