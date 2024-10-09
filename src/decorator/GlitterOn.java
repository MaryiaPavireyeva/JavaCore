package decorator;

public class GlitterOn extends GlitterDecorator{
    public GlitterOn(IPhone iPhone) {
        super(iPhone, true, 100);
    }
}
