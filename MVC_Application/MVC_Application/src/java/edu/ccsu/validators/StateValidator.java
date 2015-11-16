/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.validators;


import edu.ccsu.beans.Customer;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class StateValidator implements ConstraintValidator<State, Customer> {

    @Override
    public void initialize(State constraintAnnotation) {
    }

    @Override
    public boolean isValid(Customer value, ConstraintValidatorContext context) {
        if (value == null) {
            return false;
        }

        if (value.getUsstate() == null) {
            return false;
        }
        
        if (value.getUsstate().length() != 2) {
            return false;
        }
        
        return true;
    }
}