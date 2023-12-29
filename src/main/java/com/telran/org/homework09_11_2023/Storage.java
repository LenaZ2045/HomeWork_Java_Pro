package com.telran.org.homework09_11_2023;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

    public class Storage {
        private final Map<String, List<UserRequest>> userRequests;

        public Storage() {
            userRequests = new HashMap<>();
        }

        public void addUserRequest(String user, UserRequest request) {
            if (!userRequests.containsKey(user)) {
                userRequests.put(user, new ArrayList<>());
            }
            userRequests.get(user).add(request);
        }

        public List<UserRequest> getUserRequests(String user) {
            return userRequests.get(user);
        }

        public static void main(String[] args) {
            Storage storage = new Storage();
            storage.addUserRequest("User1", new UserRequest("www.de.de", Answer.APPROVED));
            storage.addUserRequest("User2", new UserRequest("www.ebay.de", Answer.DENIED));
            storage.addUserRequest("User2", new UserRequest("www.amazon.de", Answer.DENIED));
            storage.addUserRequest("User1", new UserRequest("www.ebay.bla-bla", Answer.ERROR));
            System.out.println();
            System.out.println("Статистика посещений для пользователя #1");
            List<UserRequest> user1Requests = storage.getUserRequests("User1");
            System.out.println("User1 requests:");
            for (UserRequest request : user1Requests) {
                System.out.println(request.address() + " - " + request.answer());
            }
            System.out.println();
            System.out.println("Статистика посещений для пользователя #2");
            List<UserRequest> user2Requests = storage.getUserRequests("User2");
            System.out.println("User2 requests:");
            for (UserRequest request : user2Requests) {
                System.out.println(request.address() + " - " + request.answer());
            }
        }
    }

    enum Answer {
        APPROVED,
        DENIED,
        ERROR
    }

record UserRequest(String address, Answer answer) {
}