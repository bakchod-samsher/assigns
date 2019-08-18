package come.clientside.models;




import org.springframework.beans.factory.annotation.Autowired;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Student {


	private long studentId;
	private String studentName;
	private String section;
	private String fatherName;
	
	@Autowired
	private Address address;
}
