//package Nhom15.spring.DoAn.entity;
//
//import jakarta.persistence.*;
//import jakarta.validation.constraints.NotBlank;
//import lombok.Data;
//
//import java.math.BigDecimal;
//import java.time.LocalDateTime;
//
//@Data
//@Entity
//@Table(name = "order")
//public class Order {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    @NotBlank
//    @Column(name = "code")
//    private String code;
//
//    @NotBlank
//    @Column(name = "customerName")
//    private String customerName;
//
//    @NotBlank
//    @Column(name = "phone")
//    private String phone;
//
//    @NotBlank
//    @Column(name = "address")
//    private String address;
//
//    @Column(name = "totalAmount")
//    private BigDecimal totalAmount;
//
//    @Column(name = "quantity")
//    private int quantity;
//
//    @Column(name = "createdBy")
//    private String createdBy;
//
//    @Column(name = "createDate")
//    private LocalDateTime createDate;
//
//    @Column(name = "modifiedDate")
//    private LocalDateTime modifiedDate;
//
//    @Column(name = "modifiedby")
//    private String modifiedBy;
//
//    @Column(name = "typePayment")
//    private int typePayment;
//
//    @Column(name = "email")
//    private String email;
//
//}
