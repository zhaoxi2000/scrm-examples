package me.zhaoxi.scrm.domain;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhaoxi linzuxiong1988@gmail.com
 */
@Data
public class Customer {
    private static final Logger logger = LoggerFactory.getLogger(Customer.class);


    private long identity = 0L;
}
