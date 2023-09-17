package com.example.usermetadata.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.usermetadata.Entity.UserMetaData;
import com.example.usermetadata.Repository.UserRepo;

@Service
public class UserService {
    
    @Autowired
    UserRepo userRepo;
    
    public UserMetaData saveUserDetailsToDB(UserMetaData userMetaData){
        return userRepo.save(userMetaData);
    }

    public UserMetaData getUserDetailsFromDB(String uniqueId){
        return userRepo.findByUniqueId(uniqueId);
    }
}
