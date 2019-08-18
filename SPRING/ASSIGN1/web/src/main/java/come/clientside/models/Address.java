package come.clientside.models;





import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Address {
	
	private String cityName;
	private String StreetName;
	private long pinCode;
	

}
