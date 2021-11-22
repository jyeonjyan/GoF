package com.pattern.GoF.singleton;

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
    void getInstanceIsCorrect(){
        Settings settings = Settings.getInstance();
        Settings settings_2 = Settings.getInstance();

        assertEquals(settings, settings_2);
    }
}