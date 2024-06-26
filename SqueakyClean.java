package Exercism;

class SqueakyClean {
    static String clean(String identifier) {
        String result = "";
        boolean toUpperCase = false;

        for (char letter : identifier.toCharArray()) {
            if (letter == ' ') {
                result += '_';
            } else if (letter == '-') {
                toUpperCase = true;
            } else if (Character.isLetter(letter)) {
                if (toUpperCase) {
                    result += Character.toUpperCase(letter);
                    toUpperCase = false;
                } else {
                    result += letter;
                }
            } else if (Character.isDigit(letter)) {
                switch (letter) {
                    case '4':
                        result += 'A';
                        break;
                    case '3':
                        result += 'E';
                        break;
                    case '0':
                        result += 'O';
                        break;
                    case '1':
                        result += 'I';
                        break;
                    case '7':
                        result += 'T';
                        break;
                    default:
                        break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(clean("my   Id")); // "my___Id"
        System.out.println(clean("a-bc")); // "aBc"
        System.out.println(clean("H3ll0 W0rld")); // "Hello_World"
        System.out.println(clean("a$#.b")); // "ab"
    }
}
