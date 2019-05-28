public class Distribute implements Event<Message> {
    @Override
    public Message getData() {
        Message message = new Message();
        message.setMessageContent("Broadcasting message");
        return  message;
    }
}
