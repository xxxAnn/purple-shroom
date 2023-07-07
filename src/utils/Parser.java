package utils;

import java.util.ArrayList;

public class Parser {
    protected ArrayList<Pair<Integer, Integer>> parsePairList(String text, String sep, String subSep) {
        ArrayList<Pair<Integer, Integer>> pairs = new ArrayList<>();

        for (String a : text.split(sep)) {
            pairs.add(parsePair(a, ":"));
        }

        return pairs;
    }

    protected Pair<Integer, Integer> parsePair(String text, String sep) {
        String[] res = text.split(sep);

        return new Pair(Integer.parseInt(res[0]), Integer.parseInt(res[1]));
    }

    public ArrayList<Pair<Integer, Integer>> parseInventory(String text) {
        // Inventory is formatted as A:B,C:D,E:F,...
        return parsePairList(text, ",", ":");
    }
    public Pair<Integer, Integer> parsePosition(String text) {
        // Position is formatted as X,Y
        return parsePair(text, ",");
    }
}
