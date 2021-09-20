package in.nit.surya.model;

import javax.persistence.Column;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

	@Id
	@Column(name = "SID")
	private Integer sid;
	@Column(name = "sname")
	private String sname;
}
