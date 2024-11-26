public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int [] expenses = {500, 2000, 600, 1500, 800};
        int sum = 0;
        int sum1 = 0;

        for (int i = 0; i < expenses.length; i++) {
            sum += expenses[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        for (int element : expenses) {
            sum1 += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum1 + " рублей");
        System.out.println();

        System.out.println("Задача 2");
        int maxExpenses = -1;
        int minExpenses = expenses[0];

        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] > maxExpenses) {
                maxExpenses = expenses[i];
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + maxExpenses + " рублей");

        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] < minExpenses) {
                minExpenses = expenses[i];
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + minExpenses + " рублей");
        System.out.println();

        System.out.println("Задача 3");
        int sum3 = 0;
        for (int i = 0; i < expenses.length; i++) {
            sum3 += expenses[i];
        }
        float averageExpenses = sum3/expenses.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageExpenses + " рублей");
        System.out.println();

        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = 10; i >=0; i--) {
            System.out.print(reverseFullName[i]);
        }


    }
}