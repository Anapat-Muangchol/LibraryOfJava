public class GenerateRandomString {
    public static final String SALT_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";

    public static void main(String[] args) {
        System.out.print(getRandomString(100));
    }

    private static String getRandomString(int length) {
        StringBuilder str = new StringBuilder(length);
        int lengthOfSalt = SALT_CHARS.length();
        for (int i=0; i<length; i++) {
            int randomNum = 0 + (int)(Math.random() * (lengthOfSalt));
            str.append(SALT_CHARS.charAt(randomNum));
        }
        return str.toString();
    }

}
