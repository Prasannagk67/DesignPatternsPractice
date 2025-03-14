package com.design.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{
    private final RealInternet realInternet = new RealInternet();
    private final static List<String> bannedSites;
    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("youtube.com");
    }
    @Override
    public void connectTo(String serverHost) throws Exception {
        if (bannedSites.contains(serverHost.toLowerCase())){
            throw new Exception("Access Denied to :"+serverHost);
        }else{
            realInternet.connectTo(serverHost);
        }
    }
}
