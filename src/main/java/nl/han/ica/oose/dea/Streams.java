package nl.han.ica.oose.dea;

import nl.han.ica.oose.dea.helpers.Product;
import nl.han.ica.oose.dea.helpers.ProductCategory;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    List<String> filterStringsShorterThanThreeCharacters(List<String> input) {
        return input.stream()
                .filter(s -> s.length() < 3)
                .collect(Collectors.toList());
    }

    List<String> filterStringsThatContainOnlyNumerals(List<String> input) {
        return input.stream()
                .filter(s -> s.chars().allMatch(Character::isDigit))
                .collect(Collectors.toList());
    }

    String findShortestString(List<String> input) {
        return input.stream()
                .min(Comparator.comparingInt(String::length))
                .orElse(null);
    }

    public String createAFullSentenceFromTheList(List<String> input) {
        return String.join(" ", input);
    }

    int calculateTotalCostOfAllProducts(List<Product> products) {
        return products.stream()
                .mapToInt(Product::getPrice)
                .sum();
    }

    int calculateTotalCostOfAllGadgets(List<Product> products) {
        return products.stream()
                .filter(p -> p.getCategory().equals(ProductCategory.GADGETS))
                .mapToInt(Product::getPrice)
                .sum();
    }
}
