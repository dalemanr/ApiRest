package com.david.di.crud.apirest.security;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class SimpleGRantedAuthorityJsonCreator {

    @JsonCreator
    public SimpleGRantedAuthorityJsonCreator(@JsonProperty("authority")  String role){
    }
}
