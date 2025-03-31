package com.spring.api.payload.request;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UpdateRequest<T> implements Serializable {
    private String requestId;
    private String sessionId;
    private List<T> data;
}
