
package sendinformationsms;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sendinformationsms package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sendinformationsms
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendSMSResponse }
     * 
     */
    public SendSMSResponse createSendSMSResponse() {
        return new SendSMSResponse();
    }

    /**
     * Create an instance of {@link MSendSMSOutput }
     * 
     */
    public MSendSMSOutput createMSendSMSOutput() {
        return new MSendSMSOutput();
    }

    /**
     * Create an instance of {@link SendSMS }
     * 
     */
    public SendSMS createSendSMS() {
        return new SendSMS();
    }

    /**
     * Create an instance of {@link MAuthToken }
     * 
     */
    public MAuthToken createMAuthToken() {
        return new MAuthToken();
    }

    /**
     * Create an instance of {@link MSendSMSInput }
     * 
     */
    public MSendSMSInput createMSendSMSInput() {
        return new MSendSMSInput();
    }

}
