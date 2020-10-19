package cn.seehoo.seefa.carleasing.api.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 *  mogo岗位表
 *  岗位管理
 *
 * @author lix
 * @date 2020-08-27
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MogoRole implements Serializable {
	/**
	 * 序列化ID
	 */
	private static final long serialVersionUID = 5778647830495089229L;
	/**
     * 请求类型
	 */
	private String type;
	/**
	 * 岗位ID
	 */
	private Integer roleId;

	@NotBlank(message = "岗位名称不能为空")
	private String roleName;

	@NotBlank(message = "有效状态不能为空")
	private String status;

	@NotBlank(message = "岗位是否被锁不能为空")
	private String isLock;

	@NotBlank(message = "岗位状态不能为空")
	private String st;

}
