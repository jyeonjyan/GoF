package com.pattern.GoF.singleton.crashSingleton;

import com.pattern.GoF.singleton.innerClass.Settings;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

public class SettingsTest {
    @Test
    @DisplayName("리플랙션을 통해 싱글톤 패턴을 깨트리는 방법")
    void crash_singleton() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 정상적인 방법으로 얻어낸 instance
        Settings instance = Settings.getInstance();

        // reflection 을 이용한 thread crash
        Constructor<Settings> declaredConstructor = Settings.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Settings newInstance = declaredConstructor.newInstance();

        System.out.println("old: " + instance);
        System.out.println("new: " + newInstance);

        assertNotEquals(instance, newInstance);
    }
}
