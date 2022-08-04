public class God {

    // Data members
    private String name;
    private String role;
    private String conquest;
    private String dmg;
    private String att;
    private String pantheon;
    private String continent;
    private int order;
    

    // Constructor
    public God(String n, String r, String q, String d, String a, String p, String t, int o) {
        name = n;
        setRole(r);
        setConquest(q);
        setDmg(d);
        setAtt(a);
        setPantheon(p);
        setContinent(t);
        setOrder(o);
    }

    // Getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public String getConquest() {
		return conquest;
	}
	public void setConquest(String conquest) {
		this.conquest = conquest;
	}

	public String getDmg() {
		return dmg;
	}
	public void setDmg(String dmg) {
		this.dmg = dmg;
	}

	public String getAtt() {
		return att;
	}
	public void setAtt(String att) {
		this.att = att;
	}

	public String getPantheon() {
		return pantheon;
	}
	public void setPantheon(String pantheon) {
		this.pantheon = pantheon;
	}

	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}

	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}

}