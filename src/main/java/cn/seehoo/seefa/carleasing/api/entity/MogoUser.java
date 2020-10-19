package cn.seehoo.seefa.carleasing.api.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *  mogo用户表
 *
 * @author lix
 * @since 2020-08-27
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MogoUser implements Serializable {

	private static final long serialVersionUID = 6817207964825023209L;
	/**
	 * 请求类型
	 */
	private String type;
	/**
	 * 登陆用户编号
	 */
	@NotBlank(message = "登陆用户编号不能为空")
	private String tlrno;
	/**
	 * 用户名
	 */
	@NotBlank(message = "用户名不能为空")
	private String tlrName;
	/**
	 * 机构代码
	 */
	private String brcode;
	/**
	 * 密码
	 */
	@NotBlank(message = "密码不能为空")
	private String password;
	/**
	 * 登陆状态
	 *
	 * 0-已退出
	 * 1-已登陆
	 */
	private String status;
	/**
	 * 有效状态
	 *
	 * 0-无效
	 * 1-有效
	 */
	@NotBlank(message = "有效状态不能为空")
	private String flag;
	/**
	 * 密码错误次数
	 */
	private BigDecimal pswderrcnt;
	/**
	 * 总共密码错误次数
	 */
	private BigDecimal totpswderrcnt;
	/**
	 * 密码加密方式
	 *
	 * MD5
	 */
	@NotBlank(message = "加密方式不能为空")
	private String passwdenc;
	/**
	 * 锁定状态
	 *
	 * 0-未锁定
	 * 1-已锁定
	 */
	@NotBlank(message = "锁定状态不能为空")
	private String isLock;
	/**
	 * 是否修改被锁定状态
	 *
	 * 0-未
	 * 1-已
	 */
	private String isLockModify;
	/**
	 * 记录状态
	 *
	 * 1-创建中
	 * 2-修改中
	 * 3-删除中
	 * 4-可用
	 */
	@NotBlank(message = "记录状态不能为空")
	private String st;
	/**
	 * 手机号
	 */
	@NotBlank(message = "手机号不能为空")
	private String phone;
	/**
	 * 启用标识
	 *
	 * 1-启用
	 * 0-禁用
	 */
	@NotBlank(message = "启用标识不能为空")
	private String removeFlag;
	/**
	 * 操作日期
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date operatdate;

	/**岗位编号集合*/
	private List<Integer> roleId;
}
