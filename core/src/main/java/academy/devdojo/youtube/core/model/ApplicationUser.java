package academy.devdojo.youtube.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ApplicationUser implements AbstractEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @EqualsAndHashCode.Include
  private Long id;

  @NotNull(message = "The field 'title' is mandatory")
  @Column
  private String title;

  @NotNull(message = "The field 'username' is mandatory")
  @Column
  private String username;

  @NotNull(message = "The field 'password' is mandatory")
  @Column
  private String password;

  @Override
  public Long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getUsername() {
    return title;
  }

  public String getPassword() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void setPassword(String password) {
    this.password = password;
  }

}
