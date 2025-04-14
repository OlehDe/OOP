package pr12;

public class Main {
    public static void main(String[] args) {

        Creator creator1 = new Creator("Creator1");
        Creator creator2 = new Creator("Creator2");
        Creator creator3 = new Creator("Creator3");

        User user1 = new User("User1");
        User user2 = new User("User2");
        User user3 = new User("User3");
        User user4 = new User("User4");
        User user5 = new User("User5");
        User user6 = new User("User6");
        User user7 = new User("User7");

        creator1.add(user1);
        creator1.add(user2);
        creator1.add(user3);
        creator2.add(user4);
        creator2.add(user5);
        creator3.add(user6);
        creator3.add(user7);
        creator2.add(user3);
        creator3.add(user1);

        creator1.addPost();
        creator2.addPost();
        creator3.addPost();
        creator1.addPost();
    }
}
