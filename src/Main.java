import java.util.*;

import static java.util.Collections.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Long> numbers = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            numbers.add(NumberUtil.numberGenerator(0,10000));
        }
        System.out.println("Hello :)\nyour generated list is: " + numbers);

        Long max = NumberUtil.findMax(numbers);
        System.out.println("\nit's Maximum number is = " + max);

        Long min = NumberUtil.findMin(numbers);
        System.out.println("\nit's Minimum number is = " + min);

        Long sum = NumberUtil.sum(numbers);
        System.out.println("\nSum of all indexes is = " + sum);

        List<Long> oddnumber = NumberUtil.findOddNumbers(numbers);
        System.out.println("\nThe list of odd numbers is = "+ oddnumber);

        System.out.print("\nenter the number you want to see divisions of list:");
        NumberUtil.division = scanner.nextLong();

        List<Long> divisions = NumberUtil.findDivisionBy(numbers, NumberUtil.division);
        System.out.println("\nThe list of numbers devided by " + NumberUtil.division +" is = "+ divisions);

        Collections.sort(numbers);
        System.out.println("\nand the sorted list will be = " + numbers);
    }
}