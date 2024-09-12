package nl.han.aim.oose.dea;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterList {

    List<String> filterStringsShorterThanThreeCharacters(List<String> input) {
        // TODO: implement
        return input.stream()
                .filter(x -> x.length() < 3)
                .collect(Collectors.toList());
    }


    List<String> filterStringsThatContainOnlyNumerals(List<String> input) {
        // TODO: implement

        return input.stream()
                .filter(x -> x.matches("\\d+"))
                .collect(Collectors.toList());
    }
}
