package com.danqing.ticket.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author 丹青
 * @date 2020/4/29-10:24
 */

@Component//加到容器中
@Service//dubbo的service
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "《厉害了，我的国》";
    }
}
