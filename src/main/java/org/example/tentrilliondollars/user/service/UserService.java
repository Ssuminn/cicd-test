package org.example.tentrilliondollars.user.service;

import lombok.RequiredArgsConstructor;
import org.example.tentrilliondollars.user.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

}
