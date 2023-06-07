//package Nhom15.spring.DoAn.validator;
//
//import Nhom15.spring.DoAn.entity.User;
//import Nhom15.spring.DoAn.validator.annotation.ValidUserId;
//import jakarta.validation.ConstraintValidator;
//import jakarta.validation.ConstraintValidatorContext;
//
//public class ValidUserIdValidator implements ConstraintValidator<ValidUserId, User> {
//
//    @Override
//    public boolean isValid(User user, ConstraintValidatorContext constraintValidatorContext) {
//        if(user == null)
//            return true;
//        return user.getId() != null;
//    }
//}
