package nl.han.aim.oose.dea;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsCreateFullSentence {
    String createAFullSentenceFromTheList(List<String> input) {
        // TODO: implement
        String sentence =
                input.stream()
                .reduce((string1,string2) -> { return string1 + " " + string2;})
                .get();

        return sentence;
    }
}
