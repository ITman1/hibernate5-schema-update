package hibernate.example;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@DiscriminatorValue("group")
@Entity
public class GroupStep extends Step {

    private static final long serialVersionUID = -6829389610910578013L;

    @OneToMany(mappedBy="parent")
    private List<Step> steps;
    
    public List<Step> getSteps() {
		return steps;
	}
    
    public void setSteps(List<Step> steps) {
		this.steps = steps;
	}
}
