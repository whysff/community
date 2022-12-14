package io.whysff.community.dao;

import io.whysff.community.entity.LoginTicket;
import org.apache.ibatis.annotations.*;

/**
 * @author lxstart  Email:liuxuan1021@126.com
 * @create 2022/07/28
 */
@Mapper
public interface LoginTicketMapper {
    @Insert({
            "insert into login_ticket (user_id,ticket,status,expired) ",
            "values (#{userId},#{ticket},#{status},#{expired})"
    })
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertLoginTicket(LoginTicket loginTicket);

    @Select({
            "select id,user_id,ticket,status,expired ",
            "from login_ticket where ticket = #{ticket}"
    })
    LoginTicket selectByTicket(String ticket);

    @Update({
            "update login_ticket set status = #{status} where ticket = #{ticket}"
    })
    int updateStatus(String ticket, int status);
}
