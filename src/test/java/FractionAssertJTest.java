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

    @Test
    void test_hash_Code() {
        final Fraction f = Fraction.of(2, 3);
        assertThat(f.hashCode()).isEqualTo(5);
    }

    @Test
    void test_to_string() {
        final Fraction f = Fraction.of(6, 13);
        assertThat(f.toString()).isInstanceOf(String.class).contains("6/13");
    }

    @Test
    void test_equal() {
        final Fraction f = Fraction.of(1, 3);
        final Fraction f2 = Fraction.of(1, 3);
        assertThat(f.equals(f2)).isTrue();
    }
    @Test
    void test_not_equal() {
        final Fraction f = Fraction.of(1, 3);
        final Fraction f2 = Fraction.of(2, 3);
        assertThat(f.equals(f2)).isFalse();
    }

    @Test
    void test_get_nominator() {
        final Fraction f = Fraction.of(1, 3);
        assertThat(f.getNominator()).isEqualTo(1);
    }

    @Test
    void test_get_denominator() {
        final Fraction f = Fraction.of(1, 3);
        assertThat(f.getDenominator()).isEqualTo(3);
    }


    @Test
    public void test_zero_in_denominator_exception() {
        assertThatThrownBy(() -> {Fraction.of(1, 0);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
