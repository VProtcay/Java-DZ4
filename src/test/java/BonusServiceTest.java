import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shouldCalculateRegisteredAndBonusUnderLimit() {
        BonusService service = new BonusService();
        // подготавливаем данные
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод
        long actual = service.calculate(amount, registered);
        // производим проверку (сравниваем ожидаемый и фактический);
        boolean passed = expected == actual;

        // выводим результат
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateRegisteredAndBonusOverLimit() {
        BonusService service = new BonusService();
        // подготавливаем данные
        long amount = 1000_000_60;
        boolean registered = true;
        long expected = 5000;

        // вызываем целевой метод
        long actual = service.calculate(amount, registered);
        // производим проверку (сравниваем ожидаемый и фактический);
        boolean passed = expected == actual;

        // выводим результат
        assertEquals(expected, actual);

    }
    @Test
    void shouldCalculateNoRegistered() {
        BonusService service = new BonusService();
        // подготавливаем данные
        long amount = 1000_60;
        boolean registered = false;
        long expected = 30;

        // вызываем целевой метод
        long actual = service.calculate(amount, registered);
        // производим проверку (сравниваем ожидаемый и фактический);
        boolean passed = expected == actual;

        // выводим результат
        assertEquals(expected, actual);
    }

}