package store;

import model.User;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

public class UserDB {

    private static final UserDB INSTANCE = new UserDB();
    private final ConcurrentHashMap<Integer, User> users = new ConcurrentHashMap<Integer, User>();
    {
       this.users.put(0,new User(0, "Max", "m@gmail.com"));
    }

    public void add(final User user) {
       this.users.put(user.getId(), user);
    }

    public void delete(final int id) {
       this.users.remove(id);
    }
    public void edit(final User user) {
        this.users.replace(user.getId(), user);
    }
    public Collection<User> values() {
        return this.users.values();
    }
    private UserDB() {
    }
    public static UserDB getInstance() {
        return INSTANCE;
    }
}
