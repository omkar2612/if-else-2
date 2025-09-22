class code7 {
    public static void main(String[] args) {
        int costPrice = 1000;    // hardcoded input
        int sellingPrice = 1200; // hardcoded input

        if (sellingPrice > costPrice) {
            System.out.println("Profit of " + (sellingPrice - costPrice));
        } else if (sellingPrice < costPrice) {
            System.out.println("Loss of " + (costPrice - sellingPrice));
        } else {
            System.out.println("No profit no loss");
        }
    }
}
