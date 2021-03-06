package com.huboot.account.payment.dto;

import java.io.Serializable;
import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.math.BigDecimal;

/**
 *支付订单表
 */
@Data
public class PaymentOrderQueryReqDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@ApiModelProperty("创建时间")
	private LocalDateTime createTime ;
	@ApiModelProperty("更新时间")
	private LocalDateTime modifyTime ;
	@ApiModelProperty("支付单类型")
	private String type ;
	@ApiModelProperty("编号")
	private String sn ;
	@ApiModelProperty("付钱方子账户")
	private Long fromSubAccount ;
	@ApiModelProperty("收钱方子账户")
	private Long toSubAccount ;
	@ApiModelProperty("系统")
	private String system ;
	@ApiModelProperty("交易金额")
	private BigDecimal amount ;
	@ApiModelProperty("状态")
	private String status ;
	@ApiModelProperty("过期时间")
	private LocalDateTime expireTime ;
	@ApiModelProperty("成功付款后是否需要冻结资金")
	private String freezeAfterPaid ;
	@ApiModelProperty("退款关联支付单号")
	private String refundRelaPaySn ;
	@ApiModelProperty("成功支付流水id")
	private Long successPayseqId ;
	@ApiModelProperty("页码")
	private Integer page = 0;
	@ApiModelProperty("条数")
	private Integer size = 10;

}

