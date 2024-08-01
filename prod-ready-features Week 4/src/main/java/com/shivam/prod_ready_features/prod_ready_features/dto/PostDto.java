package com.shivam.prod_ready_features.prod_ready_features.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostDto {

    private Long Id;
    private String title;

    private String description;
}
