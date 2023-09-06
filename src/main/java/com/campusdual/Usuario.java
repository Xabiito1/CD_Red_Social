package com.campusdual;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<User> follows;
    private List<Post> posts;

    public User(String name) {
        this.name = name;
        this.follows = new ArrayList<>();
        this.posts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void followUser(User user) {
        follows.add(user);
    }

    public void unfollowUser(User user) {
        follows.remove(user);
    }

    public void addPost(Post post) {
        posts.add(post);
    }

    public void deletePost(Post post) {
        posts.remove(post);
    }

    public List<Post> listPosts() {
        return posts;
    }

    public List<Comment> listComments() {
        List<Comment> comments = new ArrayList<>();
        for (Post post : posts) {
            comments.addAll(post.getComments());
        }
        return comments;
    }

    public void showFeed() {
        List<Post> feed = new ArrayList<>();
        for (User followed : follows) {
            feed.addAll(followed.listPosts());
        }
        // Sort the posts by date in chronological order (most recent first)
        feed.sort((post1, post2) -> post2.getDate().compareTo(post1.getDate()));

        // Display the top 10 posts
        int numPostsToShow = Math.min(10, feed.size());
        for (int i = 0; i < numPostsToShow; i++) {
            Post post = feed.get(i);
            System.out.println(post);
        }
    }
}
