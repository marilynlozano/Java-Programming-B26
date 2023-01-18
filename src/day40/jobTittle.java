package day40;

import java.util.ArrayList;
import java.util.Arrays;

public class jobTittle {
    public static void main(String[] args) {
        ArrayList<String> allJobs= new ArrayList<>();
        allJobs.addAll(Arrays.asList("SDET", "DEVELOVER", "po", "ceo", "dev op", "qa", "ba", "chef", "doctor", "police officer", "po"));

        System.out.println(allJobs);

        ArrayList<String> jobs1= new ArrayList<>(allJobs);
        jobs1.removeAll(Arrays.asList("po", "qa", "ba"));
        System.out.println(jobs1);

        ArrayList<String> jobs2 = new ArrayList<>(allJobs);
        jobs2.retainAll(Arrays.asList("SDET", "DEVELOVER", "po", "dev op"));
        System.out.println(jobs2);

        ArrayList<String> jobs3 = new ArrayList<>(allJobs);
        System.out.println(jobs3.containsAll(Arrays.asList("chef", "ceo")));
        System.out.println(jobs3.containsAll(Arrays.asList("doctor", "nurse")));

    }
}
