package e_Misc;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Cooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Map<String, Double>> products = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] productInfo = scanner.nextLine().split(":");

            double quantity = Double.parseDouble(productInfo[0]);
            String measurementUnit = productInfo[1].toLowerCase();
            String productName = productInfo[2];

            double quantityInLitres = 0.0;

            if (measurementUnit.equals("ls")) {
                quantityInLitres = quantity;
            } else {
                quantityInLitres = getQuantityInLitres(quantity, measurementUnit);
            }

            boolean containsKey = checkIfKeyExistsIgnoreCase(products, productName);

            if (!containsKey) {
                products.put(productName, new LinkedHashMap<>());
                products.get(productName).put(measurementUnit, quantityInLitres);
            } else {

                productName = returnExistingProductName(products, productName);
                measurementUnit = getMeasurementUnit(products, productName);

                double newQuantity = getNewQuantity(products, measurementUnit, quantityInLitres, productName);
                products.get(productName).put(measurementUnit, newQuantity);
            }

        }

        int m = Integer.parseInt(scanner.nextLine());



        System.out.println(products);
    }

    private static double getNewQuantity(Map<String, Map<String, Double>> products, String measurementUnit, double quantityInLitres, String productName) {
        double newQuantity = 0.0;

        for (Map.Entry<String, Map<String, Double>> kvp : products.entrySet()) {
            if (kvp.getKey().equals(productName)) {
                Map<String, Double> tempMap = kvp.getValue();
                for (Map.Entry<String, Double> kvp2 : tempMap.entrySet()) {
                    if (kvp2.getKey().equals(measurementUnit)) {
                        newQuantity = kvp2.getValue() + quantityInLitres;
                        break;
                    }
                }
            }
        }
        return newQuantity;
    }

    private static String getMeasurementUnit(Map<String, Map<String, Double>> products, String productName) {

        String unit = "";

        for (Map.Entry<String, Map<String, Double>> kvp : products.entrySet()) {
            if (kvp.getKey().equals(productName)) {
                Map<String, Double> tempMap = kvp.getValue();
                for (Map.Entry<String, Double> kvp2 : tempMap.entrySet()) {
                    unit = kvp2.getKey();
                    break;
                }
            }
        }

        return unit;
    }

    private static double getQuantityInLitres(double quantity, String measurementUnit) {

        double newQuantity = 0.0;

        switch (measurementUnit) {
            case "mls":
            case "mililiters":
                newQuantity = quantity * 0.001;
                break;
            case "tbsps":
            case "tablespoons":
                newQuantity = quantity * 0.015;
                break;
            case "fl ozs":
            case "fluid ounces":
                newQuantity = quantity * 0.030;
                break;
            case "tsps":
            case "teaspoons":
                newQuantity = quantity * 0.005;
                break;
            case "gals":
            case "gallons":
                newQuantity = quantity * 3.84;
                break;
            case "pts":
            case "pints":
                newQuantity = quantity * 0.480;
                break;
            case "qts":
            case "quarts":
                newQuantity = quantity * 0.960;
                break;
            case "cups":
                newQuantity = quantity * 0.240;
                break;
        }

        return newQuantity;
    }

    private static String returnExistingProductName(Map<String, Map<String, Double>> products, String productName) {

        String value = "";

        for (Map.Entry<String, Map<String, Double>> kvp : products.entrySet()) {
            if (kvp.getKey().equalsIgnoreCase(productName)) {
                value = kvp.getKey();
                break;
            }
        }
        return value;
    }

    private static boolean checkIfKeyExistsIgnoreCase(Map<String, Map<String, Double>> products, String productName) {

        boolean containsKey = false;

        if (!products.isEmpty()) {
            for (Map.Entry<String, Map<String, Double>> kvp : products.entrySet()) {
                if (kvp.getKey().equalsIgnoreCase(productName)) {
                    containsKey = true;
                    break;
                }
            }
        }

        return containsKey;

    }
}
