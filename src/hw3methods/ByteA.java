package hw3methods;
public class ByteA {
    private byte a;
    public ByteA(byte a) {
        this.a = a;
    }
    public final static byte MIN_BYTE = Byte.MIN_VALUE;
    public final static byte MAX_BYTE = Byte.MAX_VALUE;

    public void incrementB() {
        this.a++;
    }
    public void decrementB() {
        this.a--;
    }

    public byte getParamB(){
        return this.a;
    }

    public static void main(String[] args) {

        ByteA maxB = new ByteA(ByteA.MAX_BYTE);
        ByteA minB = new ByteA(ByteA.MIN_BYTE);
        ShortB maxS = new ShortB(ShortB.MAX_SHORT);
        ShortB minS = new ShortB(ShortB.MIN_SHORT);
        IntC maxI = new IntC(IntC.MAX_INT);
        IntC minI = new IntC(IntC.MIN_INT);
        LongD maxL = new LongD(LongD.MAX_LONG);
        LongD minL = new LongD(LongD.MIN_LONG);

        System.out.println("Min byte: " + minB.getParamB() +
                "\nMaxByte: " + maxB.getParamB() +
                "\nMinShort: " + minS.getParamS() +
                "\nMaxShort: " + maxS.getParamS() +
                "\nMinInt: " + minI.getParamI() +
                "\nMaxInt: " + maxI.getParamI() +
                "\nMinLong: " + minL.getParamL() +
                "\nMaxLong: " + maxL.getParamL());


        maxB.incrementB();
        maxS.incrementS();
        maxI.incrementI();
        maxL.incrementL();

        minB.decrementB();
        minS.decrementS();
        minI.decrementI();
        minL.decrementL();


        System.out.println("New Min byte: " + minB.getParamB() +
                "\nMaxByte: " + maxB.getParamB() +
                "\nMinShort: " + minS.getParamS() +
                "\nMaxShort: " + maxS.getParamS() +
                "\nMinInt: " + minI.getParamI() +
                "\nMaxInt: " + maxI.getParamI() +
                "\nMinLong: " + minL.getParamL() +
                "\nMaxLong: " + maxL.getParamL());

    }
}
