package CreationalDP.SingletonDP;

public class SingeltonObject {

    String message = "MERHABA";

    private static SingeltonObject instance = new SingeltonObject();

    private SingeltonObject() {};

    public static SingeltonObject getInstance(){
        return instance;
    }

    public void changeMessage(){
        this.message =this.message + "Batch 104";

    }
}
