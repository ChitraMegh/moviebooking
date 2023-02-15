package com.chitraproject.moviebookingspirng;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Arrays;

@Service
public class UserService {

    // In a real implementation, this list of users would be stored in a database
    private List<User> users = Arrays.asList(
            new User("John", "Doe"),
            new User("Jane", "Doe")
    );

    public List<User> getAllUsers() {
        return users;
    }
}
