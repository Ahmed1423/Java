public class JumpStatements {

    public void breakStatement() {
        for(int i = 0; i <= 3; ++i) {
            if(i == 2) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("end");
    }

    public void continueStatement() {
        for(int i = 0; i <= 3; ++i) {
            if(i == 2) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("end");
    }

    public void returnStatement() {
        for(int i = 0; i <= 3; ++i) {
            if(i == 2) {
                return;
            }
            System.out.println(i);
        }
        System.out.println("end");
    }

    public static void main(String[] args) {
        JumpStatements jumpStatements = new JumpStatements();
        jumpStatements.breakStatement();
        jumpStatements.continueStatement();
        jumpStatements.returnStatement();
    }
}
