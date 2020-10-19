package cn.seehoo.seefa.carleasing.api.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

/**
 * 	mogo organization
 *
 * @author lix
 * @since 2020-08-27
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MogoDept implements Serializable {

	private static final long serialVersionUID = -4479223231604076977L;
	/**
	 * 请求类型
	 */
	private String type;
	/**
	 * 分公司代码
	 */
	@NotBlank(message = "分公司代码不能为空")
	private String brcode;
	/**
	 * 分公司号码
	 */
	@NotBlank(message = "分公司号码不能为空")
	private String brno;
	/**
	 * 分公司名称
	 */
	@NotBlank(message = "分公司名称不能为空")
	private String brname;
	/**
	 * 分公司简称
	 */
	@NotBlank(message = "分公司简称不能为空")
	private String brabb;
	/**
	 * 分公司层级
	 */
	@NotBlank(message = "分公司层级不能为空")
	private String brclass;
	/**
	 * 上级机构代码
	 */
	@NotBlank(message = "上级机构代码不能为空")
	private String blnUpBrcode;
	/**
	 * 操作日期
	 */
	@NotBlank(message = "操作日期不能为空")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date operatdate;
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
	 * 是否被锁 T/F
	 */
	@NotBlank(message = "是否被锁不能为空")
	private String isLock;
	/**
	 * 是否删除 T/F
	 */
	@NotBlank(message = "是否删除不能为空")
	private String isDel;
	/**
	 * 启用标识
     *
     * 0-未启用
     * 1-已启用
	 */
	@NotBlank(message = "启用标识不能为空")
	private String removeFlag;
	/**
	 * 有效标识
     *
     * 0-无效
     * 1-有效
	 */
	@NotBlank(message = "有效标识不能为空")
	private String status;
}
