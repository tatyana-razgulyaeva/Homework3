public class Main {
    public static void main(String[] args) {

        byte a = 127;
        short b = -32768;
        int c = 2147483647;
        long d = -9223372036854775808L;
        float e = 1.1234567f;
        double f = 1.1234567891234567;
        System.out.println("Значение переменной «a» с типом byte равно " + a);
        System.out.println("Значение переменной «b» с типом short равно " + b);
        System.out.println("Значение переменной «c» с типом int равно " + c);
        System.out.println("Значение переменной «d» с типом long равно " + d);
        System.out.println("Значение переменной «e» с типом float равно " + e);
        System.out.println("Значение переменной «f» с типом double равно " + f);

        float q = 27.12f;
        long w = 987678965549L;
        float o = 2.786f;
        short r = 569;
        short t = -159;
        short y = 27897;
        byte u = 67;
        System.out.println(q);
        System.out.println(w);
        System.out.println(o);
        System.out.println(r);
        System.out.println(t);
        System.out.println(y);
        System.out.println(u);

        byte studentsOfTheFirstTeacher = 23;
        byte studentsOfTheSecondTeacher = 27;
        byte studentsOfTheThirdTeacher = 30;
        short totalSheets = 480;
        System.out.println("На каждого ученика рассчитано " + totalSheets / (studentsOfTheFirstTeacher + studentsOfTheSecondTeacher + studentsOfTheThirdTeacher) + " листов бумаги");

        byte equipmentPerformancePerMinute = 8;
        System.out.println("За 20 минут машина произвела " + equipmentPerformancePerMinute * 20 + " штук бутылок");
        System.out.println("За сутки машина произвела " + equipmentPerformancePerMinute * 1440 + " штук бутылок");
        System.out.println("За три дня машина произвела " + equipmentPerformancePerMinute * 4320 + " штук бутылок");
        System.out.println("За один месяц машина произвела " + equipmentPerformancePerMinute * 44640 + " штук бутылок");

        byte totalCansOfPaint = 120;
        byte whitePaint = 2;
        byte brownPaint = (byte) (whitePaint * 2);
        System.out.println("В школе, где " + totalCansOfPaint / (whitePaint + brownPaint) + " классов, нужно " + (totalCansOfPaint / (whitePaint + brownPaint)) * whitePaint + " банок белой краски и " + (totalCansOfPaint / (whitePaint + brownPaint)) * brownPaint + " банок коричневой краски");

        byte banana = 80;
        byte milk = 105;
        byte iceCream = 100;
        byte egg = 70;
        System.out.println("Вес спортзавтрака " + (5 * banana + 2 * milk + 2 * iceCream + 4 * egg) + " грамм");
        System.out.println("Вес спортзавтрака " + (float) (5 * banana + 2 * milk + 2 * iceCream + 4 * egg) / 1000 + " килограмм");

        System.out.println("Если спортсмен будет терять в день по 250 гр, то он снизит свой вес на 7 кг через " + 7000 / 250 + " дней");
        System.out.println("Если спортсмен будет терять в день по 500 гр, то он снизит свой вес на 7 кг через " + 7000 / 500 + " дней");
        System.out.println("Для снижения веса на 7 кг спортсмену в среднем потребуется " + (7000 / 250 + 7000 / 500) / 2 + " день");

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        System.out.println("Маша теперь получает " + (int) (salaryMasha * 1.1) + " рублей. Годовой доход вырос на " + (int) (salaryMasha * 1.1 * 12 - salaryMasha * 12) + " рублей");
        System.out.println("Денис теперь получает " + (int) (salaryDenis * 1.1) + " рублей. Годовой доход вырос на " + (int) (salaryDenis * 1.1 * 12 - salaryDenis * 12) + " рублей");
        System.out.println("Кристина теперь получает " + (int) (salaryKristina * 1.1) + " рублей. Годовой доход вырос на " + (int) (salaryKristina * 1.1 * 12 - salaryKristina * 12) + " рублей");
    }
}