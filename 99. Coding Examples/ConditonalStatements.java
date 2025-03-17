public class ConditonalStatements {

    public void simpleIf() {
        int num = 3;

        if(num % 2 == 0) {
            System.out.println("even");
        }
    }

    public void ifElse() {
        int num = 3;

        if(num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    public void elseIfLadder() {
        String day = "Sunday";

        if("Saturday".equalsIgnoreCase(day)) {
            System.out.println("Weekend");
        } else if("Sunday".equalsIgnoreCase(day)) {
            System.out.println("Weekend");
        } else {
            System.out.println("Weekday");
        }
    }

    public void switchCase1() {
        String name = "Ahmed";

        switch(name) {
            case "Ahmed":
                System.out.println("Ahmed");
                break;
            case "Anda":
                System.out.println("Anda");
                break;
            default:
                System.out.println("Nothing");
        }
    }

    public String switchCase2() {
        String name = "Ahmed";

        return switch(name) {
            case "Ahmed" -> "ahmed is called";
            case "Anda" -> "Anda is called";
            default -> "No one is called";
        };
    }

    public static void main(String[] args) {
        ConditonalStatements conditonalStatements = new ConditonalStatements();
        conditonalStatements.simpleIf();
        conditonalStatements.ifElse();
        conditonalStatements.elseIfLadder();
        conditonalStatements.switchCase1();
        System.out.println(conditonalStatements.switchCase2());
    }
}
