public class SlackNotifierDecorator extends NotifierDecorator{
    public SlackNotifierDecorator(Notifier notifier){
        this.notifier = notifier;
    }

    @Override
    public String send(){
        return notifier.send() + " via Slack Notifier";
    }

}
