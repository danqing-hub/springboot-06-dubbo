package com.danqing.user.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.danqing.ticket.service.TicketService;
import org.springframework.stereotype.Service;

/**
 * @author 丹青
 * @date 2020/4/29-10:33
 */
@Service//spring的注解
public class UserService {

    @Reference//远程引用（dubbo）
    TicketService ticketService;

    public void hello(){
        String ticket = ticketService.getTicket();
        System.out.println("买到票了："+ticket);
    }

}
