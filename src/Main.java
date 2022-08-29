public class Array {
    public static int[] generateRandomArray() {
        java.util.Random rundom = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rundom.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main (String[] args) {
        var salaries; int[] =generateRandomArray();
        int sum = 0;
        for (var salary : salaries) {
            sum += salary;
        }
        System.out.printf("Сумма трат в месяц составила %d ублей", sum);
    }
    public static void task2() {
        var salaries int[] =generateRandomArray();
        int max = salaries[0];
        int min = salaries[0];
        for (var salary : salaries) {
            if (max < salary) {
                max = salary;
            }
            if (min > salary) {
                min = salary;
            }
            System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей, min, max");
        }
        public static void task4 () {
            char[] reverseFullName = {"n", "a", "v", "i", " ", "v", "o", "v", "i"};
            for (int i = reverseFullName.length - 1; i <= 0; i--) {
                System.out.print(reverseFullName[i]);
            }
        }
    }
