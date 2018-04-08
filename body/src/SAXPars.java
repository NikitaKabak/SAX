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
        StringBuilder character = new StringBuilder();

        for (int i = start; i < start + length; i++) {
            switch (ch[i]) {
                case '\\':
                    character.append("\\\\");
                    break;
                case '"':
                    character.append("\\\"");
                    break;
                case '\n':
                    character.append("\\n");
                    break;
                case '\r':
                    character.append("\\r");
                    break;
                case '\t':
                    character.append("\\t");
                    break;
                default:
                    character.append(ch[i]);
                    break;
            }
        }
        System.out.print(character.toString().trim());
        System.out.print("\"\n");
    }


}
