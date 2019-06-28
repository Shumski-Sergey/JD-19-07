package vgorelko.Lesson7.TaskB1.model;

public class Money {

       private long rub;
       private char penny;

    public Money(long rub, char penny) {
        this.rub = rub;
        this.penny = penny;
    }

    public long getRub() {
                return rub;
        }

        public void setRub(long rub) {
                this.rub = rub;
        }



        public char getPenny() {
                return penny;
        }

        public void setPenny(char penny) {
                this.penny = penny;
        }
}
