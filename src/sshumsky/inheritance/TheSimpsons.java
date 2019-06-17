package sshumsky.inheritance;

public class TheSimpsons {
    static abstract class Simpson {
        void talk() {
            System.out.println("Simpson!");
        }

        void prank(String prank) {
            System.out.println(prank);
        }
    }

    static class Bart extends Simpson {
        String prank;

        Bart(String prank) {
            this.prank = prank;
        }

        @Override
        protected void talk() {
            System.out.println("Eat my shorts!");
        }

        void prank() {
            super.prank(prank);
            System.out.println("Knock Homer down");
        }
    }

    static class Lisa extends Simpson {
        void talk(String toMe) {
            System.out.println("I love Sax!");
        }
    }

    public static void main(String... doYourBest) {
        new Lisa().talk("Sax :)");
        Bart bart = new Bart("D'oh");
        bart.talk();
        Lisa lisa = new Lisa();
        lisa.talk();
        bart.prank = "new D'oh";
        bart.prank();
    }
    //I love Sax!
    //Eat my shorts!
    //Simpson!
    //D'oh
    //Knock Homer down
}
