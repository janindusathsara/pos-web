package lk.ijse.posweb.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lk.ijse.posweb.dto.UserPwdDto;
import lk.ijse.posweb.entity.User;

@Service
public interface UserService {

    User createUser(User user);
    List<User> getAllUsers();
    User getUser(Long id);
    User changePassword(Long id, UserPwdDto userPwdDto);
    
}
