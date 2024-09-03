package exception;

public class Main11 {
    public static void main(String[] args) {
       try {
           handle();
       }catch (BadDataType e){
           System.out.println(e.getMessage());
       }

    }

    public static BadDataType handle(){
        throw new BadDataType("Error");

//        BadDataType bad = new BadDataType("Error");
//        throw bad;
    }
}
