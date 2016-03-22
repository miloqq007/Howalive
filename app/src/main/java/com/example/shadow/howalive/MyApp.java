package com.example.shadow.howalive;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Shadow on 2016/3/14.
 */
public class MyApp extends Application {
    private List<Activity> mList = new LinkedList<Activity>();
    private static MyApp instance;
    private String user;

    public MyApp() {
    }
    @Override
    public void onCreate()
    {
        super.onCreate();
    }
    @Override

    public void onTerminate() {

        super.onTerminate();

    }

    public synchronized static MyApp getInstance(){
        if(null == instance){
            instance = new MyApp();
        }
        return instance;
    }
    public void addActivity(Activity activity){
        mList.add(activity);
    }
    public void exit(){
        try {
            for(Activity activity : mList) {
                if(activity != null) activity.finish();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        } finally {
            System.exit(0);
        }
    }
    public void setUser(String s){
        user = s;
    }
    public String getUser() {
        return user;
    }
    @Override
    public void onLowMemory() {
        super.onLowMemory();
        System.gc();
    }
}
