package me.zhaoxi.scrm.application;

import me.zhaoxi.scrm.application.dto.HeadquartersDTO;
import me.zhaoxi.scrm.application.dto.ShopDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhaoxi linzuxiong1988@gmail.com
 */
public class BusinessSideService {
    private static final Logger logger = LoggerFactory.getLogger(BusinessSideService.class);


    /**
     * 因为跨语言的技术框架限制可能导致不支持多态方法(同方法名不同的参数)
     *
     * @param shopDTO
     */
    public void createShop(ShopDTO shopDTO) {
    }

    /**
     * 因为跨语言的技术框架限制可能导致不支持多态方法(同方法名不同的参数)
     *
     * @param headquarters
     */
    public void createHeadquarters(HeadquartersDTO headquarters) {
    }

    /**
     * @param shopDTO
     * @param headquartersDTO != null
     */
    public void create(ShopDTO shopDTO, HeadquartersDTO headquartersDTO) {
        if (headquartersDTO == null) {
            throw new IllegalArgumentException("HeadquartersDTO is empty");
        }
    }

    public void create(ShopDTO shop) {

    }

    public void create(HeadquartersDTO headquartersDTO) {

    }
}
