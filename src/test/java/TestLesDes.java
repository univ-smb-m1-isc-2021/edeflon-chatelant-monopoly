import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestLesDes {
    @Test
    void test() {
        LesDes d = new LesDes();
        d.lancerDes();
        Assertions.assertTrue(1 <= d.getVal1() && d.getVal1() <= 6);
        Assertions.assertTrue(1 <= d.getVal2() && d.getVal2() <= 6);
    }
}
