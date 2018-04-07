import org.xml.sax.helpers.DefaultHandler;

public class SAXPars extends DefaultHandler{

    public  void startDocument(){
        System.out.println(" Start parse XML");
    }

}
