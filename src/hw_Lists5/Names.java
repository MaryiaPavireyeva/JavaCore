package hw_Lists5;

public enum Names {
    REALPERSONNAME (new String[]{"Misha", "Katia", "Pasha", "Dasha"}),
    REALANIMALNAME (new String[]{"Kesha", "Gosha", "Bim", "Bob"}),
    REALNICKNAME (new String[]{"Hey", "Key", "Cool", "Bab"});

    String[] data;
    Names(String[] data) {
        this.data = data;
    }

}
