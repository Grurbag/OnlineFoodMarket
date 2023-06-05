package biathlonStats.entity;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.*;

@Entity
@Table(name = "sportsman", schema = "biathlonstats1")
public class Sportsman {

  @Id
  @GenericGenerator(name = "increment", strategy = "increment")
  @GeneratedValue(strategy=GenerationType.AUTO)
  private long idsportsman;
  private String name;
  private String surname;
  private String sex;
  private String region;
  private String institution;
  private String rank;
  private String birthdate;

  public Sportsman() {
  }

  public Sportsman(long idSportsman, String name, String surname, String sex, String region, String institution, String rank, String birthDate) {
    this.idsportsman = idSportsman;
    this.name = name;
    this.surname = surname;
    this.sex = sex;
    this.region = region;
    this.institution = institution;
    this.rank = rank;
    this.birthdate = birthDate;
  }

  public Sportsman(String string) {
    String[] parameters = string.split(";");
    parameters[0] = parameters[0].replace("[","");
    parameters[7] = parameters[7].replace("]","");
    //String [] parameters1 = parameters[0].split("\\[");
    this.idsportsman = Long.parseLong(parameters[0]);
    this.name = parameters[1];
    this.surname = parameters[2];
    this.sex = parameters[3];
    this.region = parameters[4];
    this.institution = parameters[5];
    this.rank = parameters[6];
    this.birthdate = parameters[7];
  }

  public long getId_sportsman() {
    return idsportsman;
  }

  public String getName() {
    return name;
  }

  public String getSurname() {
    return surname;
  }

  public String getSex() {
    return sex;
  }

  public String getRegion() {
    return region;
  }

  public String getInstitution() {
    return institution;
  }

  public String getRank() {
    return rank;
  }

  public String getBirthdate() {
    return birthdate;
  }

  public void setId_sportsman(long id_sportsman) {
    this.idsportsman = id_sportsman;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public void setInstitution(String institution) {
    this.institution = institution;
  }

  public void setRank(String rank) {
    this.rank = rank;
  }

  public void setBirthdate(String birthdate) {
    this.birthdate = birthdate;
  }

  @Override
    public  String toString() {
      return idsportsman + ";" + name + ";" + surname + ";" + sex + ";" + region + ";" + institution + ";" + rank + ";" + birthdate;
  }
}