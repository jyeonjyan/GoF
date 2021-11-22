package com.pattern.GoF.singleton;

/**
 * Double checked locking 을 통한 thread-safe 싱글톤 패턴.
 * 실습은 테스트에서 확인하실 수 있습니다.
 *
 * @author 전지환
 * @since NOV.22
 */
public class Settings {
    private static Settings instance;

    // Private 생성자
    private Settings(){}

    // instance 가 없을 때만 new 로 생성.
    public static Settings getInstance(){
        if (instance == null){
            instance = new Settings();
        }
        return instance;
    }
}
