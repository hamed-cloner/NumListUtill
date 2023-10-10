import java.util.ArrayList;
import java.util.List;

public class NumberUtil {
    public static long division;
    public static Long numberGenerator(long min, long max) {
        long random = (long) Math.floor(Math.random() * (max - min + 1) + min);
        return random;
    }

    public static Long findMax(List<Long> numberList) {

        return numberList.stream().max(Long::compareTo).get();
    }

    public static Long findMin(List<Long> numberList) {
        return numberList.stream().min(Long::compareTo).get();
    }

    public static Long sum(List<Long> numberList) {
        long sum = 0;
        for (int i = 0; i < numberList.size(); i++) {
            sum += numberList.get(i);
        }
        return sum;
    }

    public static List<Long> findOddNumbers(List<Long> numberList) {
        List<Long> oddNumbers = new ArrayList<>();
        for (int i = 0; i < numberList.size(); i++) {
            if (numberList.get(i) % 2 != 0) {
                oddNumbers.add(numberList.get(i));
            }
        }
        return oddNumbers;
    }

    public static List<Long> findDivisionBy(List<Long> numberList, Long division) {
        List<Long> divisionNumbers = new ArrayList<>();
        for (int i = 0; i < numberList.size(); i++) {
            if (numberList.get(i) % division == 0) {
                divisionNumbers.add(numberList.get(i));
            }
        }

        return divisionNumbers;
    }
}
