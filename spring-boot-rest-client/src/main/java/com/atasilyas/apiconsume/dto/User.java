package com.atasilyas.apiconsume.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.HashMap;

@Data
@EqualsAndHashCode(of = {"id"})
public class User implements Serializable {

    private String name;
    private String sName;
    private HashMap otherSpec;
}
