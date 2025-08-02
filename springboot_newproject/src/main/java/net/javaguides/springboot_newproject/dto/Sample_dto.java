package net.javaguides.springboot_newproject.dto;

public class Sample_dto {


	 	private Long id;

	    private String name;
	    private String email;

	    public Sample_dto() {}

	    public Sample_dto(Long id,String name, String email) {
	    	this.id=id;
	        this.name = name;
	        this.email = email;
	    }
	    
	    public Sample_dto(String name, String email) {
	    	this.name = name;
	        this.email = email;
	    }

	    // Getters and Setters
	
	    public String getName() { return name; }
	    public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public void setName(String name) { this.name = name; }

	    public String getEmail() { return email; }
	    public void setEmail(String email) { this.email = email; }
	}


