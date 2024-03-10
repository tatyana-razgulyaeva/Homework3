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

        byte equipmentPerformanceIn2Minutes = 16;
        short equipmentPerformanceIn20Minutes = (short) (equipmentPerformanceIn2Minutes * 10);
        short equipmentPerformanceIn1Hours = (short) (equipmentPerformanceIn20Minutes *3);
        short equipmentPerformancePerDay = (short) (equipmentPerformanceIn1Hours * 24);
        int equipmentPerformanceIn3Days = (equipmentPerformancePerDay * 3);
        int equipmentPerformanceFor1Month = (equipmentPerformanceIn3Days *10);
        System.out.println("За 20 минут машина произвела " + equipmentPerformanceIn20Minutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + equipmentPerformancePerDay + " штук бутылок");
        System.out.println("За три дня машина произвела " + equipmentPerformanceIn3Days + " штук бутылок");
        System.out.println("За один месяц машина произвела " + equipmentPerformanceFor1Month + " штук бутылок");

        byte totalCansOfPaint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        byte numberOfClasses = (byte) (totalCansOfPaint / (whitePaint + brownPaint));
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + numberOfClasses * whitePaint + " банок белой краски и " + numberOfClasses * brownPaint + " банок коричневой краски");

        byte banana = 80;
        byte milk = 105;
        byte iceCream = 100;
        byte egg = 70;
        short breakfast = (short) (5 * banana + 2 * milk + 2 * iceCream + 4 * egg);
        System.out.println("Вес спортзавтрака " + breakfast + " грамм");
        System.out.println("Вес спортзавтрака " + breakfast / 1000.0 + " килограмм");

        byte numberOfKilograms = 7;
        float firstRation = 0.25f;
        float secondRation = 0.5f;
        System.out.println("Если спортсмен будет терять в день по 250 гр, то он снизит свой вес на 7 кг через " + (byte) (numberOfKilograms / firstRation) + " дней");
        System.out.println("Если спортсмен будет терять в день по 500 гр, то он снизит свой вес на 7 кг через " + (byte) (numberOfKilograms / secondRation) + " дней");
        System.out.println("Для снижения веса на 7 кг спортсмену в среднем потребуется " + (byte) (numberOfKilograms / firstRation + numberOfKilograms / secondRation) / 2 + " день");

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int annualIncomeMasha = salaryMasha * 12;
        int annualIncomeDenis = salaryDenis * 12;
        int annualIncomeKristina = salaryKristina * 12;
        int salaryIndexationMasha = (int) (salaryMasha * 1.1);
        int salaryIndexationDenis = (int) (salaryDenis * 1.1);
        int salaryIndexationKristina = (int) (salaryKristina * 1.1);
        int incomeIndexationMasha = (int) (annualIncomeMasha * 1.1);
        int incomeIndexationDenis = (int) (annualIncomeDenis * 1.1);
        int incomeIndexationKristina = (int) (annualIncomeKristina * 1.1);
        System.out.println("Маша теперь получает " + incomeIndexationMasha + " рублей. Годовой доход вырос на " + (incomeIndexationMasha - annualIncomeMasha) + " рублей");
        System.out.println("Денис теперь получает " + incomeIndexationDenis + " рублей. Годовой доход вырос на " + (incomeIndexationDenis - annualIncomeDenis) + " рублей");
        System.out.println("Кристина теперь получает " + incomeIndexationKristina + " рублей. Годовой доход вырос на " + (incomeIndexationKristina - annualIncomeKristina) + " рублей");
    }
}