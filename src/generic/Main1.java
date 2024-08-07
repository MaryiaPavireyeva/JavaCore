package generic;

public class Main1 {
    public static void main(String[] args) {
        BoxObject box1 = new BoxObject();
        box1.setItem("Hi");
        send(box1);

    }
    public static void send(BoxObject box){
        String data = (String) box.getItem();
        System.out.println(data);
        System.out.println(data.length());
    }
}
