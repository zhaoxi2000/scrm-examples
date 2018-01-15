package me.zhaoxi.scrm.domain.repo;

import me.zhaoxi.scrm.domain.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

/**
 * @author zhaoxi linzuxiong1988@gmail.com
 */
public class CustomerRepo {
    private static final Logger logger = LoggerFactory.getLogger(CustomerRepo.class);

    public void newIdentity(Customer newCustomer) {
        final long id = UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE;
        newCustomer.setIdentity(id);
    }
}
