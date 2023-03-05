package com.badges.badges;

import com.badges.badges.mapper.TestMapper;
import com.badges.badges.pojo.VO.TestVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MapperTest {

    @Autowired
    private TestMapper testMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<TestVo> userList = testMapper.selectList(null);
        assertEquals(3, userList.size());
        userList.forEach(System.out::println);
    }
}
