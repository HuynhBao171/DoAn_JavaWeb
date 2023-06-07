package Nhom15.spring.DoAn.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "icon")
    private String icon;

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
}
