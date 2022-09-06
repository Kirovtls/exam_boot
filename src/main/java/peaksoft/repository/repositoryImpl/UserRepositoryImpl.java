package peaksoft.repository.repositoryImpl;

import peaksoft.model.User;
import peaksoft.repository.UserRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User getUserByUsername(String name) {
        return  entityManager.createQuery("select u from User u where u.username =: name",User.class)
                .setParameter("name",name).getSingleResult();

    }
}
