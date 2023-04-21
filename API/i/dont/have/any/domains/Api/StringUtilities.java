package i.dont.have.any.domains.Api;

import java.util.*;
import java.util.stream.Stream;

public class StringUtilities {

    public static boolean isNumeric(final String str) {
        return toCharacterStream(str.replaceAll(".", "")).allMatch( c -> Character.isDigit(c));
    }

    public static boolean isInteger(final String str) {
        return toCharacterStream(str).allMatch(c -> Character.isDigit((char) c));
    }

    public static boolean isBoolean(final String str) {
        return (str.equals("true") || str.equals("false"));
    }

    public static int parseIntOrElse(final String str, final int orElse) {
        return isNumeric(str) ? Integer.parseInt(str) : orElse;
    }

    public static OptionalInt parseOptionalInt(final String str) {
        return isInteger(str) ? OptionalInt.of(Integer.parseInt(str)) : OptionalInt.empty();
    }

    public static double parseDoubleOrElse(final String str, final double orElse) {
        return isNumeric(str) ? Double.parseDouble(str) : orElse;
    }

    public static OptionalDouble parseOptionalDouble(final String str) {
        return isInteger(str) ? OptionalDouble.of(Double.parseDouble(str)) : OptionalDouble.empty();
    }

    public static boolean parseBooleanOrElse(final String str, final boolean orElse) {
        return isBoolean(str) ? Boolean.parseBoolean(str) : orElse;
    }

    public static String reverse(final String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static Stream<Character> toCharacterStream(final String str) {
        return str.chars().mapToObj(i -> (char) i);
    }

    public static List<String> splitToList(final String str, final String delimiter) {
        return Arrays.asList(str.split(delimiter));
    }
}
