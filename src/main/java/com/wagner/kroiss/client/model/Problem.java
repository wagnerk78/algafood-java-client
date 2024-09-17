package com.wagner.kroiss.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class Problem {

    private Integer status;

   private String timestamp;

    private String userMessage;


    @Data
    public static class Object {

        private String name;
        private String userMessage;

    }

    private List<Object> objects = new ArrayList<>();
}