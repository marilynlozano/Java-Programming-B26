package day41;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class switchPairs {

     /*
    Given an ArrayList of words switch position for
    each pair in the List. A pair is an element and
    the element next to it.
    The given ArrayList will always have an even
    number of elements so each element will
    always have a single pair

    Ex:
    Input: {"Cat", "in", "the", "hat"}
    There is two pairs:
    "Cat" and "in"
    "the" and "hat"
    Output: {"in", "Cat", "hat",
    "the”}
     */


    public static void main(String[] args) {

            ArrayList<String> arrayWords = new ArrayList<>(Arrays.asList("Cat", "in", "the", "hat"));{
                System.out.println(swapingPairs(arrayWords));
            }
        }

        public static ArrayList<String> swapingPairs(ArrayList<String> words) {

                for (int i = 0; i < words.size(); i += 2) {
                    String temp = words.get(i);
                    words.set(i, words.get(i + 1));
                    words.set(i + 1, temp);
                };
                return words;

            }
        }


