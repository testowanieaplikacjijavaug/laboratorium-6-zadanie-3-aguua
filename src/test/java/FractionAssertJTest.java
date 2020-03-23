import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class FractionAssertJTest {
    private Fraction fraction;

    @Test
    void test_full(){
        final Fraction f = Fraction.of(1, 1);
        assertThat(f).isEqualTo(Fraction.FULL);
    }
    @Test
    void test_half() {
        final Fraction f = Fraction.of(1, 2);
        assertThat(f).isEqualTo(Fraction.HALF);
    }

    @Test
    void test_one_third() {
        final Fraction f = Fraction.of(1, 3);
        assertThat(f).isEqualTo(Fraction.ONE_THIRD);
    }
}
