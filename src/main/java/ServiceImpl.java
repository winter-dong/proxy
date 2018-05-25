package staticProxy;

public class ServiceImpl implements staticProxy.IService {
    public void doSth() {

        System.out.println("doSth");

    }

    public final void doFinal(){
        System.out.println("do finally");
    }
}
