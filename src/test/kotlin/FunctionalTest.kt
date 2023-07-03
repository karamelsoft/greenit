import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class FunctionalTest {

    @Test
    fun `pipeline using list operations`() {
        Assertions.assertThat(
            (1..10000000).toList()
                .map { it * 3 }
                .map { it / 7 }
                .sum()
        ).isEqualTo(1560464288)
    }

    @Test
    fun `pipeline using sequence operations`() {
        Assertions.assertThat(
            (1..10000000).asSequence()
                .map { it * 3 }
                .map { it / 7 }
                .sum()
        ).isEqualTo(1560464288)
    }
}
