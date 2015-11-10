package hibernate.example;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type")
@Table(name="step")
@Entity
public abstract class Step implements Serializable {

    private static final long serialVersionUID = 8369533460395605833L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    protected Integer id;
    
    @ManyToOne
    private Step parent;
    
    public Integer getId() {
		return id;
	}
    
    public void setId(Integer id) {
		this.id = id;
	}
    
    public Step getParent() {
        return parent;
    }
    
    public Step setParent(Step parent) {
        this.parent = parent;
        return this;
    }
}
