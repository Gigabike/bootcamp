public class App {
    public static void main(String[] args) {
        int x = -1;
        int y = 0;
        if (x > 3) {
            y = 10;
            System.out.println("Hello, World!" + y); // Hello, World! 10
        } else {
            // y = 100;
            System.out.println("Tim" + y);
        }

        if (x > 2) {
            System.out.println("x > 2");
        } else if (x >= 0 && x <= 2) { // AND events
            System.out.println("x >= 0 and x <= 2");
        } else {
            System.out.println("x < 0");
        }

        boolean result = x > 2; // "x > 2" returns is true

        // Example 1
        int a = 12;
        int b = 10;
        int max = a;
        if (b > a) {
            max = b;
        }
        System.out.println("The max number is " + max + ".");
        // Print out: The max number is 12.

        // Example 2: equals()
        String day = "Sunday"; // Monday, Tuesday...
        if (day.equals("Sunday")) {
            System.out.println("Sunday is weekend");

        } else if (day.equals("Saturday")) {
            System.out.println("Saturday is weekend");

        } else {
            System.out.println("It is a weekday");
        }

        String target = "weekend";
        if ("Monday".equals("Monday") || "Tuesday".equals("Tuesday")
                || "Wednesday".equals("Wednesday") || "Thursday".equals("Thursday")
                || "Friday".equals("Friday")) {
            target = "weekday";
        }
        System.out.println(day + "is" + target);

        // Compare strings 
        // 1. String value compares with String variable
        // 2. String variable compares with string variable

        // Example 3 
       int score = 85; 
       // if ("score".equals("score>90") || "score".equals("score>=80 & score<
    char grade = ' '; 
    //") || "score".equals("score>70 & score<80") 
       //  )  || ("score.equals("score<70")
        //  System.out.println()
        // score > 90 -> A (Pass)
        // 80 -90 -> B (Pass)
        // 70 - 79 -> C (Pass)
        // < 70 -> F (Fail)
        if (score > 90) {
            grade = 'A';
        } else if (score >=80) {
            grade = 'B';
        } else if (score >= 70 && score <=79) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        String examResult = "passed"; 
        if (grade == 'F') {
            examResult = "failed";
        }
        System.out.println("The grade is" + grade + " and " + examResult + ".");
        // Print out: "The grade is B and passed."
    }
}
