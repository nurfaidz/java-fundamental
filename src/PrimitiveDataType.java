public class PrimitiveDataType {
    public static void main(String[] args) {

        Integer thisInteger = 100;
        Long thisLong = 100L;

        Byte thisByte = null;

        System.out.println(thisByte);

        thisByte = 100;

        System.out.println(thisByte);

        int thisInt = 100;

        Integer thisObejct = thisInt;

        short thisShort = thisObejct.shortValue();
        long thisLong2 = thisObejct.longValue();
        float thisFloat = thisObejct.floatValue();

        Long amount = 1000000L;
        amount.byteValue();

    }
}
