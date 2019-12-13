package org.launchcode.MFM.models.data;

import org.launchcode.MFM.models.User;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import javax.transaction.Transactional;

@Repository
@Transactional
public interface UserDao extends CrudRepository<User, Integer>{
    User findByUsername(String username);
}
