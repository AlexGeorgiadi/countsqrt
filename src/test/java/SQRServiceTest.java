import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.countsqrt.services.SQRService;

public class SQRServiceTest {
    @Test
    public void testShouldMatch100_1000() {
        SQRService service = new SQRService();

        int expected = 22;
        int actual = service.calcSqrt(100, 1000);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testShouldMatch200_300() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcSqrt(200, 300);
        Assertions.assertEquals(expected, actual);
    }
}
