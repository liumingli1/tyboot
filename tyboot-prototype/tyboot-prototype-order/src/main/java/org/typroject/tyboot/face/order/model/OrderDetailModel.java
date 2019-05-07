package org.typroject.tyboot.face.order.model;

import org.typroject.tyboot.core.rdbms.model.BaseModel;

/**
 * <p>
 * 订单详细信息子表；
保存订单相关的明细信息包括：用户名称，昵称，商品名称，商品总数，商家明细信息，订单提交和支付附言等 model
 * </p>
 *
 * @author 子杨
 * @since 2018-01-14
 */
public class OrderDetailModel extends BaseModel {

    private static final long serialVersionUID = 1L;

                /**
         * 订单的编号（全局唯一）
         */
    private String orderSn;
                /**
         * 公网用户姓名
         */
    private String userName;
                /**
         * 商品名称西文逗号分割
         */
    private String productNames;
                /**
         * 客户类型（0非会员,1会员,2其它）
         */
    private String customerType;
                /**
         * 订单附言
         */
    private String orderPostscript;
                /**
         * 付款备注
         */
    private String payNote;




public String getOrderSn() {
return orderSn;
}

    public void setOrderSn(String orderSn) {
this.orderSn = orderSn;
}

public String getUserName() {
return userName;
}

    public void setUserName(String userName) {
this.userName = userName;
}

public String getProductNames() {
return productNames;
}

    public void setProductNames(String productNames) {
this.productNames = productNames;
}

public String getCustomerType() {
return customerType;
}

    public void setCustomerType(String customerType) {
this.customerType = customerType;
}

public String getOrderPostscript() {
return orderPostscript;
}

    public void setOrderPostscript(String orderPostscript) {
this.orderPostscript = orderPostscript;
}

public String getPayNote() {
return payNote;
}

    public void setPayNote(String payNote) {
this.payNote = payNote;
}
	
}
