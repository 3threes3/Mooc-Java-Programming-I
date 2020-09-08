
public class Container {

    private int amount;

    public Container() {
        this.amount = 0;
    }

    public int contains() {
        return this.amount;
    }

    public void add(int amountToAdd) {
        if (amountToAdd > 0) {
            if (this.amount + amountToAdd > 100) {
                this.amount = 100;
            } else {
                this.amount += amountToAdd;
            }
        }
    }

    public void remove(int amountToRemove) {
        if (amountToRemove > 0) {
            if (this.amount - amountToRemove < 0) {
                this.amount = 0;
            } else {
                this.amount -= amountToRemove;
            }

        }
    }

    public void move(int amountToMove, Container container) {
        if (amountToMove > this.amount) {
            amountToMove = this.amount;
        }
        this.amount -= amountToMove;
        if (container.getAmount() + amountToMove > 100) {
            container.setAmount(100);
        } else {
            container.setAmount(container.getAmount() + amountToMove);
        }
    }

    public int getAmount() {
        return this.amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return this.amount + "/100";
    }

}
