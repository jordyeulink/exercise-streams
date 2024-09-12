package nl.han.aim.oose.dea;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFindShortestString {
    String findShortestString(List<String> input) {
        // TODO: implement
        String shortest = input.stream()
                .sorted(Comparator.comparingInt(String::length))
                .findFirst()
                .orElse(null);

        return shortest;
    }
}
