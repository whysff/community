package io.whysff.community.util;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author lxstart  Email:liuxuan1021@126.com
 * @create 2022/07/27
 */
@SpringBootTest
public class MailClientTest {

    @Autowired
    private MailClient mailClient;

    @Test
    public void testSentMail() {
        mailClient.sendMail("15670151791@126.com","test","hello mail");
    }
}
