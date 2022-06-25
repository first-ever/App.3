package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Component
@Transactional
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;
    private static final List<User> list = new ArrayList<>();

    static {
        list.add(new User("Kirill", "Blue", 16));
        list.add(new User("Paul", "Black", 22));
        list.add(new User("Stan", "White", 44));
        list.add(new User("Britney", "Spears", 33));
    }

    @Override
    public List<User> getUsers() {
       // return list;
        return entityManager.createQuery("select u from User u",User.class).getResultList();
    }
}

//    @Override
//    public void saveUser(User user) {
//        entityManager.persist(user);
//    }
