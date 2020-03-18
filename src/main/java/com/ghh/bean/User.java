package com.ghh.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class User implements Serializable {
    private Integer sid;
    private String sname;
    private String gender;
    private String hobby;
    private String degree;
    private String mark;
}
