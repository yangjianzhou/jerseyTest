package service;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by yangjianzhou on 16-4-16.
 */

@ContextConfiguration({"classpath:applicationContext-test.xml" , "classpath:dataSource-test.xml"})
public abstract class BaseServiceTest extends AbstractJUnit4SpringContextTests{
}
