package Exc_7.Composite;

public class IntegerValue implements SubExpression {

    private final Integer value;

    public IntegerValue(Integer value) {
        this.value = value;
    }

    @Override
    public void add(SubExpression expr) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SubExpression getSubExpression(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void sub(SubExpression expr) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Number value() {
        return value;
    }
}
