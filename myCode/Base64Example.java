import java.util.Base64;
import java.nio.charset.StandardCharsets;

public class Base64Example {
    public static void main(String[] args) {
        String originalPhrase = "Hello, World!";

        // Encode the phrase to Base64
        String encodedPhrase = Base64.getEncoder()
                .encodeToString(originalPhrase.getBytes(StandardCharsets.UTF_8));
        
        System.out.println("Encoded: " + encodedPhrase);

        // Decode the phrase back to normal
        byte[] decodedBytes = Base64.getDecoder().decode(encodedPhrase);
        String decodedPhrase = new String(decodedBytes, StandardCharsets.UTF_8);
        
        System.out.println("Decoded: " + decodedPhrase);
    }
}