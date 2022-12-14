package com.innocamp.dduha.domain.information.dto.response;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class UsefulInfoResponseDto {
    private String category;
    List<InfoResponseDto> info;
}
