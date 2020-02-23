/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lab7.entities.Comment;
import lab7.entities.Post;
import lab7.entities.User;

/**
 *
 * @author harshalneelkamal
 */
public class AnalysisHelper {
    // find user with Most Likes
    //  key: UserId ; Value: sum of likes from all comments
    // Question 1
    public void averageNumberLikePerComment(){
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        List<Comment> commentList = new ArrayList<>(comments.values());
        int sumLikes = 0;
        //System.out.println("sdfdsfdsfd"+comments.get(0).getLikes());
        //System.out.println(commentList.get(1));
        for (int i = 0; i < commentList.size(); i++) {
            sumLikes += commentList.get(i).getLikes();
        }
        double avNum = sumLikes/commentList.size();
        System.out.println("Average number of like per comment: "+ avNum);
    }
    
//  Question2
    public void postWithMostLikeComment(){
        Map<Integer,Comment> comments = DataStore.getInstance().getComments();
        int likes = 0;
        int id = 0;
        for(Comment c: comments.values()){
            if (c.getLikes()>likes){
                likes = c.getLikes();
                id = c.getPostId();
            }
        }
        System.out.println("Post with most like comment: No."+ id);
    }
    
// Question 3
    public void postWithMostComments(){
        Map<Integer,Post> posts = DataStore.getInstance().getPosts();
        int size=0;
        for (Post p: posts.values()){
            if(p.getComments().size()>size){
                size = p.getComments().size();
            }
        }
        for(Post post:posts.values()){
            if(post.getComments().size()==size){
                System.out.println("the post with most comments: No."+post.getPostId());
            }
        }
    }
    public void userWithMostLikes() {
        Map<Integer, Integer> userLikesCount = new HashMap<>();
        Map<Integer, User> users = DataStore.getInstance().getUsers();
    
        for (User user : users.values()) {
            for (Comment c : user.getComments()) {
                int likes = 0;
                if (userLikesCount.containsKey(user.getId())) {
                    likes = userLikesCount.get(user.getId());
                }
                likes += c.getLikes();
                userLikesCount.put(user.getId(), likes);
            }
        }
        int max = 0;
        int maxId = 0;
        for (int id : userLikesCount.keySet()) {
            if (userLikesCount.get(id) > max) {
                max = userLikesCount.get(id);
                maxId = id;
            }
        }
        System.out.println("User with most likes: " + max + "\n" 
            + users.get(maxId));
    }
    //6)&&7)Top 5 inactive users overall(sum of comments,posts and likes)
    public void getInactiveAndProActiveUserOverAll(){
        int sumOverall=0;
        Map<Integer,User> userMap=DataStore.getInstance().getUsers();
        Map<Integer,Comment>commentMap=DataStore.getInstance().getComments();
        Map<Integer, Post>postMap=DataStore.getInstance().getPosts();
        Map<Integer,Integer>userSumCount=new HashMap<>();
        List<Comment>commentList=new ArrayList<>(commentMap.values());
        List<Post>postList=new ArrayList<>(postMap.values());

        for(User user:userMap.values()){
            int postCount=0;
            for(Post post:postList){
                if(post.getUserId()==user.getId()){
                    postCount++;
                }
            }
            int commentCount=0;
            int likeCount=0;
            for(Comment comment:commentList){
                if(comment.getUserId()==user.getId()){
                    commentCount++;
                    likeCount=likeCount+comment.getLikes();
                }
            }
            sumOverall=postCount+likeCount+commentCount;
            userSumCount.put(user.getId(),sumOverall);
        }

        List<Map.Entry<Integer,Integer>>userSumList=new ArrayList<>(userSumCount.entrySet());
        //Collections.sort(userSumList,Comparator.comparing(Map.Entry::getValue));
        Collections.sort(userSumList, new Comparator<Map.Entry<Integer,Integer>>(){

            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });
        System.out.println("Top 5 inactive users based on overall: ");
        for(int i=0;i<userSumList.size()&&i<5;i++){
            System.out.println("User: No."+userSumList.get(i).getKey()+" Overall : "+userSumList.get(i).getValue());
        }
        Collections.sort(userSumList, new Comparator<Map.Entry<Integer,Integer>>(){

            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        System.out.println("Top 5 Proactive users based on overall: ");
        for(int i=0;i<userSumList.size()&&i<5;i++){
            System.out.println("User: No."+userSumList.get(i).getKey()+" Overall: "+userSumList.get(i).getValue());
        }
    }
    // find 5 comments which have the most likes
    public void getFiveMostLikedComment() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        List<Comment> commentList = new ArrayList<>(comments.values());
        
        Collections.sort(commentList, new Comparator<Comment>() {
            @Override 
            public int compare(Comment o1, Comment o2) {
                return o2.getLikes() - o1.getLikes();
            }
        });
        
        System.out.println("5 most likes comments: ");
        for (int i = 0; i < commentList.size() && i < 5; i++) {
            System.out.println(commentList.get(i));
        }
    }
}
