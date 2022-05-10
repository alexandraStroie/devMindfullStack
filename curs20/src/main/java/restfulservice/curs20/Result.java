package restfulservice.curs20;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "results")
@Data
public class Result {

    @Id
    private Long id;

    @Column(name = "currency")
    public double currency;

    @Column(name = "lpg")
    public double lpg;

    @Column(name = "diesel")
    public double diesel;

    @Column(name = "gasoline")
    public double gasoline;

    @Column(name = "country")
    public String country;
}
