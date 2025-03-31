package com.spring.api.payload.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class GetRequest<T> {
    private String requestId;
    private String sessionId;
    private List<T> data;
}
