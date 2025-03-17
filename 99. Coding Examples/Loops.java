public class Loops {

    public void forLoop() {
        for(int i = 1; i <= 5; ++i) {
            System.out.println(i);
        }
    }

    public void whileLoop() {
        int num = 1;

        while(num <= 2) {
            System.out.println(num);
            num += 1;
        }
    }

    public void doWhileLoop() {
        int num = 1;

        do{
            System.out.println(num);
        }while(num < 1);
    }

    public void forEachLoop() {
        String[] names = {"Ahmed", "ad", "bg", "cj"};

        for(String name: names) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        Loops loops = new Loops();
        loops.forLoop();
        loops.whileLoop();
        loops.doWhileLoop();;
        loops.forEachLoop();
    }
}
