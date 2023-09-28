package backend.truetrip.serviceimpl;

import backend.truetrip.entities.User;
import backend.truetrip.exceptions.IncompleteDataException;
import backend.truetrip.exceptions.KeyRepeatedDataException;
import backend.truetrip.exceptions.ResourceNotFoundException;
import backend.truetrip.repositories.UserRepository;
import backend.truetrip.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;


    @Override
    public List<User> listAll() {
        return null;
    }

    @Override
    public User findById(Long id) {
        User userFound = userRepository.findById(id).orElse(null);
        if (userFound == null) {
            throw new ResourceNotFoundException("There are no Employee with the id: "+String.valueOf(id));
        }
        return userFound;
    }

    @Override
    public User save(User user) {
        if (user.getName()==null || user.getName().isEmpty()) {
            throw new IncompleteDataException("Employee name can not be null or empty");
        }
        if (userRepository.findByNameContaining(user.getName()).size()>0) {
            throw new KeyRepeatedDataException("Employee name can not be duplicated");
        }

        return userRepository.save(user);
    }

    @Override
    public void delete(Long id) {
        User user = findById(id);
        userRepository.delete(user);
    }
}
