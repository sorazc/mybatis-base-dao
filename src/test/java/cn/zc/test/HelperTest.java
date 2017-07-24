package cn.zc.test;

import cn.zc.base.dao.helper.ClassHelper;
import cn.zc.test.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Set;

/**
 * Created by zc on 2017/7/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-baseDAO.xml")
public class HelperTest {

    private static Set<Class<?>> classSet;

    static {
        classSet = ClassHelper.getClassSet();
        System.out.print("==============" + classSet + "===============");
    }

    @Test
    public void main(){
        System.out.print("==============" + classSet + "===============");
    };
}
