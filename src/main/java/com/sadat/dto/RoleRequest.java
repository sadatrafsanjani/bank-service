package com.sadat.dto;

import lombok.*;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class RoleRequest {

    private Long menuId;
    private Set<Long> menus;
}
