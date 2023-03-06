package codewars;

public class Main {
    public static void main(String[] args) {
        System.out.println(toCamelCase("The_Stealth_Warrior"));
    }

    public static String toCamelCase(String s) {
        String[] words = s.split("[-_]");
        StringBuilder builder = new StringBuilder(words[0]);
        for (int i = 1; i < words.length; i++) {
            builder.append(words[i].substring(0, 1).toUpperCase())
                    .append(words[i].substring(1).toLowerCase());
        }
        return builder.toString();
    }
}
