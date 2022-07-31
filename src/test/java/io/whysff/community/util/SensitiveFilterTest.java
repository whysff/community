package io.whysff.community.util;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author lxstart  Email:liuxuan1021@126.com
 * @create 2022/07/31
 */
@SpringBootTest
public class SensitiveFilterTest {

    @Autowired
    private SensitiveFilter sensitiveFilter;

    @Test
    public void testSensitiveFilter() {

        String text = "这里可以∝吸∝∝毒∝，∝嫖∝娼∝，∝赌∝博∝和∝开∝票∝,嘿嘿嘿";
        String filter = sensitiveFilter.filter(text);
        System.out.println("filter = " + filter);
    }

}
