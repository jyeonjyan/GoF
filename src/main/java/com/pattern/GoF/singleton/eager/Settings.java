package com.pattern.GoF.singleton.eager;

/**
 * Eager(이른) 초기화 기법을 사용하여 thread-safe 싱글톤 구현
 * 실습은 테스트에서 확인하실 수 있습니다.
 *
 * @author 전지환
 * @since NOV.22
 */
public class Settings {
    private Settings(){}

    private static final Settings INSTANCE = new Settings();

    public static Settings getInstance(){
        return INSTANCE;
    }
}
