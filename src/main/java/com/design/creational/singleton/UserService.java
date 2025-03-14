package com.design.creational.singleton;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class UserService {
    List<User> user = Arrays.asList(
      new User(1,"Prasanna","Prasanna123"),
            new User(2,"Prabhas","Prabhas123")
    );
    public List<User> getAllUsers(){
        return user;
    }
}

// Lazy Loading Design pattern
//public class UserService {
//    private static UserService userService;
//    private UserService(){}
//    public static UserService getUserservice(){
//        if(userService == null){
//            userService = new UserService();
//        }
//        return userService;
//    }
//    List<User> user = Arrays.asList(
//            new User(1,"Prasanna","Prasanna123"),
//            new User(2,"Prabhas","Prabhas123")
//    );
//    public List<User> getAllUsers(){
//        return user;
//    }
//}

// Lazy Loading Design Pattern with Thread Safe Double-Checked Locking (Best Performance)
//public class UserService {
//    private static UserService userService;
//    private UserService(){}
//    public static UserService getUserService(){
//        if(userService == null){
//            synchronized (UserService.class){
//                if (userService == null){
//                    userService = new UserService();
//                }
//            }
//        }
//        return userService;
//    }
//    List<User> user = Arrays.asList(
//            new User(1,"Prasanna","Prasanna123"),
//            new User(2,"Prabhas","Prabhas123")
//    );
//    public List<User> getAllUsers(){
//        return user;
//    }
//}

//Lazy Loading Singleton Design Pattern with Thread safe but Slow
//public class UserService {
//    private static UserService userService;
//    private UserService(){}
//    public static synchronized UserService getUserService(){
//        if(userService == null){
//            userService = new UserService();
//        }
//        return userService;
//    }
//    List<User> user = Arrays.asList(
//            new User(1,"Prasanna","Prasanna123"),
//            new User(2,"Prabhas","Prabhas123")
//    );
//    public List<User> getAllUsers(){
//        return user;
//    }
//}

// Eager Loading Single Design Pattern
//public class UserService {
//    private static UserService userService;
//    private UserService(){}
//    public static UserService getUserservice(){
//        if(userService == null){
//            userService = new UserService();
//        }
//        return userService;
//    }
//    List<User> user = Arrays.asList(
//            new User(1,"Prasanna","Prasanna123"),
//            new User(2,"Prabhas","Prabhas123")
//    );
//    public List<User> getAllUsers(){
//        return user;
//    }
//}

