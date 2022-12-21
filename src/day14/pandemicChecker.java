package day14;

import java.util.Scanner;

public class pandemicChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the year");
        int year = input.nextInt();

        String pandemic;

        if (year >= 1346 && year <= 1353) {
            pandemic = "the black death";
        } else if (year >= 1665 && year <= 1666) {
            pandemic = "great plague of london";
        } else if (year >= 1770 && year <= 1772) {
            pandemic = "russian plague";
        } else if (year >= 1889 && year <= 1890) {
            pandemic = "flu pandemic";
        } else if (year == 1916) {
            pandemic = "american polio epidemic";
        } else if (year >= 1918 && year <= 1920) {
            pandemic = "spanish flu";
        } else if (year >= 2009 && year <= 2010) {
            pandemic = "H1N1 swine flu pandemic";
        } else if (year >= 2014 && year <= 2016) {
            pandemic = "west africa ebola epidemic";
        } else if (year >= 2020 && year <= 2022) {
            pandemic = "COVID19";
        } else {
           pandemic = "No pandemic";
        }
        System.out.println(pandemic);
    }
}
