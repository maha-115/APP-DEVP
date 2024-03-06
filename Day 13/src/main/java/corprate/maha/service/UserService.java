package corprate.maha.service;

import java.util.List;

import corprate.maha.model.User;
import corprate.maha.dto.request.RegisterRequest;
import corprate.maha.dto.response.RegisterResponse;
import corprate.maha.dto.response.UserDetailResponse;

public interface UserService {

    RegisterResponse register(RegisterRequest request);

    UserDetailResponse getUser(String email);

    List<User> getAllUser();
}
