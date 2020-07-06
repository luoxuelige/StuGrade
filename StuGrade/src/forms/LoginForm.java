package forms;

public class LoginForm {
	
//登入表单的表单bean
		private String username ;
		private String password;
		private int shenfen;

		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}

		public int getShenfen() {
			return shenfen;
		}
		public void setShenfen(int shenfen) {
			this.shenfen = shenfen;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		
}
