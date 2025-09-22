class code10 {
    public static void main(String[] args) {
        int units = 250;   // hardcoded input
        double bill;

        if (units <= 100) {
            bill = units * 1.5;   // ₹1.5 per unit for first 100
        } else if (units <= 200) {
            bill = (100 * 1.5) + (units - 100) * 2.5;  // next 100 units at ₹2.5
        } else {
            bill = (100 * 1.5) + (100 * 2.5) + (units - 200) * 4.0; // remaining at ₹4
        }

        System.out.println("Total Electricity Bill = ₹" + bill);
    }
}
