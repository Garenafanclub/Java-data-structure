package MyInjection;

public class DiImp
{ }
class EmailService
{
    private final ContactListService cls;
    @Inject
    public EmailService(ContactListService cls)
    {

        this.cls = cls;
    }
}
@Service
class MailChimpEmailService
{
    private final ContactListService cls;
    @Inject
    public MailChimpEmailService(ContactListService cls)
    {
        this.cls = cls;
    }
}
@Service        // automatically spring create a singleton object of this class so that same instance is over and over.
class ContactListService
{
    public ContactListService()
    { }
//    public List<Contacts> getContact()
//    {
//        return ImmutableList.copyOf(...);
//    }
//    void send(Contact contact)
//    { }
}
