package hw_Lists5;

public enum Charact {
    CHARACT ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"),
    CHARACTRUS ("АБВГДЕЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдежзийклмнопрстуфхцчшщъыьэюя"),
    CHARACTENG ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");


    private String charect;

    Charact(String charect) {
        this.charect = charect;
    }

    public String getCharect() {
        return charect;
    }
}
