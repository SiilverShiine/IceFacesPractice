package scopePractice;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import java.io.Serializable;

@ManagedBean(name = "applicantController")
@ApplicationScoped
public class ApplicantController implements Serializable {

    @Override
    public String toString() {
        return "jobApplication" + super.toString();
    }
}