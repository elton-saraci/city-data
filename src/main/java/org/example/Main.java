package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CityData> dataset = Arrays.asList(
                new CityData("Freiburg", "Germany", "Europe"),
                new CityData("Berlin", "Germany", "Europe"),
                new CityData("Paris", "France", "Europe"),
                new CityData("Lyon", "France", "Europe"),
                new CityData("Tokyo", "Japan", "Asia"),
                new CityData("Osaka", "Japan", "Asia"),
                new CityData("Beijing", "China", "Asia"),
                new CityData("New York", "USA", "North America"),
                new CityData("Los Angeles", "USA", "North America"),
                new CityData("Toronto", "Canada", "North America")
        );

        CityTreeManager manager = new CityTreeManager();
        TreeNode worldTree = manager.buildTree(dataset);
        printTree(worldTree, 0);
    }

    private static void printTree(TreeNode node, int level) {
        System.out.println("  ".repeat(level) + node.getName());
        for (TreeNode child : node.getChildren().values()) {
            printTree(child, level + 1);
        }
    }

}