package Nhom15.spring.DoAn.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "code")
    private String code;

    @Column(name = "description")
    private String description;

    @Column(name = "detail")
    private String detail;

    @Column(name = "image")
    private String image;

    @Column(name = "price")
    private Double price;

    @Column(name = "pricesale")
    private Double pricesale;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "ishome")
    private Boolean ishome;

    @Column(name = "issale")
    private Boolean issale;

    @Column(name = "isfeature")
    private Boolean isfeature;

    @Column(name = "ishot")
    private Boolean ishot;

    @Column(name = "catgoryid")
    private Integer categoryid;

    @Column(name = "seotitle")
    private String seotitle;

    @Column(name = "seodescription")
    private String seodescription;

    @Column(name = "seokeyword")
    private String seokeyword;

    @Column(name = "createdby")
    private String createdby;

    @Column(name = "createdate")
    private Date createdate;

    @Column(name = "modifiedby")
    private String modifiedby;

    @Column(name = "modifydate")
    private Date modifydate;

    @Column(name = "alias")
    private String alias;

    @Column(name = "isactive")
    private Boolean isactive;

    @Column(name = "viewcount")
    private Integer viewcount;

    @Column(name = "originalprice")
    private Double originalprice;
}
