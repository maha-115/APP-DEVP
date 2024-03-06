package corprate.maha.service;

import corprate.maha.dto.request.ForgotPasswordRequest;
import corprate.maha.dto.request.LoginRequest;
import corprate.maha.dto.request.RegisterRequest;
import corprate.maha.dto.response.ForgotPasswordResponse;
import corprate.maha.dto.response.LoginResponse;
import corprate.maha.dto.response.RegisterResponse;


public interface AuthenticationService {

    RegisterResponse register(RegisterRequest request);

    LoginResponse login(LoginRequest request);

    ForgotPasswordResponse forgotPassword(ForgotPasswordRequest request);

}
