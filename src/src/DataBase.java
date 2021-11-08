package src;

import java.util.Map;
import java.util.TreeMap;

public class DataBase {
    private final Map <Integer, User> users = new TreeMap<>();

    public void addUser(String name,int id, String password){
        User user = new User();
        user.setName(name);
        user.setId(id);
        user.setPassword(password);
        users.put(id, user);
    }

    public Map<Integer, User> getUsers() {
        return users;
    }

    public int findUser(int id, String password){
        if(users.get(id)==null)return 2;
        if(users.get(id).getPassword().equals(password)) return 1;
        else return 0;
    }
}
