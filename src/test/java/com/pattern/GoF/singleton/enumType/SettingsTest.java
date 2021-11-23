package com.pattern.GoF.singleton.enumType;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class SettingsTest {
    @Test
    @DisplayName("Enum 으로 안전하게 싱글톤 패턴 구현하기 테스트")
    void enum_singleton_test() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 정상적인 방법으로 생성한 enum class 의 인스턴스
        Settings instance = Settings.INSTANCE;
        Settings instance1 = Settings.INSTANCE;

        // enum class 의 인스턴스는 싱글톤 원리에 의해 같다.
        System.out.println(instance == instance1);

        /**
         * Cannot reflectively create enum objects 발생 함.
         * enum은 내부적으로 reflection을 막아둠.
         *
         * @see Constructor.java:484
         */
        Constructor<?>[] declaredConstructors = Settings.class.getDeclaredConstructors();
        for (Constructor<?> constructors : declaredConstructors){
            constructors.setAccessible(true);
            Settings newInstance = (Settings) constructors.newInstance();
        }
    }
}