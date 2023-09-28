package backend.truetrip.services;

import backend.truetrip.entities.User;

import java.util.List;

public interface UserService {

    public List<User> listAll();

    public User findById(Long id);

    public User save(User user);

    public void delete(Long id);
}
