package com.pattern.GoF.singleton.doubleCheck;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 실습에 대한 결과는 여기서 확인하실 수 있습니다.
 *
 * @author 전지환
 * @since 2021.11.22
 */
class SettingsTest {
    @Test
    @DisplayName("Double checked locking 을 통한 thread-safe 싱글톤")
    void return_same_instance(){
        Settings instance = Settings.getInstance();
        Settings instance1 = Settings.getInstance();

        assertEquals(instance, instance1);
    }
}