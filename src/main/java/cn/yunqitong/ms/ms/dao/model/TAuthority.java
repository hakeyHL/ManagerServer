package cn.yunqitong.ms.ms.dao.model;

public class TAuthority {
	//标记该权限是否已经属于该用户
	private int used;
	
    private String authorityid;

    private String reqUrl;

    private String isParent;

    private String parent;

    private Integer rank;

    private String resourceName;
    
    
    public int getUsed() {
		return used;
	}

	public void setUsed(int used) {
		this.used = used;
	}

	public String getAuthorityid() {
        return authorityid;
    }

    public void setAuthorityid(String authorityid) {
        this.authorityid = authorityid == null ? null : authorityid.trim();
    }

    public String getReqUrl() {
        return reqUrl;
    }

    public void setReqUrl(String reqUrl) {
        this.reqUrl = reqUrl == null ? null : reqUrl.trim();
    }

    public String getIsParent() {
        return isParent;
    }

    public void setIsParent(String isParent) {
        this.isParent = isParent == null ? null : isParent.trim();
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent == null ? null : parent.trim();
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName == null ? null : resourceName.trim();
    }
}