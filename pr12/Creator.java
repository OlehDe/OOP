package pr12;

import java.util.ArrayList;
import java.util.List;

public class Creator implements Observable {
    private String nickname;
    private int postCount;
    private int followerCount;
    private List<Observer> followers;

    public Creator(String nickname) {
        this.nickname = nickname;
        this.postCount = 0;
        this.followerCount = 0;
        this.followers = new ArrayList<>();
    }

    public String getNickname() {
        return nickname;
    }

    public int getPostCount() {
        return postCount;
    }

    public int getFollowerCount() {
        return followerCount;
    }

    public void addPost() {
        postCount++;
        notifyObservers();
    }

    @Override
    public void add(Observer observer) {
        followers.add(observer);
        followerCount++;
    }

    @Override
    public void remove(Observer observer) {
        followers.remove(observer);
        followerCount--;
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : followers) {
            observer.update("New post from " + nickname + ": Post #" + postCount);
        }
    }
}
