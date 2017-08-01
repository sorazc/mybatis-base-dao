package cn.zc.test;

import cn.zc.test.dao.UserDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class MainTest {

    @Autowired
    private UserDao userDao;

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Test
    public void count(){
        Assert.assertNotNull(userDao);
        LOGGER.info(userDao.count().toString());
        Assert.assertNotNull(userDao.queryById("fed594bd-0948-11e7-8d61-448a5b337b12"));
        Assert.assertNotNull(userDao.queryById("fed594bd-0948-11e7-8d61-448a5b337b12"));
        Assert.assertNotNull(userDao.queryById("fed594bd-0948-11e7-8d61-448a5b337b12"));

    }

}
