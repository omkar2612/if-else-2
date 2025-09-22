 class code4 {
    public static void main(String[] args) {
        double percentage = 82.5;   // hardcoded input

        if (percentage > 85.0) {
            System.out.println("Medical");
        } else if (percentage <= 85.0 && percentage > 75.0) {
            System.out.println("Engineering");
        } else if (percentage <= 75.0 && percentage >= 65.0) {
            System.out.println("Pharmacy or Bachelor in Science");
        } else {
            System.out.println("Consider other career options.");
        }
    }
}
