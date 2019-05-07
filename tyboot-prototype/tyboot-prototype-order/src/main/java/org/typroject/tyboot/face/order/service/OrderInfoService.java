package org.typroject.tyboot.face.order.service;


import org.springframework.stereotype.Component;
import org.typroject.tyboot.core.foundation.context.RequestContext;
import org.typroject.tyboot.core.rdbms.service.BaseService;
import org.typroject.tyboot.face.order.model.OrderInfoModel;
import org.typroject.tyboot.face.order.orm.dao.OrderInfoMapper;
import org.typroject.tyboot.face.order.orm.entity.OrderInfo;
import org.typroject.tyboot.prototype.order.constants.OrderConstants;

import java.util.Date;
import java.util.List;


/**
 * <p>
 * 订单主表，订单流转所需的主要字段。
 * 在订单流转结束之后将被转移到订单历史表，当前表只保存流转中的订单信息 服务类
 * </p>
 *
 * @author 子杨
 * @since 2018-01-14
 */
@Component
public class OrderInfoService extends BaseService<OrderInfoModel, OrderInfo, OrderInfoMapper> {


    public OrderInfoModel createOrderInfo(OrderInfoModel orderInfoModel) throws Exception {
        //创建订单
        orderInfoModel.setUserId(RequestContext.getExeUserId());
        orderInfoModel.setCreateTime(new Date());
        orderInfoModel.setPayStatus(OrderConstants.PAYSTATUS_WAITTINGPAYMENT);
        return this.createWithModel(orderInfoModel);
    }


    public OrderInfoModel queryByOrderSn(String orderSn) throws Exception {
        return this.queryModelByParams(orderSn);
    }


    public List<OrderInfoModel> queryByBillNo(String billNo) throws Exception {
        return this.queryForList(null, false, billNo);
    }

    public OrderInfoModel queryByWithStatus(String userId, String orderSn, String orderStatus) throws Exception {
        return this.queryModelByParams(userId, orderSn, orderStatus);
    }


}
