package hw3methods;
public class ShortB {
    private short b;
    public ShortB(short b) {
        this.b = b;
    }
    public final static short MIN_SHORT = Short.MIN_VALUE;
    public final static short MAX_SHORT = Short.MAX_VALUE;

    public void incrementS() {
        this.b++;
    }

    public void decrementS() {
        this.b--;
    }

    public short getParamS(){
        return this.b;
    }
}