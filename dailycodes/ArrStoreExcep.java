class ArrStoreExcep {

    public static void main(String[] args) {

        Object[] allowedItems = new String[3];

        // This will work fine because we are storing correct input.
        allowedItems[0] = "Hello World";

        // This line throws ArrayStoreException at runtime
        allowedItems[1] = 100;
    }
}
