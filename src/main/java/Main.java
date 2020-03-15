import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        RC6.encrypt(
                "input.txt",
                "output.txt",
                "0123456789abcdef0112233445566778899aabbccddeeff01032547698badcfe"
        );
        RC6.decrypt(
                "output.txt",
                "output-decr.txt",
                "0123456789abcdef0112233445566778899aabbccddeeff01032547698badcfe"
        );
    }
}
