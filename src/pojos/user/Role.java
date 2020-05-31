package pojos.user;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity

@Table(name = "roles")

public class Role implements Serializable {

	/**
	
		 * 
	
		 */

	private static final long serialVersionUID = -1261426541853140664L;
	@Id
	@GeneratedValue(generator = "roles")
	@TableGenerator(name = "roles", table = "sqlite_sequence", pkColumnName = "name", valueColumnName = "seq", pkColumnValue = "roles")
	private int id;
	private String role;
	@OneToMany(mappedBy = "roles")
	private List<User> users;

	public Role() {
		super();
	}

	public Role(String roleName) {
		this.role = roleName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)

			return true;

		if (obj == null)

			return false;

		if (getClass() != obj.getClass())

			return false;

		Role other = (Role) obj;

		if (id != other.id)

			return false;

		return true;

	}

	@Override

	public String toString() {

		return "Role [id=" + id + ", role=" + role + "]";
	}
}
