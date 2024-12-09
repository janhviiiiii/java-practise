package decision_making_system;

public class swi {
    public static void main(String[] args) {

        String str = "jan";

        switch (str) {
            case "jan":
                System.out.println("JANUARY");
                break;
            case "feb":
                System.out.println("FEBRUARY");
                break;
            case "mar":
                System.out.println("MARCH");
                break;
            case "apr":
                System.out.println("APRIL");
                break;
            case "may":
                System.out.println("MAY");
                break;
            case "jun":
                System.out.println("JUNE");
                break;
            case "jul":
                System.out.println("JULY");
                break;
            case "aug":
                System.out.println("AUGUST");
                break;
            case "sep":
                System.out.println("SEPTEMBER");
                break;
            case "oct":
                System.out.println("OCTOBER");
                break;
            case "nov":
                System.out.println("NOVEMBER");
                break;
            case "dec":
                System.out.println("DECEMBER");
                break;
            default:
                System.out.println("Invaid Input");
                break;
        }
    }
}