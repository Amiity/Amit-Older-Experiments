package com.copra.InterviewCoding.StringsQuestions;

import java.util.Arrays;

public class FindLongestPrefix {

    public static void main(String[] args) {

        String[] strArr = {"clap", "claty", "clant", "clam"};

        //Will sort first
        Arrays.sort(strArr);

        System.out.println(Arrays.toString(strArr));

        char[] first = strArr[0].toCharArray();
        char[] second = strArr[strArr.length - 1].toCharArray();

        StringBuilder stringBuilder = new StringBuilder();
        String s = "";

        int minLength = Math.min(first.length, second.length);

        for (int i = 0; i < minLength; i++) {

            if (first[i] != second[i]) {
                break;
            } else {
                stringBuilder.append(first[i]);
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
