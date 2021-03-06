package com.sadat.dto.banking;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ProductResponse {

    private Long id;
    private String type;
    private String code;
    private String name;
}
