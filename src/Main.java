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
        byte time1 = 10;
        byte time2 = 3;
        byte time3 = 24;
        short equipmentPerformanceIn20Minutes = (short) (equipmentPerformanceIn2Minutes * time1);
        short equipmentPerformanceIn1Hours = (short) (equipmentPerformanceIn20Minutes * time2);
        short equipmentPerformancePerDay = (short) (equipmentPerformanceIn1Hours * time3);
        int equipmentPerformanceIn3Days = (equipmentPerformancePerDay * time2);
        int equipmentPerformanceFor1Month = (equipmentPerformanceIn3Days * time1);
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
        int months = 12;
        float percents = 1.1f;
        int annualIncomeMasha = salaryMasha * months;
        int annualIncomeDenis = salaryDenis * months;
        int annualIncomeKristina = salaryKristina * months;
        int salaryIndexationMasha = (int) (salaryMasha * percents);
        int salaryIndexationDenis = (int) (salaryDenis * percents);
        int salaryIndexationKristina = (int) (salaryKristina * percents);
        int incomeIndexationMasha = (int) (annualIncomeMasha * percents);
        int incomeIndexationDenis = (int) (annualIncomeDenis * percents);
        int incomeIndexationKristina = (int) (annualIncomeKristina * percents);
        System.out.println("Маша теперь получает " + incomeIndexationMasha + " рублей. Годовой доход вырос на " + (incomeIndexationMasha - annualIncomeMasha) + " рублей");
        System.out.println("Денис теперь получает " + incomeIndexationDenis + " рублей. Годовой доход вырос на " + (incomeIndexationDenis - annualIncomeDenis) + " рублей");
        System.out.println("Кристина теперь получает " + incomeIndexationKristina + " рублей. Годовой доход вырос на " + (incomeIndexationKristina - annualIncomeKristina) + " рублей");
    }
}