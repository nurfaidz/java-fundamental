public class NumberConversion {
    public static void main(String[] args) {
        byte thisByte = 10;
        short thisShort = thisByte;
        int thisInt = thisShort;

        byte thisByte2 = (byte) thisInt;
    }
}
