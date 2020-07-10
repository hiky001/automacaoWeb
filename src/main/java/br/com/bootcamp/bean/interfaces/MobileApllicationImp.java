package br.com.bootcamp.bean.interfaces;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public interface MobileApllicationImp {
    //MobileElement para que eu possa trabalhar tanto com android quanto com IOS
    AndroidDriver<AndroidElement> getDriver();
}
