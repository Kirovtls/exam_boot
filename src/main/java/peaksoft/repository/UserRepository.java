package peaksoft.repository;

import peaksoft.model.User;

public interface UserRepository  {

    User getUserByUsername(String name);

//    @Query("select u from User u where u.username =: username")
//    User getUserByUsername(@Param("username") String username);

}