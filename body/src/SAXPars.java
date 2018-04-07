import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXPars extends DefaultHandler{

    public  void startDocument(){
        System.out.println(" Start parse XML");
        System.out.println();
    }

    public void endDocument(){
        System.out.println(" Stop parse XML");
    }
     public void startElement(String url, String name, String qname, Attributes atts){
        if("".equals(url) ){
            System.out.println("Start element: " + qname);
        } else {
            System.out.println("Start local element: " + name);
        }
     }
    public void endElement(String url, String name, String qname){
        if("".equals(url) ){
            System.out.println("End element: " + qname);
        } else {
            System.out.println("End local element: " + name);
        }
    }

    public void characters (char ch[], int start, int length)
    {
        System.out.print("Characters:   \"");
        for (int i = start; i < start + length; i++) {
            switch (ch[i]) {
                case '\\':
                    System.out.print("\\\\");
                    break;
                case '"':
                    System.out.print("\\\"");
                    break;
                case '\n':
                    System.out.print("\\n");
                    break;
                case '\r':
                    System.out.print("\\r");
                    break;
                case '\t':
                    System.out.print("\\t");
                    break;
                default:
                    System.out.print(ch[i]);
                    break;
            }

            {

            }
        }
        System.out.print("\"\n");
    }
    public void ignorableWhitespace (char ch[], int start, int length)
            throws SAXException
    {

    }

}
