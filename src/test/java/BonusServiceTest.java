import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        // подготавливаем данные:
        int amount = 1000_60;
        boolean registered = true;
        int expected = 30;
        // вызываем целевой метод:
        int actual = service.calculate(amount, registered);
        // производим проверку (сравниваем ожидаемый и фактический):
        // если true — то PASS
        // если false — то FAIL
        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        // подготавливаем данные:
        int amount = 1_000_000_60;
        boolean registered = true;
        int expected = 500;
        // вызываем целевой метод:
        int actual = service.calculate(amount, registered);
        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateForNotRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        // подготавливаем данные:
        int amount = 1_000_000_60;
        boolean registered = false;
        int expected = 500;
        // вызываем целевой метод:
        int actual = service.calculate(amount, registered);
        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);

    }
    @Test
    void shouldCalculateNotRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        // подготавливаем данные:
        int amount = 1000_60;
        boolean registered = false;
        int expected = 10;
        // вызываем целевой метод:
        int actual = service.calculate(amount, registered);
        // производим проверку (сравниваем ожидаемый и фактический):
        // если true — то PASS
        // если false — то FAIL
        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}