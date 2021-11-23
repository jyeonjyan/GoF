package com.pattern.GoF.singleton.enumType;

/**
 * Enum 을 통해 안전하게 싱글톤 구현하기
 * 실행은 테스트코드를 참고하세요.
 *
 * @author 전지환
 * @since NOV 23
 */
public enum Settings {
    INSTANCE;

    // default 가 private
    Settings() {
    }
}
