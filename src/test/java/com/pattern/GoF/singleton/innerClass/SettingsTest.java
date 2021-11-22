package com.pattern.GoF.singleton.innerClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * inner static class를 통한 thread-safe 싱글톤 패턴 실행 클래스 입니다.
 *
 * @author 전지환
 * @since NOV 22
 */
class SettingsTest {
    @Test
    @DisplayName("static inner class 를 이용한 thread-safe 싱글톤")
    void return_same_instance(){
        Settings settings = Settings.getInstance();
        Settings settings_2 = Settings.getInstance();

        assertEquals(settings, settings_2);
    }
}