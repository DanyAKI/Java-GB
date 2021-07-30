
public abstract class Animals {

    private final int maxRunlenght;
    private final int maxSwimLenght;

    public Animals(int maxRunlenght, int maxSwimLenght){
        this.maxRunlenght = maxRunlenght;
        this.maxSwimLenght = maxSwimLenght;
    }

    public int getMaxRunlenght() {
        return maxRunlenght;
    }

    public int getMaxSwimLenght() {
        return maxSwimLenght;
    }

    public abstract void doRun(int length);
    public abstract void dpSwim(int length);


}
