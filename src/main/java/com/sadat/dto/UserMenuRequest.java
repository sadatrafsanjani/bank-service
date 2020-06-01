package com.sadat.dto;

import lombok.*;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserMenuRequest {

    private Set<Long> menus;
}
