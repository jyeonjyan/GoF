package com.pattern.GoF.singleton.innerClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * inner static class를 통한 thread-safe 싱글톤 패턴 실행 클래스 입니다.
 *
 * @author 전지환
 * @since NOV 22
 */
class ConfigTest {
    @Test
    void config_return_same_instance(){
        Config config = Config.getInstance();
        Config config_2 = Config.getInstance();

        assertEquals(config, config_2);
    }
}