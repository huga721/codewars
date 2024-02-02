package seven;

public class AnagramDetection {
    public static boolean isAnagram(String test, String original) {
        String[] anagram = original.toLowerCase().split("");
        String[] testAnagram = test.toLowerCase().split("");

        if (test.length() != original.length()) {
            return false;
        }
        for (int i = 0; i < anagram.length; i++) {
            if (test.contains(anagram[i]) && original.contains(testAnagram[i])) {
                test = test.toLowerCase().replaceFirst(anagram[i], "");
                anagram[i] = "";
                original = original.toLowerCase().replaceFirst(testAnagram[i], "");
                testAnagram[i] = "";
            }
        }
        return test.equals("");
    }
}