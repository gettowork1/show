package com.yznu.shixun.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * 管理员
 */
@NoArgsConstructor
@AllArgsConstructor
@Component
@Data
public class admin {
    private String admin_name;//管理员姓名
    private String admin_password;//管理员密码
}
