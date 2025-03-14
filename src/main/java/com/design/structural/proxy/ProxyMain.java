package com.design.structural.proxy;

public class ProxyMain {
    public static void main(String[] args){
        Internet internet = new ProxyInternet();
        try {
            internet.connectTo("google.com");
            internet.connectTo("youtube.com");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
