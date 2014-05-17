package models;
//Se o id é 0, é candidato. Se o id é 

public class User {

	private String email;
	private String senha;
	private int id;
	
	public User(String email, String senha, int id) {
		this.email = email;
		this.senha = senha;
		this.id = id;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}



	public void setEmail(String email) {
		this.email = email;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setId(int id){
		this.id = id;
	}
<<<<<<< HEAD
<<<<<<< HEAD
	
	public boolean equals(User u) {
        if (u.getId() == this.id) {
            return true;
        } else {
            return false;
        }
    }
=======

>>>>>>> fe8309730806b02c1ec3b8fe803c88ff70ba57bd
=======

>>>>>>> fe8309730806b02c1ec3b8fe803c88ff70ba57bd
}