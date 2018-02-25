package division;

public class DivisionClass implements DivisionInterface {
    public int division(int one, int two) throws ZeroException{
        if(two == 0){
            new ZeroException();
        }
        return one / two;
    }

    public double division(double one, double two) throws ZeroException {
        if(two == 0){
            new ZeroException();
        }
        return one / two;
    }
}
