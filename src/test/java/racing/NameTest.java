package racing;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NameTest {

    @DisplayName(value = "자동차 이름이 5자를 초과하면 예외")
    @Test
    void validateNameLength() {
        // when
        Assertions.assertThatThrownBy(() -> {
            new Name("이브라히모비");
            // then
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName(value = "자동차 이름이 공란이면 예외")
    @Test
    void validateNameEmpty() {
        // when
        Assertions.assertThatThrownBy(() -> {
            new Name(" ");
            // then
        }).isInstanceOf(IllegalArgumentException.class);
    }
}