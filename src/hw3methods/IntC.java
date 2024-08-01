package hw3methods;
public class IntC {
    private int c;
    public IntC(int c) {
        this.c = c;
    }
    public final static int MIN_INT = Integer.MIN_VALUE;
    public final static int MAX_INT = Integer.MAX_VALUE;

    public void incrementI() {
        this.c++;
    }

    public void decrementI() {
        this.c--;
    }
    public int getParamI(){
        return this.c;
    }
}