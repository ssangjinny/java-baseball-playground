package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }
    @Test
    void split_test() {
        String[] splitTestString = "1,2".split(",");
        assertThat(splitTestString).contains("1", "2");
        assertThat(splitTestString).containsExactly("1", "2");
    }

    @Test
    void substring_test() {
        String substringTestString = "(1,2)";
        assertThat(substringTestString.substring(1, 4)).isEqualTo("1,2");
    }

    @Test
    @DisplayName("IndexOutOfRange")
    void charat_test() {
        String charatTestString = "abc";
        assertThatThrownBy(() -> assertThat(charatTestString.charAt(4)).isEqualTo('b'))
                .isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range: 4");
    }
}
