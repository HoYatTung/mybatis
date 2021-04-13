package com.gethin.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author heridong
 * @create 2021/4/13 10:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    private long id;
    private String roleName;
    private String note;
}
