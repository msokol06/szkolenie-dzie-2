package abc;
import com.Dzieci;

public class ProtectedTest extends Dzieci{
    public ProtectedTest(String mieszkanie, String dom, int iloscZabawek) {
        super(mieszkanie, dom, iloscZabawek);
    }

    public static void main(String[] args) {

        Dzieci dzieci = new Dzieci("mieszkanie","dom",12);

    }
}
