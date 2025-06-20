public class SMSNotifierDecorator extends NotifierDecorator{
    public SMSNotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public String send(){
        return notifier.send() + " via SMS Notifier";
    }



}
