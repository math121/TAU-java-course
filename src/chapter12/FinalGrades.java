package chapter12;

import java.util.HashMap;
import java.util.Map;

public class FinalGrades {

    public static Map compareAndGetFinalGrades(Map<String, Integer>  originalGrades, Map<String, Integer>  makeUpGrades) {
        Map finalGrades = new HashMap();
        originalGrades.forEach((name, original) -> {
            int makeUpGrade = makeUpGrades.get(name);
            if (original < makeUpGrade) {
                finalGrades.put(name, makeUpGrade);
            } else {
                finalGrades.put(name, original);
            }
        });

        return finalGrades;
    }

    public static void main(String[] args) {
        Map<String, Integer> originalGrades = TestResults.getOriginalGrades();
        Map<String, Integer> makeUpGrades = TestResults.getMakeUpGrades();

        Map finalGrades = compareAndGetFinalGrades(originalGrades, makeUpGrades);

        System.out.println("Final Grades:");
        finalGrades.forEach((k, v) -> System.out.println(k + " = " + v));
    }
}
