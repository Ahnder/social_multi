package microservices.book.multiplication.domain;

import lombok.EqualsAndHashCode;       // 모든 상수 필드를 갖는 생성자를 만든다
import lombok.Getter;                  // 모든 필드의 Getter를 만든다
import lombok.RequiredArgsConstructor; // equals()와 hashcode() 메서드를 만든다
import lombok.ToString;                // 해당 클래스의 toString() 메서드를 읽기 쉽게 만든다

// 애플리케이션에서 곱셈을 나타내는 클래스
@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public final class Multiplication {

    // 인수
    private final int factorA;
    private final int factorB;

    // JSON (역)직렬화를 위한 빈 생성자
    Multiplication() {
        this(0, 0);
    }
}
