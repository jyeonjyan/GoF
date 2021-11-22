package com.pattern.GoF.singleton.sync;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SettingsTest {
    @Test
    @DisplayName("sync 를 이용한 thread-safe 싱글톤")
    void return_same_instance(){
        Settings instance = Settings.getInstance();
        Settings instance1 = Settings.getInstance();

        assertEquals(instance, instance1);
    }
}