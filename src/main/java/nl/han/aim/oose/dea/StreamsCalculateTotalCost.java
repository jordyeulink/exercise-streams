package nl.han.aim.oose.dea;

import nl.han.aim.oose.dea.helpers.Product;

import java.util.List;

public class StreamsCalculateTotalCost {
    int calculateTotalCostOfAllProducts(List<Product> products) {
        // TODO: implement
        int costs =
                products.stream()
                        .map(x -> x.getPrice())
                        .reduce(0,(val1,val2) -> val1 + val2 );

        return costs;
    }

    int calculateTotalCostOfAllGadgets(List<Product> products) {
        // TODO: implement

        int costs =
                products.stream()
                        .filter(x -> x.getName() != "table")
                        .map(x -> x.getPrice())
                        .reduce(0,(val1,val2) -> val1 + val2 );

        return costs;
    }
}
