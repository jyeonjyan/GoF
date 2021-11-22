package com.pattern.GoF.singleton.crashSingleton;

import com.pattern.GoF.singleton.innerClass.Settings;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

public class SettingsTest2 {
    @Test
    @DisplayName("역직렬화를 통해 싱글톤 패턴을 깨뜨리는 방법")
    void crash_singleton() throws IOException, ClassNotFoundException{
        Settings instance = Settings.getInstance();
        Settings newInstance;

        try (ObjectOutput output = new ObjectOutputStream(new FileOutputStream("settings.obj"))){
            output.writeObject(instance);
        }
        try (ObjectInput input = new ObjectInputStream(new FileInputStream("settings.obj"))){
            newInstance = (Settings) input.readObject();
        }

        System.out.println("old: " + instance);
        System.out.println("new: " + newInstance);

        assertNotEquals(instance, newInstance);
    }
}
