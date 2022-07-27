package io.whysff.community.dao;

import io.whysff.community.entity.DiscussPost;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class DiscussPostMapperTest {

    @Autowired
    private DiscussPostMapper discussPostMapper;

    @Test
    public void testSelectDiscussPosts() {
        List<DiscussPost> discussPostList = discussPostMapper.selectDiscussPosts(0, 0, 10);
        for (DiscussPost post : discussPostList) {
            System.out.println("post = " + post);
        }

        int i = discussPostMapper.selectDiscussPostRows(0);
        System.out.println("i = " + i);
    }
}
