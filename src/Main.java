public class Main {
    public static void main(String[] args) {
//        task1
        int total = 0;
        int cash = 15000;
        int i = 0;
        while (total < 459000) {
            total = total + cash;
            i++;
        }
        System.out.println("Месяц " + i + " , сумма накоплений равна " + total + "… рублей");
//        task2
        i = 1;
        while (i < 11) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        i--;
        for (; i >= 1; ) {
            System.out.print(i + " ");
            i--;
        }
//        task3
        System.out.println();
        int totalMen = 12_000_000;
        int birthMen = 17;
        int deathMen = 8;
        for (int j = 1; j <= 10; j++) {
            totalMen = totalMen + totalMen / 1000 * birthMen - totalMen / 1000 * deathMen;
            System.out.println("Год " + j + " , численность населения составляет " + totalMen);
        }
//        task2.1
        double money = 15000;
        int month = 0;
        while (money < 12_000_000) {
            money = money + money * 0.07;
            month++;
            System.out.println(money);
        }
        System.out.println(month + " месяцев понадобится, чтобы накопить");
//        task2.2
        double money1 = 15000;
        int month1 = 0;
        while (money1 < 12_000_000) {
            money1 = money1 + money1 * 0.07;
            month1++;
            if (month1 % 6 == 0) {
                System.out.println(money1);
            }
        }
        System.out.println(month1 + " месяцев понадобится, чтобы накопить");
//        task2.3
        double money2 = 15000;
        int month2 = 0;
        while (month2 <= 12 * 9) {
            money2 = money2 + money2 * 0.07;
            month2++;
            if (month2 % 6 == 0) {
                System.out.println(money2);
            }
        }
//        task2.4
        int numberFriday = 1;
        while (numberFriday <= 31) {
            System.out.println("Сегодня пятница, " + numberFriday + "-е число. Необходимо подготовить отчет.");
            numberFriday = numberFriday + 7;
        }
//        task3.1
        int currentYear = 2022;
        int startPeriod = currentYear - 200;
        int endPeriod = currentYear + 100;
        for (int k = startPeriod; k < endPeriod; k++) {
            if (k % 79 == 0) {
                System.out.println(k);
            }
        }
//        task3.2
        for (int j = 1; j <= 10; j++) {
            System.out.println("2*" + j + "=" + 2 * j);
        }
    }
}