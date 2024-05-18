package com.example.RegisterLogin.Response;

public class LoginMesage {
    String message;
    Boolean status;

   public LoginMesage()
   {
	   
   }

    public LoginMesage(String message, Boolean status) {
        this.message = message;
        this.status = status;
    }

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "LoginMesage [message=" + message + ", status=" + status + "]";
	}
    
    
}
