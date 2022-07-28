package io.whysff.community.dao;

import io.whysff.community.entity.LoginTicket;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author lxstart  Email:liuxuan1021@126.com
 * @create 2022/07/28
 */
@SpringBootTest
public class LoginTicketMapperTest {

    @Autowired
    private LoginTicketMapper loginTicketMapper;

    @Test
    public void testInsertLoginTicket() {
        LoginTicket ticket = new LoginTicket();
        ticket.setExpired(new Date());
        ticket.setStatus(0);
        ticket.setUserId(150);
        ticket.setTicket("5555555");
        int effectedNum = loginTicketMapper.insertLoginTicket(ticket);
        assertEquals(1,effectedNum);
    }

    @Test
    public void testSelectByTicket() {
        LoginTicket ticket = loginTicketMapper.selectByTicket("5555555");
        assertEquals(150,ticket.getUserId());
    }

    @Test
    public void testUpdateStatus() {
        int effectedNum = loginTicketMapper.updateStatus("5555555", 1);
        assertEquals(1,effectedNum);
    }
}
