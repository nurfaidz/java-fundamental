public class ForEach {
    public static void main(String[] args) {
        String[] array = { "Apple", "Banana", "Cherry", "Mango" };

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (String name : array) {
            System.out.println(name);
        }
    }
}
