public class CaesarCipher {
    public static String caesarCipher(String text, int key, boolean encrypt) {
        StringBuilder result = new StringBuilder();

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                int alphabetSize = 26;
                int shifted = (c - base + (encrypt ? key : -key) + alphabetSize) % alphabetSize;
                result.append((char) (base + shifted));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String message = "Hi! Where are you from?";
        int key = 3;

        // Зашифрование сообщения
        String encryptedMessage = caesarCipher(message, key, true);
        System.out.println("Зашифрованное сообщение: " + encryptedMessage);

        // Расшифровка сообщения
        String decryptedMessage = caesarCipher(encryptedMessage, key, false);
        System.out.println("Расшифрованное сообщение: " + decryptedMessage);
    }
}
