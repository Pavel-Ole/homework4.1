public class BonusService {
    public long calculate(long amount, boolean registered) {

        // подготавливаем формулы и данные:
        int percent = registered ? 3 : 1;
        long bonus = amount * percent / 100;
        long limit = 500;

        // делаем ограничение максимального бонуса:
        if (bonus > limit) {
            bonus = limit;
        }

        // возвращаем полученные бонусы:
        return bonus;
    }
}
