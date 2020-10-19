package cn.seehoo.seefa.carleasing.api.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 菜单更新的dto
 *
 * @author suncp
 * @date 2020/9/2 10:12
 */
@Data
public class MogoRoleMenuDto implements Serializable {

    /**
     * 序列化ID
     */
    private static final long serialVersionUID = -3041274308797539193L;
    /**
     * 角色ID
     */
    private Integer roleId;
    /**
     * 菜单列表
     */
    private String menuIds;
}
