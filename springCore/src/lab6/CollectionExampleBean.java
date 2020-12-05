package lab6;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionExampleBean {
	private Properties emails;
	private List menuList;
	private Map userIds;
	private Set subjects;
	
	public Properties getEmails() {
		return emails;
	}
	public void setEmails(Properties emails) {
		this.emails = emails;
	}
	public List getMenuList() {
		return menuList;
	}
	public void setMenuList(List menuList) {
		this.menuList = menuList;
	}
	public Map getUserIds() {
		return userIds;
	}
	public void setUserIds(Map userIds) {
		this.userIds = userIds;
	}
	public Set getSubjects() {
		return subjects;
	}
	public void setSubjects(Set subjects) {
		this.subjects = subjects;
	}
	
	
}
