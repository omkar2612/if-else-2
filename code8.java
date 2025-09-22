class code8 {
    public static void main(String[] args) {
        double percent = 78.5;  

        if (percent >= 85) {
            System.out.println("First class with distinction");
        } else if (percent >= 70) {
            System.out.println("First class");
        } else if (percent >= 55) {
            System.out.println("Second class");
        } else if (percent >= 35) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
