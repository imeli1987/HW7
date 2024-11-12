import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

//Task 1
        System.out.println("\nЗадача 1\n");
        int salary = 0;
        int monthCount = 0;
        while ( salary <= 2_459_000 ){
            salary += 15_000;
            monthCount++;
            String strSalary = new DecimalFormat("###,###").format(salary);
            System.out.printf("Месяц %d, сумма накоплений равна %s рублей\n", monthCount, strSalary);
        }
//Task 2
        System.out.println("\nЗадача 2\n");
        int i = 1;
        while ( i <= 10 ){
            System.out.print( i + " ");
            i++;
        }
        System.out.println();
        for (int j = 10; j > 0; j--){
            System.out.print( j + " ");
        }
        System.out.println();
//Task 3
        System.out.println("\nЗадача 3\n");
        int populationY = 12_000_000;
        int fertility = 17 * ( populationY / 1000 );
        int fatality = 8 * ( populationY / 1000 );
        int delta = Math.abs( fertility - fatality );
        int count = 0;

        do {
            populationY += delta;
            count++;
            String population = new DecimalFormat("###,###,###").format(populationY);
            System.out.printf("Год %d, численность населения составляет %s\n", count, population);
        } while ( count < 10 );
//Task 4
        System.out.println("\nЗадача 4\n");
        int deposit = 15_000;
        double percentDeposit = 0.07;
        int purposeDeposit = 12_000_000;
        int countMonth = 0;
        while (deposit < purposeDeposit){
            deposit = (int) (deposit + deposit * percentDeposit);
            countMonth++;
            String stringDeposit = new DecimalFormat("###,###").format(deposit);
            System.out.printf("Через %d месяц на счете будет %s рублей\n", countMonth, stringDeposit);
        }
//Task 5
        System.out.println("\nЗадача 5\n");
        deposit = 15_000;
        countMonth = 0;
        int sixMonth = 6;
        while (deposit < purposeDeposit){
            deposit = (int) (deposit + deposit * percentDeposit);
            countMonth++;
            if (countMonth % sixMonth == 0){
                String stringDeposit = new DecimalFormat("###,###").format(deposit);
                System.out.printf("Через %d месяц на счете будет %s рублей\n", countMonth, stringDeposit);
            }
        }
//Task 6
        System.out.println("\nЗадача 6\n");
        int periodYears = 9;
        int periodMonth = periodYears * 12;
        countMonth = 0;
        deposit = 15_000;
        while ( countMonth <= periodMonth ){
            deposit = (int) (deposit + deposit * percentDeposit);
            countMonth++;
            if (countMonth % sixMonth == 0){
                String stringDeposit = new DecimalFormat("###,###").format(deposit);
                System.out.printf("Через %d месяц на счете будет %s рублей\n", countMonth, stringDeposit);
            }
        }
//Task 7
        System.out.println("\nЗадача 7\n");
        int friday = 7;
        int monthDay = 31;
        count = 0;
        while (count <= 31){

            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет\n", friday);
            friday += 7;
            count += 7;
            if (friday > monthDay){
                break;
            }
        }
//Task 8
        System.out.println("\nЗадача 8\n");
        int cometPeriod = 79;
        int nowYear = 2024;
        int yearMinus200 = nowYear - 200;
        int yearPlus100 = nowYear + 100;
        int startYear = 0;
        while ( startYear < yearPlus100 ){
            if ( startYear > yearMinus200 ){
                System.out.println(startYear);
            }
            startYear += cometPeriod;
        }



    }
}