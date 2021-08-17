package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// 繼承用，當有多個model有共同的變數，可以把共同的變數集中在這裡再引用
@MappedSuperclass
@Getter
@Setter
@Entity
public abstract class BaseEntity implements Serializable
{

}
