package com.krishil.trading.services;

import com.krishil.trading.domains.VerificationType;
import com.krishil.trading.exceptions.UserException;
import com.krishil.trading.models.User;

public interface UserService {

	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public User findUserByEmail(String email) throws UserException;
	
	public User findUserById(Long userId) throws UserException;

	public User verifyUser(User user) throws UserException;

	public User enabledTwoFactorAuthentication(VerificationType verificationType,
											   String sendTo, User user) throws UserException;

	User updatePassword(User user, String newPassword);

	void sendUpdatePasswordOtp(String email,String otp);
}