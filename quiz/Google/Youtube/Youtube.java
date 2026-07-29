package Google.Youtube;

public class Youtube{
	
	public String owner;
	public String currentCEO;
	public String contentType;

	public Youtube(String owner , String currentCEO , String contentType){
		this.owner = owner;
		this.currentCEO = currentCEO;
		this.contentType = contentType;
	}
	
	public void youtubeDetails(){
		System.out.println("Owner : " + owner);
		System.out.println("Current CEO : " + currentCEO);
		System.out.println("Content Type : " + contentType);
	}

}
