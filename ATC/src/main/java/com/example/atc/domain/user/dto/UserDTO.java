package com.example.atc.domain.user.dto;

import com.example.atc.domain.user.entity.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UserDTO {
    private Long userId;
    private Long  categoryId;
    private Double height, weight, /*calSum, carSum,*/ totalCo2, totalCalorie;
    private int totalPoint;
    private String memberId, userPw,nickname;

}
