public class Array {
    public static void main(String[] args) {
        String[] stringArray = new String[3];

        stringArray[0] = "John";
        stringArray[1] = "Doe";
        stringArray[2] = "Cris";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        stringArray[0] = "Alex";

        System.out.println(stringArray[0]);

        String[] name = {
                "John", "Doe", "Cris"
        };

        int[] thisInt = new int[]{
                1, 2, 3
        };

        long[] arrayLong = new long[]{
                10L, 20L, 30L
        };

        arrayLong[0] = 15L;

        System.out.println(arrayLong.length);

        String[][] members = {
                {
                    "John", "Doe", "Cris"
                },
                {
                    "Alex", "Ari", "Crisa"
                },
                {
                    "Exa", "Lusi", "Cris"
                }
        };

        System.out.println(members[0][2]);

    }
}
