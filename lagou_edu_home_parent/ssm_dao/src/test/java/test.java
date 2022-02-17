/*
import com.lagou.dao.PromotionSpaceMapper;
import com.lagou.domain.PromotionSpace;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.UUID;

public class test {

    @Test
    public void test8() throws IOException {

        InputStream resourceAsStream = Resources.getResourceAsStream("applicationContext-dao.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 当前返回的 其实是基于UserMapper所产生的代理对象：底层：JDK动态代理 实际类型：proxy
        PromotionSpaceMapper mapper = sqlSession.getMapper(PromotionSpaceMapper.class);

        PromotionSpace promotionSpace = new PromotionSpace();
        promotionSpace.setSpaceKey(UUID.randomUUID().toString());
        promotionSpace.setName("新增测试");
        Date date = new Date();
        promotionSpace.setCreateTime(date);
        promotionSpace.setUpdateTime(date);
        promotionSpace.setIsDel(0);

        System.out.println(promotionSpace);
        mapper.savePromotionSpace(promotionSpace);
        System.out.println(promotionSpace);

        sqlSession.commit();
        sqlSession.close();

    }
}
*/
