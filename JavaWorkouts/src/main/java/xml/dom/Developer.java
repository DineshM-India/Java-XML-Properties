package xml.dom;

public class Developer {
	String id;
	String name;
	String language;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	@Override
    public String toString() {
        return "Developer [id=" + id + ", Name=" + name + ", Programming Language=" + language + "]";
    }
}
