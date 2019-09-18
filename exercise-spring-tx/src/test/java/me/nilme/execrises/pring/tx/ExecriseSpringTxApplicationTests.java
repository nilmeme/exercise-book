package me.nilme.execrises.pring.tx;

import me.nilme.execrises.pring.tx.dao.AopUserDao;
import me.nilme.execrises.pring.tx.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExecriseSpringTxApplicationTests {

    @Autowired
    private AopUserDao aopUserDao;

    @Test
    public void contextLoads() {
        User user = new User();
        user.setAge(100);
        user.setName("nilme");

        aopUserDao.save(user);

    }

}
