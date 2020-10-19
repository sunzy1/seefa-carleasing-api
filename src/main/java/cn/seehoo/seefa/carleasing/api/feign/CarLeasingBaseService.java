/*
 *
 *      Copyright (c) 2018-2025, seefa All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 *  this list of conditions and the following disclaimer.
 *  Redistributions in binary form must reproduce the above copyright
 *  notice, this list of conditions and the following disclaimer in the
 *  documentation and/or other materials provided with the distribution.
 *  Neither the name of the pig4cloud.com developer nor the names of its
 *  contributors may be used to endorse or promote products derived from
 *  this software without specific prior written permission.
 *  Author: seefa
 *
 */

package cn.seehoo.seefa.carleasing.api.feign;

import cn.seehoo.seefa.carleasing.api.entity.MogoDept;
import cn.seehoo.seefa.carleasing.api.entity.MogoRole;
import cn.seehoo.seefa.carleasing.api.entity.MogoUser;
import cn.seehoo.seefa.carleasing.api.model.MogoRoleMenuDto;
import cn.seehoo.seefa.common.core.constant.SecurityConstants;
import cn.seehoo.seefa.common.core.util.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import static cn.seehoo.seefa.carleasing.api.constant.Constant.CAR_LEASING;

/**
 * @author seefa
 * @date 2018/6/22
 */
@FeignClient(contextId = "carLeasingBaseService", value = CAR_LEASING)
public interface CarLeasingBaseService {
    /**
     * seefa操作部门同步到 mogo
     *
     * @param dept 操作类型：add/delete/update
     * @param from 用于辨识接口访问是否是内部访问
     * @return
     */
    @PostMapping("/mogo/api/dataSync/mogoDept/operate")
    R info(@RequestBody MogoDept dept,
           @RequestHeader(SecurityConstants.FROM) String from);

    /**
     * seefa操作人员同步到 mogo
     *
     * @param user
     * @param from
     * @return
     */
    @PostMapping("/mogo/api/dataSync/mogoUser/operate")
    R info(@RequestBody MogoUser user,
           @RequestHeader(SecurityConstants.FROM) String from);

    /**
     * seefa操作角色同步到 mogo
     *
     * @param role 角色实体类
     * @param from
     * @return
     */
    @PostMapping("/mogo/api/dataSync/mogoRole/operate")
    R info(@RequestBody MogoRole role,
           @RequestHeader(SecurityConstants.FROM) String from);

    /**
     * seefa操作角色菜单到 mogo
     *
     * @param roleMenuDto
     * @param from
     * @return
     */
    @PostMapping("/mogo/api/dataSync/mogoRoleMenu/operate")
    R info(@RequestBody MogoRoleMenuDto roleMenuDto,
           @RequestHeader(SecurityConstants.FROM) String from);

}
