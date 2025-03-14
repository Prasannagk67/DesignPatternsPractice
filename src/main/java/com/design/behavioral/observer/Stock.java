package com.design.behavioral.observer;

public interface Stock {
    void registerObserver(Investor investor);
    void removeObserver(Investor investor);
    void notifyObserver();
}
