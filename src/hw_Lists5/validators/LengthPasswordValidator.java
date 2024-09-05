package hw_Lists5.validators;

public class LengthPasswordValidator implements IPasswordValidator{
    @Override
    public boolean isValid(String password) {
        return password.length() < 5 || password.length() > 10;
    }
}
