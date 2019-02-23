package itparck.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackServiceTest {

    @Test
    void calculateUnderLimit() {
        CashbackService service = new CashbackService();
        int cashback = service.calculate(1_000);
        assertEquals(50, cashback);
    }
    @Test
    void calculateOverLimit() {
        CashbackService service = new CashbackService();
        int cashback = service.calculate(1_000_000);
        assertEquals(3_000, cashback);
    }
}