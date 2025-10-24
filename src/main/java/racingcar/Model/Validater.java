package racingcar.Model;

import racingcar.ErrorMessage;

import java.util.*;

public class Validater {



    public static List<String> nameValidateAndSplit(String rawNameString) throws IllegalAccessException {

        List<String> nameList = splitNames(rawNameString);

        Set<String> set = new HashSet<>();

        for(String name : nameList) {
            if(name.isEmpty()) {
                throw new IllegalAccessException(ErrorMessage.INPUT_BLANK);
            }
            else if(name.length() > 5) {
                throw new IllegalAccessException(ErrorMessage.LENGTH_OVER);
            }
            else if(!set.add(name)) {
                throw new IllegalAccessException(ErrorMessage.DUPLICATE_NAME);
            }
        }
        return nameList;
    };

    private static List<String> splitNames(String rawNameString) {
        List<String> list = Arrays.asList(rawNameString.trim().split(","));
        return list;
    }

    public static void turnNumValidate(Integer turnNum) throws IllegalAccessException {
        if(turnNum < 1) {
            throw new IllegalAccessException(ErrorMessage.NEGATIVE_TURNNUM);
        }
    };






}
