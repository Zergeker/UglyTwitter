package com.example.UglyTwitter.services;

import com.example.UglyTwitter.model.Role;
import com.example.UglyTwitter.model.User;
import com.example.UglyTwitter.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String nickname){
        User user = userRepository.findByNickname(nickname);
        if (user==null) throw new UsernameNotFoundException(nickname);

        Set<GrantedAuthority> grantedAuthorites = new HashSet<>();
        for (Role role : user.getRoles()){
            grantedAuthorites.add(new SimpleGrantedAuthority(role.getName()));
        }

        return new org.springframework.security.core.userdetails.User(user.getNickname(), user.getPassword(), grantedAuthorites);
    }
}
