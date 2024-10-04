package com.david.di.crud.apirest.validations;

import com.david.di.crud.apirest.services.ProductService;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IsExistDbValidation implements ConstraintValidator<IsExistDb,String> {

    @Autowired
    private ProductService service;

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(service == null){
            return true;
        }
        return !service.existsByName(s);
    }
}
