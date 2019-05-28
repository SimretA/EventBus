public class Tester {
    public static void main(String[] args) {
        EventBus eventBus = new EventBusHandler();
        Event<Message> event = new Distribute();
        User user = new User("User1");
        eventBus.register(user);

        User user2 = new User("User2");
        eventBus.register(user2);
        User user3 = new User("User3");
        eventBus.register(user3);
        User user4 = new User("User4");
        eventBus.register(user4);

        eventBus.dispatch(event);


    }
}
