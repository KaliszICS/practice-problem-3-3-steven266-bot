public class PracticeProblem {

	public static String evenOrOdd(int num) {
        if (num == 0) {
            return "Zero";
        } else if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
    public static String positiveOrNegative(int num) {
        if (num == 0) {
            return "Zero";
        } else if (num > 0) {
            return "Positive";
        } else {
            return "Negative";
        }
    }

    public static String pluralize(String word) {
    String lower = word.toLowerCase();  
    if (lower.endsWith("ey")) {
        return "eys";
    } else if (lower.endsWith("y")) {
        return "ies";
    } else if (lower.endsWith("ife")) {
        return "ives";
    } else {
        return "s";
    }	

}
}
