package Test;

/**
 * ClassName:AbstractTest
 * Package:Test
 * Description:
 *
 * @date:2020-03-25 17:53
 * @author:车万通
 */
public abstract class AbstractTest {

    static int a;

    void aVoid2() {

    }

    public abstract void aVoid();

    void abs(){

    }

    public AbstractTest() {
    }
}

class AbsT extends AbstractTest implements AbstractInter,AbstractInter2{

    @Override
    public void aVoid() {

    }

    @Override
    public void absInt() {

    }

    @Override
    public void absInt2() {

    }
}
