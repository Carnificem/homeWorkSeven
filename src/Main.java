import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("задача 1");
        int target = 2_459_000;
        int deposit = 15_000;
        int total = 0;
        int mounth = 0;
        double percent=1/100D;
        while (total < target) {
            mounth++;
            total+=total*percent;
            total += deposit;
            System.out.println("месяц " + mounth + " сумма накоплений равна " + total);
        }
        //задача 2
        System.out.println("задача 2");
        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + " ");
        }
        System.out.println();
        {
            for (; a >= 1; a--) {
                System.out.print(a + " ");
            }
            System.out.println();

        }
        //задача 3
        System.out.println("задача 3");
        int people = 12_000_000;
        int born = 17;
        int dead = 8;
        int years = 10;
        for (int year = 1; year <= years; year++) {
            people = people + (born - dead) * people / 1000;
            System.out.println("год " + year + " численность населения составляет " + people);
        }
        //задача 4
        System.out.println("задача 4");
        int targetAccumulation = 12_000_000;
        deposit = 15_000;
        double sum = (int) 0d;
        mounth = 0;
        percent = (int) 7 / 100D;
        while (sum <= targetAccumulation) {
            mounth++;
            sum += sum * percent;
            sum = sum + deposit;
            System.out.printf("месяц %d сумма накоплений = %2f рублей %n", mounth, sum);
        }
        //Задача 5
        System.out.println("задача 5");
        targetAccumulation = 12_000_000;
        deposit = 15_000;
        total = (int) 0d;
        mounth = 0;
        percent = 7 / 100D;
        while (sum <= targetAccumulation) {
            mounth++;
            sum += sum * total;
            sum = sum + deposit;
            if (mounth % 6 == 0) {
                System.out.printf("месяц %d сумма накоплений = %2f рублей %n", mounth, sum);
            }
        }
        //задача 6
        System.out.println("задача 6");
        //sum = deposit;
        mounth = 0;
        int mounths = 9 * 12;
        while (mounth < mounths) {
            mounth++;
            sum += sum * percent;
            sum = sum + deposit;
            if (mounth % 6 == 0) {
                System.out.printf("месяц %d сумма накоплений = %2f рублей %n", mounth, sum);
            }
        }
        //задача 7
        System.out.println("задача 7");
        int friday = 1;
        for (int day = friday; day <= 31; day += 7) {
            System.out.println("сегодня пятница " + day + " число.необходимо подготовить отчет");
        }
        //задача 8
        System.out.println("задача 8");
        int year = 2024;
        int start = year - 200;
        int finish = year + 100;
        int pereodicity = 79;
        for (int i = 0; i <= finish; i += pereodicity) {
            if (i>=start)
                System.out.println(i);
            }
        }
    }

