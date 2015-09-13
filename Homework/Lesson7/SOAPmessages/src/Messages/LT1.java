package Messages;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;

public class LT1 {
	 private static SOAPMessage createSOAPRequest() throws Exception{
		 
		        MessageFactory messageFactory = MessageFactory.newInstance();
		        SOAPMessage soapMessage = messageFactory.createMessage();
		        SOAPPart soapPart = soapMessage.getSOAPPart();

		        String serverURI = "http://services.aonaware.com/webservices/";

		        SOAPEnvelope envelope = soapPart.getEnvelope();
		        envelope.addNamespaceDeclaration("xsd", serverURI);

		        SOAPBody soapBody = envelope.getBody();
		        SOAPElement soapBodyElem = soapBody.addChildElement("LetterSolutions", "xsd");
		        SOAPElement soapBodyElem1 = soapBodyElem.addChildElement("anagram", "xsd");
		        soapBodyElem1.addTextNode("testing");

		        MimeHeaders headers = soapMessage.getMimeHeaders();
		        headers.addHeader("SOAPAction", serverURI  + "LetterSolutions");

		        soapMessage.saveChanges();

		        System.out.print("Request SOAP Message:");
		        soapMessage.writeTo(System.out);
		        System.out.println();

		        return soapMessage;
     }

     private static void printSOAPResponse(SOAPMessage soapResponse) throws Exception
     {
             TransformerFactory transformerFactory = TransformerFactory.newInstance();
             Transformer transformer = transformerFactory.newTransformer();
             Source sourceContent = soapResponse.getSOAPPart().getContent();
             System.out.println("\nResponse SOAP Message = ");
             StreamResult result = new StreamResult(System.out);
             transformer.transform(sourceContent, result);
     }
     public static void main(String args[])
     {
             try
             {
                     SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
                     SOAPConnection soapConnection = soapConnectionFactory.createConnection();
                     String url = "http://services.aonaware.com/CountCheatService/CountCheatService.asmx?WSDL";
                     SOAPMessage soapResponse = soapConnection.call(createSOAPRequest(), url);

                     printSOAPResponse(soapResponse);
                     
                     soapConnection.close();
             }
             catch (Exception e)
             {
                     System.err.println("Error occurred while sending SOAP Request to Server");
                     e.printStackTrace();
             }
     }
}