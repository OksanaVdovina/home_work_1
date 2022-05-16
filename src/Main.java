public class Main {
    public static void main(String[] args) {
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4L;
        float e = 5f;
        double f = 69.75;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);

        float weightA = 78.2f;
        float weightB = 82.7f;
        float weightSum = weightA + weightB;
        System.out.println("общий вес двух бойцов = " + weightSum);
        float weightSubtraction = weightB - weightA;
        System.out.println("Разница между весами бойцов = " + weightSubtraction);

        int bananas = 80;
        bananas *= 5;
        int milk = 105;
        milk *= 2;
        int icecream = 100;
        icecream *= 2;
        int eggs = 70;
        eggs *= 4;
        int breakfast = bananas + milk + eggs + icecream;
        System.out.println("Вес спорт-завтрака равен " + breakfast + " гр");
        float breakfastKg = breakfast / 1000f;
        System.out.println("Вес спорт-завтрака в кг равен " + breakfastKg + " кг");

        int goal = 7000;
        int loseWeight1 = 250;
        int loseWeight2 = 500;
        int daysToGoal1 = goal / loseWeight1;
        int daysToGoal2 = goal / loseWeight2;
        System.out.println("Количество дней на похудение при потере веса 250 гр в день равно " + daysToGoal1);
        System.out.println("Количество дней на похудение при потере веса 500 гр в день равно " + daysToGoal2);
        int daysToGoal3 = (daysToGoal1 + daysToGoal2) / 2;
        System.out.println("Среднее количество дней на похудение равно " + daysToGoal3);

        float paymentMasha = 67_760f;
        float paymentDenis = 83_690f;
        float paymentKristina = 76_230f;
        float newPaymentMasha = paymentMasha * 1.1f;
        float newPaymentDenis = paymentDenis * 1.1f;
        float newPaymentKristina = paymentKristina * 1.1f;
        float riseInYearPaymentMasha = paymentMasha * 0.1f * 12f;
        float riseInYearPaymentDenis = paymentDenis * 0.1f * 12f;
        float riseInYearPaymentKristina = paymentKristina * 0.1f * 12f;
        System.out.println("Маша теперь получает " + newPaymentMasha + " рублей. А годовой доход увеличился на " + riseInYearPaymentMasha + " рублей");
        System.out.println("Маша теперь получает " + newPaymentDenis + " рублей. А годовой доход увеличился на " + riseInYearPaymentDenis + " рублей");
        System.out.println("Маша теперь получает " + newPaymentKristina + " рублей. А годовой доход увеличился на " + riseInYearPaymentKristina + " рублей");

    }
}