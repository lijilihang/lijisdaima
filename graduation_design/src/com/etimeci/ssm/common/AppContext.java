package com.etimeci.ssm.common;

import java.util.HashMap;
import java.util.Map;

import com.etimeci.ssm.entity.UserMessage;

public class AppContext {
    private static ThreadLocal<AppContext> appContextMap = new ThreadLocal<AppContext>();

    private Map<String, Object> objects = new HashMap<String, Object>();
    private static String contextPath;

    public static String getContextPath() {
        return contextPath;
    }

    public static void setContextPath(String contextPath) {
        if (AppContext.contextPath == null) {
            AppContext.contextPath = contextPath;
        }
    }

    public static ThreadLocal<AppContext> getAppContextMap() {
        return appContextMap;
    }

    public static void setAppContextMap(ThreadLocal<AppContext> appContextMap) {
        AppContext.appContextMap = appContextMap;
    }

    private AppContext() {

    }

    public static AppContext getAppContext() {
        AppContext appContext = appContextMap.get();

        if (appContext == null) {
            appContext = new AppContext();
            appContextMap.set(appContext);
        }

        return appContextMap.get();
    }

    public void addObject(String key, Object object) {
        this.objects.put(key, object);
    }

    public Object getObject(String key) {
        return objects.get(key);
    }

    public void clear() {
        objects.clear();
    }

    public void removeObject(String key) {
        objects.remove(key);
    }

    public UserMessage getUser() {
        return (UserMessage) objects.get("APP_CONTEXT_USER");
    }

    public String getUserName() {
        UserMessage user = (UserMessage) objects.get("APP_CONTEXT_USER");

        if (user != null) {
            return user.getUmName();
        }

        return "";
    }

    public int getUserId() {
        UserMessage user = (UserMessage) objects.get("APP_CONTEXT_USER");

        if (user != null) {
            return user.getUmId();
        }

        return 0;
    }
}