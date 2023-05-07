package br.com.challenge;

import java.util.*;
import java.util.stream.Collectors;

public class ChallengeTest {
    private static String phrase = "Hello: hello my fellow candidate.";

    public static void main(String args[]) throws Exception {
        String[] strArr = phrase.split(" ");
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(strArr));

        List<String> editedList;
        editedList = list.stream()
                .map(String::toLowerCase)
                .map(s -> s.replaceAll("\\W", ""))
                .collect(Collectors.toList());

        String firstWord = editedList.get(0);

        Set set = new HashSet<>(editedList);
        if (set.size()==editedList.size()) {
            throw new Exception("There are no duplicate values");
        } else {
            System.out.println(firstWord);
        }

    }
}
