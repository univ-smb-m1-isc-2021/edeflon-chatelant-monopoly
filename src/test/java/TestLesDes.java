import org.junit.jupiter.api.Test;

public class TestLesDes {
    @Test
    public void test() {
        LesDes d = new LesDes();
        d.lancerDes();
        assert (1 <= d.getVal1() && d.getVal1() <= 6);
        assert (1 <= d.getVal2() && d.getVal2() <= 6);
    }
}
