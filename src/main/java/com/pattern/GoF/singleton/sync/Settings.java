package com.pattern.GoF.singleton.sync;

/**
 * synchronized 키워드를 이용한 thread-safe 싱글톤
 * 실습은 테스트에서 확인하실 수 있습니다.
 *
 * @author 전지환
 * @since NOV.22
 */
public class Settings {
    private Settings(){}

    private static Settings instance;

    // thread-safe 하지만, 동기화를 항상 해야한다는 점이 성능상 이슈가 있다.
    public synchronized static Settings getInstance(){
        if (instance == null){
            instance = new Settings();
        }
        return instance;
    }
}
