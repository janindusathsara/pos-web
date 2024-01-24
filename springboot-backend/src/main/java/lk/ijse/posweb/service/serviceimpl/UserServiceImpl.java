package lk.ijse.posweb.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.ijse.posweb.dto.UserPwdDto;
import lk.ijse.posweb.entity.User;
import lk.ijse.posweb.repository.UserRepository;
import lk.ijse.posweb.service.UserService;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User changePassword(Long id, UserPwdDto userPwdDto) {
        User user = userRepository.findById(id).orElse(null);

        if (user != null) {
            user.setPassword(userPwdDto.getPassword());
            return userRepository.save(user);
        } else {
            return null;
        }
    }
    
}
