package school.mjc.stage0.conditions.task3;

import java.util.Locale;

public class AlphabeticCharacters {

    public void vowelDeterminer(char character) {
        if ((character >= 65 && character <= 90) || (character >= 97 && character <= 122)) {
            String symbol = String.valueOf(character).toUpperCase(Locale.ROOT);
            char[] upperCaseSymbol = symbol.toCharArray();
            char[] vowel = {'A', 'E', 'I', 'O', 'U', 'Y'};
            boolean flag = true;
            for (int i = 0; i < vowel.length; i++) {
                if (upperCaseSymbol[0] == vowel[i]) {
                    flag = false;
                    System.out.println("Vowel");
                    break;
                }
            }
            if (flag) {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}
