package HW_5.service;

import HW_5.model.User;

import java.util.List;

public interface DataService {
    User create(User user);
    List<User> read();
}
