package racingcar.Service;

import racingcar.ErrorMessage;

import java.util.*;

public class Validator {

    public static List<String> nameValidateAndSplit(String rawNameString) throws IllegalAccessException {

        List<String> nameList = splitNames(rawNameString);

        Set<String> set = new HashSet<>();

        if(rawNameString.trim().endsWith(",")) {
            throw new IllegalAccessException(ErrorMessage.INPUT_BLANK);
        }

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

    public static Integer turnNumValidate(String turnNum) throws IllegalAccessException {
        try {
            int turn = Integer.parseInt(turnNum);

            if (turn < 1) {
                throw new IllegalAccessException(ErrorMessage.NEGATIVE_TURNNUM);
            }
        } catch (NumberFormatException e) {
            throw new IllegalAccessException(ErrorMessage.NEGATIVE_TURNNUM);
        }
    };
}
