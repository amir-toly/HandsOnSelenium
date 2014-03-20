package org.duchess.selenium;


public class Util {
    public final static String getPath() {
        String currentDir = System.getProperty("user.dir");
        System.out.println("Current dir using System:" + currentDir);
        return "file://" + currentDir + "/website-test/";
    }

    public final static String getHome(){
        return Util.getPath() + "index.html";
    }

    public final static String getContact(){
        return Util.getPath() + "contact.html";
    }

    public final static String getPortfolio(){
        return Util.getPath() + "portfolio.html";
    }

    public final static String getFeatures(){
        return Util.getPath() + "features.html";
    }

}
