public class Driver {
    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier();
        System.out.println(notifier.send());

        notifier = new SMSNotifierDecorator(notifier);
        System.out.println(notifier.send());

        Notifier notifier2 = new EmailNotifier();
        notifier2 = new SlackNotifierDecorator(notifier2);
        System.out.println(notifier2.send());

    }
}
