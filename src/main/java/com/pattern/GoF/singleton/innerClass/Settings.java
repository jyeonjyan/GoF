package com.pattern.GoF.singleton.innerClass;

/**
 * innerclass 를 통해 thread-safe 한 싱글톤 패턴 구현하기
 * 실행은 테스트코드를 참고해주세요.
 *
 * @author 전지환
 * @since NOV.22
 */
public class Settings {
    // private 생성자
    private Settings(){}

    // static inner 클래스를 만들어 thread-safe 권장 방법
    public static class ConfigHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance(){
        return ConfigHolder.INSTANCE;
    }
}
