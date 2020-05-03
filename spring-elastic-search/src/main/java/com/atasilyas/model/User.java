package com.atasilyas.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

@Document(indexName = "users" , type = "user")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {

    @Id
    private String id;

    @Field(name = "name", type = FieldType.Text)
    private String name;

    @Field(name = "surname", type = FieldType.Text)
    private String sName;

    @Field(name = "address", type = FieldType.Text)
    private String address;

    @Field(name = "name", type = FieldType.Date)
    private Date  birthDate;

}
