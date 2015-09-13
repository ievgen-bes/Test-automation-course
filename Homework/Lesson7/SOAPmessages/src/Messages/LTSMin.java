package Messages;

import java.util.jar.Attributes.Name;
import javax.xml.soap.Detail;
import javax.xml.soap.DetailEntry;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPFault;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import org.junit.Test;

public class LTSMin {
	@Test
	public static void main(String args[]) throws Exception {

        SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
        SOAPConnection soapConnection = soapConnectionFactory.createConnection();

        String url = "http://services.aonaware.com/CountCheatService/CountCheatService.asmx?WSDL";
        SOAPMessage soapResponse = soapConnection.call(createSOAPRequest(), url);

        System.out.print("Response SOAP Message:");
        soapResponse.writeTo(System.out);

        soapConnection.close();
    }

    private static SOAPMessage createSOAPRequest() throws Exception {
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();
        SOAPPart soapPart = soapMessage.getSOAPPart();

        String serverURI = "http://services.aonaware.com/webservices/";

        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration("xsd", serverURI);

        SOAPBody soapBody = envelope.getBody();
        SOAPElement soapBodyElem = soapBody.addChildElement("LetterSolutionsMin", "xsd");
        SOAPElement soapBodyElem1 = soapBodyElem.addChildElement("anagram", "xsd");
        soapBodyElem1.addTextNode("testing");
        SOAPElement soapBodyElem2 = soapBodyElem.addChildElement("minLetters", "xsd");
        soapBodyElem2.addTextNode("6");
        
        MimeHeaders headers = soapMessage.getMimeHeaders();
        headers.addHeader("SOAPAction", serverURI  + "LetterSolutionsMin");
   
        soapMessage.saveChanges();

        System.out.print("Request SOAP Message:");
        soapMessage.writeTo(System.out);
        System.out.println();

        //SOAPFault fault = soapBody.addFault();

     //fault.setFaultCode("Client");
     //fault.setFaultString("Message does not have necessary info");

     //Detail detail = fault.addDetail();
     //Name entryName = (Name) envelope.createName("LetterSolutionsMin", "xsd", "http://services.aonaware.com/webservices/LetterSolutionsMin");
     //DetailEntry entry = detail.addDetailEntry((javax.xml.soap.Name) entryName);
     //entry.addTextNode("no word");
     //Name entryName2 = (Name) envelope.createName("anagram", "xsd", "http://services.aonaware.com/webservices/LetterSolutionsMin");
     //DetailEntry entry2 = detail.addDetailEntry((javax.xml.soap.Name) entryName2);
     //entry2.addTextNode("no min Letters");	
        return soapMessage;
       
        
}}
