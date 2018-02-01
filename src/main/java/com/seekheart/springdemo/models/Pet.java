package com.seekheart.springdemo.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "PET")
public class Pet {
  @Id
  @GeneratedValue
  private Long id;

  @Column(name = "SPECIES")
  private String species;

  @Column(name = "NAME")
  private String name;

  @JsonIgnore
  @ManyToMany(cascade = CascadeType.ALL)
  @JoinTable(name = "HUMAN_PET", joinColumns = @JoinColumn(name = "PET_ID", referencedColumnName
      = "ID"), inverseJoinColumns = @JoinColumn(name = "HUMAN_ID", referencedColumnName = "ID") )
  private Set<Human> owners;
}
